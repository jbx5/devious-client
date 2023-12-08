import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements class487 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2076453113
	)
	int field4852;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 209809437
	)
	int field4853;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1622179703
	)
	int field4854;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lsb;",
		garbageValue = "-87"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (ClanChannel.osNameLowercase.startsWith("win")) {
			var1 = 1;
		} else if (ClanChannel.osNameLowercase.startsWith("mac")) {
			var1 = 2;
		} else if (ClanChannel.osNameLowercase.startsWith("linux")) {
			var1 = 3;
		} else {
			var1 = 4;
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var31) {
			var2 = "";
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var30) {
			var3 = "";
		}

		String var4 = "Unknown";
		String var5 = "1.1";

		try {
			var4 = System.getProperty("java.vendor");
			var5 = System.getProperty("java.version");
		} catch (Exception var29) {
		}

		boolean var28;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
			var28 = false;
		} else {
			var28 = true;
		}

		byte var7 = 0;
		if (var1 == 1) {
			if (var3.indexOf("4.0") != -1) {
				var7 = 1;
			} else if (var3.indexOf("4.1") != -1) {
				var7 = 2;
			} else if (var3.indexOf("4.9") != -1) {
				var7 = 3;
			} else if (var3.indexOf("5.0") != -1) {
				var7 = 4;
			} else if (var3.indexOf("5.1") != -1) {
				var7 = 5;
			} else if (var3.indexOf("5.2") != -1) {
				var7 = 8;
			} else if (var3.indexOf("6.0") != -1) {
				var7 = 6;
			} else if (var3.indexOf("6.1") != -1) {
				var7 = 7;
			} else if (var3.indexOf("6.2") != -1) {
				var7 = 9;
			} else if (var3.indexOf("6.3") != -1) {
				var7 = 10;
			} else if (var3.indexOf("10.0") != -1) {
				var7 = 11;
			}
		} else if (var1 == 2) {
			if (var3.indexOf("10.4") != -1) {
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) {
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) {
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) {
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) {
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) {
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var7 = 26;
			} else if (var3.indexOf("10.11") != -1) {
				var7 = 27;
			} else if (var3.indexOf("10.12") != -1) {
				var7 = 28;
			} else if (var3.indexOf("10.13") != -1) {
				var7 = 29;
			}
		}

		byte var8;
		if (var4.toLowerCase().indexOf("sun") != -1) {
			var8 = 1;
		} else if (var4.toLowerCase().indexOf("microsoft") != -1) {
			var8 = 2;
		} else if (var4.toLowerCase().indexOf("apple") != -1) {
			var8 = 3;
		} else if (var4.toLowerCase().indexOf("oracle") != -1) {
			var8 = 5;
		} else {
			var8 = 4;
		}

		this.method8625(var5);
		boolean var9 = false;
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var11;
		if (this.field4852 > 3) {
			var11 = Runtime.getRuntime().availableProcessors();
		} else {
			var11 = 0;
		}

		byte var12 = 0;
		String var13 = "";
		String var14 = "";
		String var15 = "";
		String var16 = "";
		String var17 = "";
		String var18 = "";
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		boolean var22 = false;
		int[] var23 = new int[3];
		boolean var24 = false;
		String var25 = "";
		String var26 = "";
		boolean var27 = false;
		return new PlatformInfo(var1, var28, var7, var8, this.field4852, this.field4853, this.field4854, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "");
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "118"
	)
	void method8625(String var1) {
		if (var1.startsWith("1.")) {
			this.method8626(var1);
		} else {
			this.method8627(var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "804463097"
	)
	void method8626(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field4852 = Integer.parseInt(var2[1]);
			var2 = var2[2].split("_");
			this.field4853 = Integer.parseInt(var2[0]);
			this.field4854 = Integer.parseInt(var2[1]);
		} catch (Exception var4) {
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "51"
	)
	void method8627(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field4852 = Integer.parseInt(var2[0]);
			this.field4853 = Integer.parseInt(var2[1]);
			this.field4854 = Integer.parseInt(var2[2]);
		} catch (Exception var4) {
		}

	}
}
