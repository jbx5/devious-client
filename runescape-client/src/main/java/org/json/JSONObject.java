package org.json;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.rs.Reflection;

@Implements("JSONObject")
public class JSONObject {
	public static final Object NULL;
	@Export("properties")
	Map properties;

	static {
		NULL = new JSONObject$Null();
	}

	public JSONObject() {
		this.properties = new HashMap();
	}

	public JSONObject(JSONTokener var1) throws JSONException {
		this();
		if (var1.nextClean() != '{') {
			throw var1.syntaxError("A JSONObject text must begin with '{'");
		} else {
			while (true) {
				char var2 = var1.nextClean();
				switch(var2) {
				case '\u0000':
					throw var1.syntaxError("A JSONObject text must end with '}'");
				case '}':
					return;
				default:
					var1.back();
					String var3 = var1.nextValue().toString();
					var2 = var1.nextClean();
					if (var2 == '=') {
						if (var1.next() != '>') {
							var1.back();
						}
					} else if (var2 != ':') {
						throw var1.syntaxError("Expected a ':' after a key");
					}

					this.putOnce(var3, var1.nextValue());
					switch(var1.nextClean()) {
					case ',':
					case ';':
						if (var1.nextClean() == '}') {
							return;
						}

						var1.back();
						break;
					case '}':
						return;
					default:
						throw var1.syntaxError("Expected a ',' or '}'");
					}
				}
			}
		}
	}

	public JSONObject(String var1) throws JSONException {
		this(new JSONTokener(var1));
	}

	public JSONObject(Object var1, boolean var2) {
		this();
		this.populateInternalMap(var1, var2);
	}

	public JSONObject(Map var1) {
		this.properties = (Map)(var1 == null ? new HashMap() : var1);
	}

	public JSONObject(Map var1, boolean var2) {
		this.properties = new HashMap();
		if (var1 != null) {
			Iterator var3 = var1.entrySet().iterator();

			while (var3.hasNext()) {
				Entry var4 = (Entry)var3.next();
				this.properties.put(var4.getKey(), new JSONObject(var4.getValue(), var2));
			}
		}

	}

	public Object method10132(String var1) {
		return var1 == null ? null : this.properties.get(var1);
	}

	public Object method10129(String var1) throws JSONException {
		Object var2 = this.method10132(var1);
		if (var2 == null) {
			throw new JSONException("JSONObject[" + quote(var1) + "] not found.");
		} else {
			return var2;
		}
	}

	@Export("setProperty")
	public JSONObject setProperty(String var1, Object var2) throws JSONException {
		if (var1 == null) {
			throw new JSONException("Null key.");
		} else {
			if (var2 != null) {
				testValidity(var2);
				this.properties.put(var1, var2);
			} else {
				this.remove(var1);
			}

			return this;
		}
	}

	public boolean optBoolean(String var1, boolean var2) {
		try {
			return this.getBoolean(var1);
		} catch (Exception var4) {
			return var2;
		}
	}

	public double optDouble(String var1, double var2) {
		try {
			Object var4 = this.method10132(var1);
			return var4 instanceof Number ? ((Number)var4).doubleValue() : new Double((String)var4);
		} catch (Exception var5) {
			return var2;
		}
	}

	public long optLong(String var1, long var2) {
		try {
			return this.getLong(var1);
		} catch (Exception var5) {
			return var2;
		}
	}

	public boolean getBoolean(String var1) throws JSONException {
		Object var2 = this.method10129(var1);
		if (var2.equals(Boolean.FALSE) || var2 instanceof String && ((String)var2).equalsIgnoreCase("false")) {
			return false;
		} else if (var2.equals(Boolean.TRUE) || var2 instanceof String && ((String)var2).equalsIgnoreCase("true")) {
			return true;
		} else {
			throw new JSONException("JSONObject[" + quote(var1) + "] is not a Boolean.");
		}
	}

	public int optInt(String var1, int var2) {
		try {
			return this.getInt(var1);
		} catch (Exception var4) {
			return var2;
		}
	}

	public long getLong(String var1) throws JSONException {
		Object var2 = this.method10129(var1);
		return var2 instanceof Number ? ((Number)var2).longValue() : (long)this.getDouble(var1);
	}

