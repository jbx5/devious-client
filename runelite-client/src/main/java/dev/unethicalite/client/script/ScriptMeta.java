package dev.unethicalite.client.script;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ScriptMeta
{
	String value();

	String version() default "0.0.1";
}
