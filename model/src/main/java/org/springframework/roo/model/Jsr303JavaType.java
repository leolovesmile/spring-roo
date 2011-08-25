package org.springframework.roo.model;

/**
 * Constants for JSR303-specific {@link JavaType}s.
 * 
 * Use them in preference to creating new instances of these types.
 *
 * @author Alan
 * @since 1.2.0
	 */
public final class Jsr303JavaType {

	// Literal class names are used to avoid dependencies upon the relevant addons.
	
	public static final JavaType ASSERT_FALSE = new JavaType("javax.validation.constraints.AssertFalse");
	public static final JavaType ASSERT_TRUE = new JavaType("javax.validation.constraints.AssertTrue");
	public static final JavaType DECIMAL_MIN = new JavaType("javax.validation.constraints.DecimalMin");
	public static final JavaType DECIMAL_MAX = new JavaType("javax.validation.constraints.DecimalMax");
	public static final JavaType DIGITS = new JavaType("javax.validation.constraints.Digits");
	public static final JavaType FUTURE = new JavaType("javax.validation.constraints.Future");
	public static final JavaType MAX = new JavaType("javax.validation.constraints.Max");
	public static final JavaType MIN = new JavaType("javax.validation.constraints.Min");
	public static final JavaType NOT_NULL = new JavaType("javax.validation.constraints.NotNull");
	public static final JavaType NULL = new JavaType("javax.validation.constraints.Null");
	public static final JavaType PAST = new JavaType("javax.validation.constraints.Past");
	public static final JavaType PATTERN = new JavaType("javax.validation.constraints.Pattern");
	public static final JavaType SIZE = new JavaType("javax.validation.constraints.Size");
	public static final JavaType VALID = new JavaType("javax.validation.Valid");

	/**
	 * Constructor is private to prevent instantiation
	 */
	private Jsr303JavaType() {}
}