	public String optString(String var1, String var2) {
		Object var3 = this.method10132(var1);
		return var3 != null ? var3.toString() : var2;
	}

	public Iterator keys() {
		return this.properties.keySet().iterator();
	}

	String toString(int var1, int var2) throws JSONException {
		int var4 = this.length();
		if (var4 == 0) {
			return "{}";
		} else {
			Iterator var5 = this.sortedKeys();
			StringBuffer var6 = new StringBuffer("{");
			int var7 = var2 + var1;
			Object var8;
			if (var4 == 1) {
				var8 = var5.next();
				var6.append(quote(var8.toString()));
				var6.append(": ");
				var6.append(valueToString(this.properties.get(var8), var1, var2));
			} else {
				while (true) {
					int var3;
					if (!var5.hasNext()) {
						if (var6.length() > 1) {
							var6.append('\n');

							for (var3 = 0; var3 < var2; ++var3) {
								var6.append(' ');
							}
						}
						break;
					}

					var8 = var5.next();
					if (var6.length() > 1) {
						var6.append(",\n");
					} else {
						var6.append('\n');
					}

					for (var3 = 0; var3 < var7; ++var3) {
						var6.append(' ');
					}

					var6.append(quote(var8.toString()));
					var6.append(": ");
					var6.append(valueToString(this.properties.get(var8), var1, var7));
				}
			}

			var6.append('}');
			return var6.toString();
		}
	}

	public int getInt(String var1) throws JSONException {
		Object var2 = this.method10129(var1);
		return var2 instanceof Number ? ((Number)var2).intValue() : (int)this.getDouble(var1);
	}

	public int length() {
		return this.properties.size();
	}

	public JSONArray getJSONArray(String var1) throws JSONException {
		Object var2 = this.method10129(var1);
		if (var2 instanceof JSONArray) {
			return (JSONArray)var2;
		} else {
			throw new JSONException("JSONObject[" + quote(var1) + "] is not a JSONArray.");
		}
	}

	public JSONObject getJSONObject(String var1) throws JSONException {
		Object var2 = this.method10129(var1);
		if (var2 instanceof JSONObject) {
			return (JSONObject)var2;
		} else {
			throw new JSONException("JSONObject[" + quote(var1) + "] is not a JSONObject.");
		}
	}

	void populateInternalMap(Object var1, boolean var2) {
		Class var3 = var1.getClass();
		if (var3.getClassLoader() == null) {
			var2 = false;
		}

		Method[] var4 = var2 ? var3.getMethods() : var3.getDeclaredMethods();

		for (int var5 = 0; var5 < var4.length; ++var5) {
			try {
				Method var6 = var4[var5];
				String var7 = Reflection.getMethodName(var6);
				String var8 = "";
				if (var7.startsWith("get")) {
					var8 = var7.substring(3);
				} else if (var7.startsWith("is")) {
					var8 = var7.substring(2);
				}

				if (var8.length() > 0 && Character.isUpperCase(var8.charAt(0)) && Reflection.getParameterTypes(var6).length == 0) {
					if (var8.length() == 1) {
						var8 = var8.toLowerCase();
					} else if (!Character.isUpperCase(var8.charAt(1))) {
						var8 = var8.substring(0, 1).toLowerCase() + var8.substring(1);
					}

					Object var9 = Reflection.invoke(var6, var1, (Object[])null);
					if (var9 == null) {
						this.properties.put(var8, NULL);
					} else if (var9.getClass().isArray()) {
						this.properties.put(var8, new JSONArray(var9, var2));
					} else if (var9 instanceof Collection) {
						this.properties.put(var8, new JSONArray((Collection)var9, var2));
					} else if (var9 instanceof Map) {
						this.properties.put(var8, new JSONObject((Map)var9, var2));
					} else if (this.isStandardProperty(var9.getClass())) {
						this.properties.put(var8, var9);
					} else if (!var9.getClass().getPackage().getName().startsWith("java") && var9.getClass().getClassLoader() != null) {
						this.properties.put(var8, new JSONObject(var9, var2));
					} else {
						this.properties.put(var8, var9.toString());
					}
				}
			} catch (Exception var10) {
				throw new RuntimeException(var10);
			}
		}

	}

