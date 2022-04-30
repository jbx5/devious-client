package dev.unethicalite.client.minimal.script;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@Retention(RetentionPolicy.RUNTIME)
public @interface ScriptMeta
{
	String value();

	String version() default "0.0.1";
}
