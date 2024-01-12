import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class226 implements class29 {
	@ObfuscatedName("am")
	char[] field2396;
	@ObfuscatedName("ap")
	int[] field2405;
	@ObfuscatedName("af")
	public int[] field2395;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -844324777
	)
	public int field2398;
	@ObfuscatedName("aq")
	int[] field2397;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1321322991
	)
	int field2406;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 744994077
	)
	int field2399;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1334306143
	)
	int field2400;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2140438645
	)
	int field2401;
	@ObfuscatedName("aa")
	boolean[] field2394;
	@ObfuscatedName("au")
	boolean[] field2403;
	@ObfuscatedName("an")
	boolean[] field2404;
	@ObfuscatedName("ad")
	public char field2402;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1069270687
	)
	public int field2393;

	public class226() {
		this.field2396 = new char[128];
		this.field2405 = new int[128];
		this.field2395 = new int[128];
		this.field2398 = 0;
		this.field2397 = new int[128];
		this.field2406 = 0;
		this.field2399 = 0;
		this.field2400 = 0;
		this.field2401 = 0;
		this.field2394 = new boolean[112];
		this.field2403 = new boolean[112];
		this.field2404 = new boolean[112];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1871329380"
	)
	public boolean vmethod4418(int var1) {
		this.method4419(var1);
		this.field2394[var1] = true;
		this.field2403[var1] = true;
		this.field2404[var1] = false;
		this.field2395[++this.field2398 - 1] = var1;
		return true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-139541289"
	)
	public boolean vmethod4460(int var1) {
		this.field2394[var1] = false;
		this.field2403[var1] = false;
		this.field2404[var1] = true;
		this.field2397[++this.field2406 - 1] = var1;
		return true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "47"
	)
	public boolean vmethod4420(char var1) {
		int var2 = this.field2400 + 1 & 127;
		if (var2 != this.field2399) {
			this.field2405[this.field2400] = -1;
			this.field2396[this.field2400] = var1;
			this.field2400 = var2;
		}

		return false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1335637558"
	)
	public boolean vmethod4422(boolean var1) {
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-24043"
	)
	void method4419(int var1) {
		int var2 = this.field2400 + 1 & 127;
		if (var2 != this.field2399) {
			this.field2405[this.field2400] = var1;
			this.field2396[this.field2400] = 0;
			this.field2400 = var2;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1963588904"
	)
	public void method4423() {
		this.field2399 = this.field2401;
		this.field2401 = this.field2400;
		this.field2398 = 0;
		this.field2406 = 0;
		Arrays.fill(this.field2403, false);
		Arrays.fill(this.field2404, false);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2069084072"
	)
	public final boolean method4424() {
		if (this.field2401 == this.field2399) {
			return false;
		} else {
			this.field2393 = this.field2405[this.field2399];
			this.field2402 = this.field2396[this.field2399];
			this.field2399 = this.field2399 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-154278805"
	)
	public boolean method4425(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2403[var1] : false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1220986892"
	)
	public boolean method4426(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2394[var1] : false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1889375277"
	)
	public boolean method4427(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2404[var1] : false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "2"
	)
	public int[] method4428() {
		int[] var1 = new int[this.field2398];

		for (int var2 = 0; var2 < this.field2398; ++var2) {
			var1[var2] = this.field2395[var2];
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1550935564"
	)
	public int[] method4429() {
		int[] var1 = new int[this.field2406];

		for (int var2 = 0; var2 < this.field2406; ++var2) {
			var1[var2] = this.field2397[var2];
		}

		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;IZS)Lky;",
		garbageValue = "141"
	)
	public static Frames method4463(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-4"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}
}
