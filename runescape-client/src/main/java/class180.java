import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("gp")
public class class180 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	static final class180 field1917;
	@ObfuscatedName("az")
	String field1909;
	@ObfuscatedName("ah")
	String field1913;
	@ObfuscatedName("af")
	String field1916;
	@ObfuscatedName("at")
	String field1906;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -3940949976830180749L
	)
	long field1907;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	AsyncRestClient field1903;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	AsyncHttpResponse field1904;
	@ObfuscatedName("aw")
	final int field1910;
	@ObfuscatedName("ad")
	final int field1911;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1465554931
	)
	int field1912;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -264638889
	)
	int field1915;
	@ObfuscatedName("aj")
	String field1905;
	@ObfuscatedName("ay")
	boolean field1918;

	static {
		field1917 = new class180();
	}

	class180() {
		this.field1909 = "";
		this.field1913 = "";
		this.field1916 = "";
		this.field1906 = "";
		this.field1907 = -1L;
		this.field1910 = 1;
		this.field1911 = 2;
		this.field1912 = 1;
		this.field1915 = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-361176905"
	)
	public void method3576(int var1, String var2) {
		this.field1915 = var1;
		this.field1905 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1741686828"
	)
	public void method3589(boolean var1) {
		this.field1918 = var1;
		this.field1903 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1424753165"
	)
	void method3582(String var1, String var2, String var3) {
		if (this.field1912 != 2) {
			this.field1909 = var1;
			this.field1913 = var2;
			this.field1916 = var3;
			if (!this.field1909.endsWith("/")) {
				this.field1909 = this.field1909 + "/";
			}

			if (!this.field1913.equals("")) {
				String var4 = this.field1909;
				var4 = var4 + "session/open/" + this.field1913;
				if (this.field1916.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field1916;

				try {
					this.field1904 = this.method3558(var4);
					this.field1907 = VerticalAlignment.method3924();
				} catch (IOException var6) {
					this.field1904 = null;
					this.field1913 = "";
					this.field1916 = "";
				}

			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "166164695"
	)
	public void method3565() {
		if (this.field1904 == null) {
			if (!this.field1906.isEmpty() && this.field1912 == 1) {
				long var1 = VerticalAlignment.method3924();
				long var3 = var1 - this.field1907;
				String var5 = this.field1909;
				var5 = var5 + "session/close/" + this.field1913 + "/" + this.field1906;
				if (this.field1916.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field1916 + "&sessionDuration=" + var3;
				}

				try {
					this.field1904 = this.method3558(var5);
				} catch (IOException var7) {
					this.field1912 = 1;
				}
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1829839864"
	)
	public void method3561() {
		if (this.field1903 != null) {
			this.field1903.shutdown();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "882581124"
	)
	void method3562() {
		if (!this.field1906.isEmpty()) {
			String var1 = "";
			switch(this.field1915) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field1905.isEmpty()) {
				String var2 = this.field1909;
				var2 = var2 + var1 + "/" + this.field1913 + "/" + this.field1906 + "/" + this.field1905 + "?userHash=" + this.field1916;

				try {
					this.field1904 = this.method3558(var2);
				} catch (IOException var4) {
					this.field1912 = 1;
				}

				this.field1912 = 1;
				this.field1915 = 0;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1052922865"
	)
	public void method3563() {
		if (this.field1904 != null && this.field1904.hasFinished()) {
			if (this.field1904.hasFinished() && this.field1904.await().getResponseCode() == 200 && this.field1906.isEmpty()) {
				String var1 = this.field1904.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field1906 = var1;
			}

			if (this.field1915 != 0) {
				this.method3562();
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "974054455"
	)
	public boolean method3564(String var1) {
		this.method3576(2, var1);
		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lap;",
		garbageValue = "-1721427473"
	)
	AsyncHttpResponse method3558(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field1918);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field1903.submitRequest(var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-1500192028"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					Throwable var4 = var1;
					String var5;
					if (var1 instanceof RunException) {
						RunException var6 = (RunException)var1;
						var5 = var6.message + " | ";
						var4 = var6.throwable;
					} else {
						var5 = "";
					}

					StringWriter var18 = new StringWriter();
					PrintWriter var7 = new PrintWriter(var18);
					var4.printStackTrace(var7);
					var7.close();
					String var8 = var18.toString();
					BufferedReader var9 = new BufferedReader(new StringReader(var8));
					String var10 = var9.readLine();

					label63:
					while (true) {
						while (true) {
							String var11 = var9.readLine();
							if (var11 == null) {
								var5 = var5 + "| " + var10;
								var2 = var5;
								break label63;
							}

							int var12 = var11.indexOf(40);
							int var13 = var11.indexOf(41, var12 + 1);
							if (var12 >= 0 && var13 >= 0) {
								String var14 = var11.substring(var12 + 1, var13);
								int var15 = var14.indexOf(".java:");
								if (var15 >= 0) {
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
									var5 = var5 + var14 + ' ';
									continue;
								}

								var11 = var11.substring(0, var12);
							}

							var11 = var11.trim();
							var11 = var11.substring(var11.lastIndexOf(32) + 1);
							var11 = var11.substring(var11.lastIndexOf(9) + 1);
							var5 = var5 + var11 + ' ';
						}
					}
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + class73.field911 + "&u=" + RunException.field5389 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + WorldMapDecoration.field3118 + "&e=" + var2);
				DataInputStream var17 = new DataInputStream(var3.openStream());
				var17.read();
				var17.close();
			} catch (Exception var16) {
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-122"
	)
	public static void method3593() {
		class216.field1909.clear();
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	static final void method3594(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (UserComparator10.cameraPitch < var0) {
			UserComparator10.cameraPitch = (var0 - UserComparator10.cameraPitch) * CollisionMap.field2445 / 1000 + UserComparator10.cameraPitch + class440.field4745;
			if (UserComparator10.cameraPitch > var0) {
				UserComparator10.cameraPitch = var0;
			}
		} else if (UserComparator10.cameraPitch > var0) {
			UserComparator10.cameraPitch -= (UserComparator10.cameraPitch - var0) * CollisionMap.field2445 / 1000 + class440.field4745;
			if (UserComparator10.cameraPitch < var0) {
				UserComparator10.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - class17.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class17.cameraYaw = var2 * CollisionMap.field2445 / 1000 + class17.cameraYaw + class440.field4745;
			class17.cameraYaw &= 2047;
		} else if (var2 < 0) {
			class17.cameraYaw -= class440.field4745 + -var2 * CollisionMap.field2445 / 1000;
			class17.cameraYaw &= 2047;
		}

		int var3 = var1 - class17.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class17.cameraYaw = var1;
		}

	}
}
