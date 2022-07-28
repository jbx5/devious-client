import net.runelite.mapping.ObfuscatedName;
import java.awt.Desktop.Action;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.Desktop;
import net.runelite.mapping.ObfuscatedGetter;
import java.net.URI;
import net.runelite.mapping.Export;
@ObfuscatedName("ig")
public class class238 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lig;")
	static final class238 field2836 = new class238(0);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lig;")
	static final class238 field2831 = new class238(1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lfl;")
	@Export("clock")
	static Clock clock;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1678125619)
	@Export("value")
	final int value;

	class238(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llj;I)I", garbageValue = "-829304695")
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;
		int var9;
		int var10;
		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}
			if (var6 - var8 >= var4) {
				return 1;
			}
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}
			var7 = ClanSettings.method2993(((char) (var9)));
			var8 = ClanSettings.method2993(((char) (var10)));
			var9 = GrandExchangeEvents.standardizeChar(((char) (var9)), var2);
			var10 = GrandExchangeEvents.standardizeChar(((char) (var10)), var2);
			if (var9 != var10 && Character.toUpperCase(((char) (var9))) != Character.toUpperCase(((char) (var10)))) {
				var9 = Character.toLowerCase(((char) (var9)));
				var10 = Character.toLowerCase(((char) (var10)));
				if (var10 != var9) {
					return PlayerCompositionColorTextureOverride.lowercaseChar(((char) (var9)), var2) - PlayerCompositionColorTextureOverride.lowercaseChar(((char) (var10)), var2);
				}
			}
		} 
		var9 = Math.min(var3, var4);
		int var11;
		char var12;
		for (var10 = 0; var10 < var9; ++var10) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var10;
				var6 = var4 - 1 - var10;
			} else {
				var6 = var10;
				var5 = var10;
			}
			var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var12 != var11 && Character.toUpperCase(((char) (var11))) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(((char) (var11)));
				var12 = Character.toLowerCase(var12);
				if (var11 != var12) {
					return PlayerCompositionColorTextureOverride.lowercaseChar(((char) (var11)), var2) - PlayerCompositionColorTextureOverride.lowercaseChar(var12, var2);
				}
			}
		}
		var10 = var3 - var4;
		if (var10 != 0) {
			return var10;
		} else {
			for (var11 = 0; var11 < var9; ++var11) {
				var12 = var0.charAt(var11);
				char var13 = var1.charAt(var11);
				if (var12 != var13) {
					return PlayerCompositionColorTextureOverride.lowercaseChar(var12, var2) - PlayerCompositionColorTextureOverride.lowercaseChar(var13, var2);
				}
			}
			return 0;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lgp;", garbageValue = "-1043159088")
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = ((ParamComposition) (ParamComposition.ParamDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZZB)V", garbageValue = "-31")
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}
			if (class29.field182.startsWith("win")) {
				FriendSystem.method1696(var0, 0, "openjs");
			} else if (class29.field182.startsWith("mac")) {
				FriendSystem.method1696(var0, 1, "openjs");
			} else {
				FriendSystem.method1696(var0, 2, "openjs");
			}
		} else {
			FriendSystem.method1696(var0, 3, "openjs");
		}
	}
}