	public String optString(String var1) {
		return this.optString(var1, "");
	}

	public Object remove(String var1) {
		return this.properties.remove(var1);
	}

	public String getString(String var1) throws JSONException {
		return this.method10129(var1).toString();
	}

	public Iterator sortedKeys() {
		return (new TreeSet(this.properties.keySet())).iterator();
	}

	public double getDouble(String var1) throws JSONException {
		Object var2 = this.method10129(var1);

		try {
			return var2 instanceof Number ? ((Number)var2).doubleValue() : Double.valueOf((String)var2);
		} catch (Exception var4) {
			throw new JSONException("JSONObject[" + quote(var1) + "] is not a number.");
		}
	}

	public int optInt(String var1) {
		return this.optInt(var1, 0);
	}

	public Writer write(Writer var1) throws JSONException {
		try {
			boolean var2 = false;
			Iterator var3 = this.keys();
			var1.write(123);

			for (; var3.hasNext(); var2 = true) {
				if (var2) {
					var1.write(44);
				}

				Object var4 = var3.next();
				var1.write(quote(var4.toString()));
				var1.write(58);
				Object var5 = this.properties.get(var4);
				if (var5 instanceof JSONObject) {
					((JSONObject)var5).write(var1);
				} else if (var5 instanceof JSONArray) {
					((JSONArray)var5).write(var1);
				} else {
					var1.write(valueToString(var5));
				}
			}

			var1.write(125);
			return var1;
		} catch (IOException var7) {
			throw new JSONException(var7);
		}
	}

	public String toString() {
		try {
			Iterator var1 = this.keys();
			StringBuffer var2 = new StringBuffer("{");

			while (var1.hasNext()) {
				if (var2.length() > 1) {
					var2.append(',');
				}

				Object var3 = var1.next();
				var2.append(quote(var3.toString()));
				var2.append(':');
				var2.append(valueToString(this.properties.get(var3)));
			}

			var2.append('}');
			return var2.toString();
		} catch (Exception var4) {
			return null;
		}
	}

	public JSONObject optJSONObject(String var1) {
		Object var2 = this.method10132(var1);
		return var2 instanceof JSONObject ? (JSONObject)var2 : null;
	}

	public JSONObject putOnce(String var1, Object var2) throws JSONException {
		if (var1 != null && var2 != null) {
			if (this.method10132(var1) != null) {
				throw new JSONException("Duplicate key \"" + var1 + "\"");
			}

			this.setProperty(var1, var2);
		}

		return this;
	}

	boolean isStandardProperty(Class var1) {
		return var1.isPrimitive() || var1.isAssignableFrom(Byte.class) || var1.isAssignableFrom(Short.class) || var1.isAssignableFrom(Integer.class) || var1.isAssignableFrom(Long.class) || var1.isAssignableFrom(Float.class) || var1.isAssignableFrom(Double.class) || var1.isAssignableFrom(Character.class) || var1.isAssignableFrom(String.class) || var1.isAssignableFrom(Boolean.class);
	}

	public JSONObject accumulate(String var1, Object var2) throws JSONException {
		testValidity(var2);
		Object var3 = this.method10132(var1);
		if (var3 == null) {
			this.setProperty(var1, var2 instanceof JSONArray ? (new JSONArray()).method10149(var2) : var2);
		} else if (var3 instanceof JSONArray) {
			((JSONArray)var3).method10149(var2);
		} else {
			this.setProperty(var1, (new JSONArray()).method10149(var3).method10149(var2));
		}

		return this;
	}

	public JSONObject append(String var1, Object var2) throws JSONException {
		testValidity(var2);
		Object var3 = this.method10132(var1);
		if (var3 == null) {
			this.setProperty(var1, (new JSONArray()).method10149(var2));
		} else {
			if (!(var3 instanceof JSONArray)) {
				throw new JSONException("JSONObject[" + var1 + "] is not a JSONArray.");
			}

			this.setProperty(var1, ((JSONArray)var3).method10149(var2));
		}

		return this;
	}

	public long optLong(String var1) {
		return this.optLong(var1, 0L);
	}

