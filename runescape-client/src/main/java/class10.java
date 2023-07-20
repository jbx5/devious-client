import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
public class class10 {
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("aw")
	final HttpsURLConnection field49;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	final class420 field55;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class9 field48;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	class462 field50;
	@ObfuscatedName("as")
	boolean field51;
	@ObfuscatedName("aj")
	boolean field47;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2018066835
	)
	int field53;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lap;Lqb;Z)V"
	)
	public class10(URL var1, class9 var2, class420 var3, boolean var4) throws IOException {
		this.field51 = false;
		this.field47 = false;
		this.field53 = 300000;
		if (!var2.method69()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method73());
		} else {
			this.field49 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				HttpsURLConnection var5 = this.field49;
				if (class15.field83 == null) {
					class15.field83 = new class15();
				}

				class15 var6 = class15.field83;
				var5.setSSLSocketFactory(var6);
			}

			this.field48 = var2;
			this.field55 = var3 != null ? var3 : new class420();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lap;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class420(), var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lqb;",
		garbageValue = "1781094058"
	)
	public class420 method85() {
		return this.field55;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "446743890"
	)
	public void method86(class462 var1) {
		if (!this.field51) {
			if (var1 == null) {
				this.field55.method7762("Content-Type");
				this.field50 = null;
			} else {
				this.field50 = var1;
				if (this.field50.vmethod8417() != null) {
					this.field55.method7766(this.field50.vmethod8417());
				} else {
					this.field55.method7767();
				}

			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "188935179"
	)
	void method102() throws ProtocolException {
		if (!this.field51) {
			this.field49.setRequestMethod(this.field48.method73());
			this.field55.method7759(this.field49);
			if (this.field48.method71() && this.field50 != null) {
				this.field49.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.field50.vmethod8412());
					var1.writeTo(this.field49.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}

				}
			}

			this.field49.setConnectTimeout(this.field53);
			this.field49.setInstanceFollowRedirects(this.field47);
			this.field51 = true;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1249212417"
	)
	boolean method88() throws IOException {
		if (!this.field51) {
			this.method102();
		}

		this.field49.connect();
		return this.field49.getResponseCode() == -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lac;",
		garbageValue = "-1318308721"
	)
	class20 method89() {
		try {
			if (!this.field51 || this.field49.getResponseCode() == -1) {
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field49.disconnect();
			return new class20("Error decoding REST response code: " + var10.getMessage());
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field49);
			return var1;
		} catch (IOException var8) {
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field49.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;[II)[Ljava/lang/Object;",
		garbageValue = "-1294646917"
	)
	static Object[] method103(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart();
		Object[] var3 = new Object[var1.length * var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.length * var4 + var5;
				class503 var7 = class395.method7456(var1[var5]);
				var3[var6] = var7.method8938(var0);
			}
		}

		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1321398026"
	)
	static int method84(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class36.scriptDotWidget : class351.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1708450572"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Login.loadInterface(var0)) {
			ClanChannelMember.updateInterface(ArchiveLoader.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-517461757"
	)
	static void method100(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
