import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = -1960251493
	)
	static int field4983;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	final LoginType field4979;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field4979 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lse;",
		garbageValue = "-807171089"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)[Lse;",
		garbageValue = "1608525822"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "-2036547980"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field4979);
				boolean var11 = false;
				ItemContainer.friendSystem.removeIgnore(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field4979);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field4979);
				var1.readStringCp1252NullTerminated();
				if (!var5.hasCleanName()) {
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
				if (var4) {
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
					if (var8 != null && var8 != var7) {
						if (var7 != null) {
							this.remove(var8);
						} else {
							var7 = var8;
						}
					}
				}

				if (var7 != null) {
					this.changeName(var7, var5, var6);
				} else if (this.getSize() < 400) {
					int var9 = this.getSize();
					var7 = (Ignored)this.addLast(var5, var6);
					var7.id = var9;
				}
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)[B",
		garbageValue = "-116"
	)
	static byte[] method8937(String var0) {
		boolean var1 = true;
		boolean var2 = true;
		int var3 = "pattern".length();
		int var4 = 0;
		byte[] var5 = new byte[8];

		while (true) {
			int var6 = var3 + var4;
			if (var6 >= var0.length()) {
				return null;
			}

			char var7 = var0.charAt(var6);
			if (var7 == ':') {
				if (var4 == 0) {
					return null;
				}

				byte[] var8 = new byte[var4];
				System.arraycopy(var5, 0, var8, 0, var4);
				return var8;
			}

			if (var5.length == var4) {
				return null;
			}

			if (var7 >= '0' && var7 <= '9') {
				var7 = (char)(var7 - '0');
			} else {
				if (var7 < 'a' || var7 > 'z') {
					return null;
				}

				var7 = (char)(var7 - 'W');
			}

			var5[var4++] = (byte)var7;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lun;",
		garbageValue = "-62"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class197.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class197.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class188.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}
}