	public boolean isNull(String var1) {
		return NULL.equals(this.method10132(var1));
	}

	public JSONArray names() {
		JSONArray var1 = new JSONArray();
		Iterator var2 = this.keys();

		while (var2.hasNext()) {
			var1.method10149(var2.next());
		}

		return var1.length() == 0 ? null : var1;
	}

	public double optDouble(String var1) {
		return this.optDouble(var1, Double.NaN);
	}

	public JSONArray optJSONArray(String var1) {
		Object var2 = this.method10132(var1);
		return var2 instanceof JSONArray ? (JSONArray)var2 : null;
	}

	public boolean optBoolean(String var1) {
		return this.optBoolean(var1, false);
	}

	public String toString(int var1) throws JSONException {
		return this.toString(var1, 0);
	}

	public JSONObject putOpt(String var1, Object var2) throws JSONException {
		if (var1 != null && var2 != null) {
			this.setProperty(var1, var2);
		}

		return this;
	}

	public JSONArray toJSONArray(JSONArray var1) throws JSONException {
		if (var1 != null && var1.length() != 0) {
			JSONArray var2 = new JSONArray();

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				var2.method10149(this.method10132(var1.getString(var3)));
			}

			return var2;
		} else {
			return null;
		}
	}

	public static String[] getNames(JSONObject var0) {
		int var1 = var0.length();
		if (var1 == 0) {
			return null;
		} else {
			Iterator var2 = var0.keys();
			String[] var3 = new String[var1];

			for (int var4 = 0; var2.hasNext(); ++var4) {
				var3[var4] = (String)var2.next();
			}

			return var3;
		}
	}

	static void testValidity(Object var0) throws JSONException {
		if (var0 != null) {
			if (var0 instanceof Double) {
				if (((Double)var0).isInfinite() || ((Double)var0).isNaN()) {
					throw new JSONException("JSON does not allow non-finite numbers.");
				}
			} else if (var0 instanceof Float && (((Float)var0).isInfinite() || ((Float)var0).isNaN())) {
				throw new JSONException("JSON does not allow non-finite numbers.");
			}
		}

	}

	public static String numberToString(Number var0) throws JSONException {
		if (var0 == null) {
			throw new JSONException("Null pointer");
		} else {
			testValidity(var0);
			String var1 = var0.toString();
			if (var1.indexOf(46) > 0 && var1.indexOf(101) < 0 && var1.indexOf(69) < 0) {
				while (var1.endsWith("0")) {
					var1 = var1.substring(0, var1.length() - 1);
				}

				if (var1.endsWith(".")) {
					var1 = var1.substring(0, var1.length() - 1);
				}
			}

			return var1;
		}
	}

	public static String quote(String var0) {
		if (var0 != null && var0.length() != 0) {
			char var2 = 0;
			int var4 = var0.length();
			StringBuffer var5 = new StringBuffer(var4 + 4);
			var5.append('"');

			for (int var3 = 0; var3 < var4; ++var3) {
				char var1 = var2;
				var2 = var0.charAt(var3);
				switch(var2) {
				case '\b':
					var5.append("\\b");
					continue;
				case '\t':
					var5.append("\\t");
					continue;
				case '\n':
					var5.append("\\n");
					continue;
				case '\f':
					var5.append("\\f");
					continue;
				case '\r':
					var5.append("\\r");
					continue;
				case '"':
				case '\\':
					var5.append('\\');
					var5.append(var2);
					continue;
				case '/':
					if (var1 == '<') {
						var5.append('\\');
					}

					var5.append(var2);
					continue;
				}

				if (var2 >= ' ' && (var2 < 128 || var2 >= 160) && (var2 < 8192 || var2 >= 8448)) {
					var5.append(var2);
				} else {
					String var6 = "000" + Integer.toHexString(var2);
					var5.append("\\u" + var6.substring(var6.length() - 4));
				}
			}

			var5.append('"');
			return var5.toString();
		} else {
			return "\"\"";
		}
	}

	static String valueToString(Object var0) throws JSONException {
		if (var0 != null && !var0.equals((Object)null)) {
			if (var0 instanceof JSONString) {
				String var1;
				try {
					var1 = ((JSONString)var0).toJSONString();
				} catch (Exception var3) {
					throw new JSONException(var3);
				}

				if (var1 instanceof String) {
					return (String)var1;
				} else {
					throw new JSONException("Bad value from toJSONString: " + var1);
				}
			} else if (var0 instanceof Number) {
				return numberToString((Number)var0);
			} else if (!(var0 instanceof Boolean) && !(var0 instanceof JSONObject) && !(var0 instanceof JSONArray)) {
				if (var0 instanceof Map) {
					return (new JSONObject((Map)var0)).toString();
				} else if (var0 instanceof Collection) {
					return (new JSONArray((Collection)var0)).toString();
				} else {
					return var0.getClass().isArray() ? (new JSONArray(var0)).toString() : quote(var0.toString());
				}
			} else {
				return var0.toString();
			}
		} else {
			return "null";
		}
	}

	static String valueToString(Object var0, int var1, int var2) throws JSONException {
		if (var0 != null && !var0.equals((Object)null)) {
			try {
				if (var0 instanceof JSONString) {
					String var3 = ((JSONString)var0).toJSONString();
					if (var3 instanceof String) {
						return (String)var3;
					}
				}
			} catch (Exception var4) {
			}

			if (var0 instanceof Number) {
				return numberToString((Number)var0);
			} else if (var0 instanceof Boolean) {
				return var0.toString();
			} else if (var0 instanceof JSONObject) {
				return ((JSONObject)var0).toString(var1, var2);
			} else if (var0 instanceof JSONArray) {
				return ((JSONArray)var0).toString(var1, var2);
			} else if (var0 instanceof Map) {
				return (new JSONObject((Map)var0)).toString(var1, var2);
			} else if (var0 instanceof Collection) {
				return (new JSONArray((Collection)var0)).toString(var1, var2);
			} else {
				return var0.getClass().isArray() ? (new JSONArray(var0)).toString(var1, var2) : quote(var0.toString());
			}
		} else {
			return "null";
		}
	}

	public static Object stringToValue(String var0) {
		if (var0.equals("")) {
			return var0;
		} else if (var0.equalsIgnoreCase("true")) {
			return Boolean.TRUE;
		} else if (var0.equalsIgnoreCase("false")) {
			return Boolean.FALSE;
		} else if (var0.equalsIgnoreCase("null")) {
			return NULL;
		} else {
			char var1 = var0.charAt(0);
			if (var1 >= '0' && var1 <= '9' || var1 == '.' || var1 == '-' || var1 == '+') {
				if (var1 == '0') {
					if (var0.length() > 2 && (var0.charAt(1) == 'x' || var0.charAt(1) == 'X')) {
						try {
							return new Integer(Integer.parseInt(var0.substring(2), 16));
						} catch (Exception var9) {
						}
					} else {
						try {
							return new Integer(Integer.parseInt(var0, 8));
						} catch (Exception var8) {
						}
					}
				}

				try {
					return new Integer(var0);
				} catch (Exception var7) {
					try {
						return new Long(var0);
					} catch (Exception var6) {
						try {
							return new Double(var0);
						} catch (Exception var5) {
						}
					}
				}
			}

			return var0;
		}
	}

	public static String[] getNames(Object var0) {
		if (var0 == null) {
			return null;
		} else {
			Class var1 = var0.getClass();
			Field[] var2 = var1.getFields();
			int var3 = var2.length;
			if (var3 == 0) {
				return null;
			} else {
				String[] var4 = new String[var3];

				for (int var5 = 0; var5 < var3; ++var5) {
					var4[var5] = var2[var5].getName();
				}

				return var4;
			}
		}
	}

	public static String doubleToString(double var0) {
		if (!Double.isInfinite(var0) && !Double.isNaN(var0)) {
			String var2 = Double.toString(var0);
			if (var2.indexOf(46) > 0 && var2.indexOf(101) < 0 && var2.indexOf(69) < 0) {
				while (var2.endsWith("0")) {
					var2 = var2.substring(0, var2.length() - 1);
				}

				if (var2.endsWith(".")) {
					var2 = var2.substring(0, var2.length() - 1);
				}
			}

			return var2;
		} else {
			return "null";
		}
	}
}
