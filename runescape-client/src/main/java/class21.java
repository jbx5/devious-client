import java.net.HttpURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import net.runelite.mapping.Export;
@ObfuscatedName("e")
public class class21 {
	@ObfuscatedName("r")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "Llj;")
	@Export("clientLanguage")
	static Language clientLanguage;

	@ObfuscatedName("ew")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive9")
	static Archive archive9;

	@ObfuscatedName("ir")
	@ObfuscatedSignature(descriptor = "Lqj;")
	@Export("compass")
	static SpritePixels compass;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -981203113)
	final int field118;

	@ObfuscatedName("q")
	final String field119;

	class21(String var1) {
		this.field118 = 400;
		this.field119 = "";
	}

	class21(HttpURLConnection var1) throws IOException {
		this.field118 = var1.getResponseCode();
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = (this.field118 >= 300) ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);
			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			} 
			var3.close();
		}
		this.field119 = var2.toString();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1834327023")
	public int method298() {
		return this.field118;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-539009770")
	public String method299() {
		return this.field119;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1347791250")
	public static int method302(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "238")
	static final boolean method303() {
		return Client.isMenuOpen;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "575130411")
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class293.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class17.runScriptEvent(var5);
		}
		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class113.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		Coord.selectedSpellFlags = var2;
		class220.invalidateWidget(var4);
	}
}