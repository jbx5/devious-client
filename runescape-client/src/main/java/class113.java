import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eh")
public class class113 extends UrlRequester {
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("as")
	final boolean field1433;

	public class113(boolean var1, int var2) {
		super(var2);
		this.field1433 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)V",
		garbageValue = "-1617729938"
	)
	void vmethod2826(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		HttpURLConnection var12;
		label136: {
			label128: {
				try {
					label131: {
						var9 = true;
						String var3 = var1.field1436.getProtocol();
						if (var3.equals("http")) {
							var2 = this.method2827(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1437 = UrlRequest.field1441;
								var9 = false;
								break label131;
							}

							var2 = this.method2828(var1);
						}

						this.method2807(var2, var1);
						var9 = false;
						break label136;
					}
				} catch (IOException var10) {
					var1.field1437 = UrlRequest.field1441;
					var9 = false;
					break label128;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					HttpURLConnection var4 = (HttpURLConnection)var2;
					var4.disconnect();
				}

				return;
			}

			if (var2 != null && var2 instanceof HttpURLConnection) {
				var12 = (HttpURLConnection)var2;
				var12.disconnect();
			}

			return;
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)Ljava/net/URLConnection;",
		garbageValue = "1537364324"
	)
	URLConnection method2827(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1436.openConnection();
		this.method2806(var2);
		return var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)Ljava/net/URLConnection;",
		garbageValue = "-1919857679"
	)
	URLConnection method2828(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1436.openConnection();
		if (!this.field1433) {
			if (class15.field83 == null) {
				class15.field83 = new class15();
			}

			class15 var4 = class15.field83;
			var2.setSSLSocketFactory(var4);
		}

		this.method2806(var2);
		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2076508859"
	)
	public static final synchronized long method2835() {
		long var0 = System.currentTimeMillis();
		if (var0 < class302.field3368) {
			class302.field3369 += class302.field3368 - var0;
		}

		class302.field3368 = var0;
		return class302.field3369 + var0;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "35871473"
	)
	static int method2836(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					RouteStrategy.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class150.clientPreferences.method2487();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--Interpreter.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class150.clientPreferences.method2572(var3);
				}

				return 1;
			}
		}
	}
}
