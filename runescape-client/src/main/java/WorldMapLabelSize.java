import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -298360831
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = -1507170361
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1794501215
	)
	final int field3044;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1291217647
	)
	final int field3045;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1813165403
	)
	final int field3046;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3044 = var1;
		this.field3045 = var2;
		this.field3046 = var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "94"
	)
	boolean method5485(float var1) {
		return var1 >= (float)this.field3046;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkr;",
		garbageValue = "57"
	)
	static WorldMapLabelSize[] method5490() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lpl;I)I",
		garbageValue = "-2146005653"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = Player.method2406(var9);
			var8 = Player.method2406(var10);
			var9 = ArchiveLoader.standardizeChar(var9, var2);
			var10 = ArchiveLoader.standardizeChar(var10, var2);
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return class329.lowercaseChar(var9, var2) - class329.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var12 != var11) {
					return class329.lowercaseChar(var11, var2) - class329.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var13 != var12) {
					return class329.lowercaseChar(var12, var2) - class329.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIB)V",
		garbageValue = "-105"
	)
	static final void method5493(class101 var0, int var1, int var2) {
		class166.method3440(var0, var0.field1348, var1, var2);
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldz;",
		garbageValue = "82"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		TaskHandler.method3581(var1);
		Widget var4 = AsyncRestClient.widgetDefinition.method6536(var0);
		class324.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class324.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class148.revalidateWidgetScroll(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		class7.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			SecureUrlRequester.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
