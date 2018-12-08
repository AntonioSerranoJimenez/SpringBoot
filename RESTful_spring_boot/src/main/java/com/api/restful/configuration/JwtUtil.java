package com.api.restful.configuration;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

// TODO: Auto-generated Javadoc
/**
 * The Class JwtUtil.
 */
public class JwtUtil {

	static private String password = "MyPassword";
	
	/**
	 * Adds the authentication.
	 *
	 * @param response the response
	 * @param username the username
	 */
	static void addAuthentication(HttpServletResponse response, String username) {

		String token = Jwts.builder().setSubject(username)
				.signWith(SignatureAlgorithm.HS512, password) // Select algorithm
				.compact();

		// Add token to header
		response.addHeader("Authorization", "Bearer " + token);
	}

	/**
	 * Gets the authentication.
	 *
	 * @param request the request
	 * @return the authentication
	 */
	static Authentication getAuthentication(HttpServletRequest request) {

		// Read token from header
		String token = request.getHeader("Authorization");

		// Check token
		if (token != null) {

			String user = Jwts.parser().setSigningKey(password)
					.parseClaimsJws(token.replace("Bearer ", "")) // Remove added text
					.getBody()
					.getSubject();

			return user != null ? new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList()) : null;
		}

		return null;

	}
}
