import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("az")
	char[] field2433;
	@ObfuscatedName("ah")
	int[] field2429;
	@ObfuscatedName("af")
	public int[] field2432;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 84453187
	)
	public int field2431;
	@ObfuscatedName("an")
	int[] field2441;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -196340985
	)
	int field2430;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 646837141
	)
	int field2434;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 366454471
	)
	int field2435;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1628134909
	)
	int field2436;
	@ObfuscatedName("al")
	boolean[] field2437;
	@ObfuscatedName("as")
	boolean[] field2438;
	@ObfuscatedName("ag")
	boolean[] field2439;
	@ObfuscatedName("ai")
	public char field2428;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1730330137
	)
	public int field2440;

	public IndexCheck() {
		this.field2433 = new char[128];
		this.field2429 = new int[128];
		this.field2432 = new int[128];
		this.field2431 = 0;
		this.field2441 = new int[128];
		this.field2430 = 0;
		this.field2434 = 0;
		this.field2435 = 0;
		this.field2436 = 0;
		this.field2437 = new boolean[112];
		this.field2438 = new boolean[112];
		this.field2439 = new boolean[112];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "743662152"
	)
	public boolean vmethod4317(int var1) {
		this.method4313(var1);
		this.field2437[var1] = true;
		this.field2438[var1] = true;
		this.field2439[var1] = false;
		this.field2432[++this.field2431 - 1] = var1;
		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-99"
	)
	public boolean vmethod4312(int var1) {
		this.field2437[var1] = false;
		this.field2438[var1] = false;
		this.field2439[var1] = true;
		this.field2441[++this.field2430 - 1] = var1;
		return true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1370736452"
	)
	public boolean vmethod4324(char var1) {
		int var2 = this.field2435 + 1 & 127;
		if (var2 != this.field2434) {
			this.field2429[this.field2435] = -1;
			this.field2433[this.field2435] = var1;
			this.field2435 = var2;
		}

		return false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-10"
	)
	public boolean vmethod4339(boolean var1) {
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "104"
	)
	void method4313(int var1) {
		int var2 = this.field2435 + 1 & 127;
		if (var2 != this.field2434) {
			this.field2429[this.field2435] = var1;
			this.field2433[this.field2435] = 0;
			this.field2435 = var2;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1201094471"
	)
	public void method4327() {
		this.field2434 = this.field2436;
		this.field2436 = this.field2435;
		this.field2431 = 0;
		this.field2430 = 0;
		Arrays.fill(this.field2438, false);
		Arrays.fill(this.field2439, false);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1399664256"
	)
	public final boolean method4337() {
		if (this.field2434 == this.field2436) {
			return false;
		} else {
			this.field2440 = this.field2429[this.field2434];
			this.field2428 = this.field2433[this.field2434];
			this.field2434 = this.field2434 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "911395944"
	)
	public boolean method4333(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2438[var1] : false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "16384"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2437[var1] : false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-71"
	)
	public boolean method4319(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2439[var1] : false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1878249396"
	)
	public int[] method4320() {
		int[] var1 = new int[this.field2431];

		for (int var2 = 0; var2 < this.field2431; ++var2) {
			var1[var2] = this.field2432[var2];
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-906504621"
	)
	public int[] method4321() {
		int[] var1 = new int[this.field2430];

		for (int var2 = 0; var2 < this.field2430; ++var2) {
			var1[var2] = this.field2441[var2];
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "2"
	)
	static final int method4316(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1327677232"
	)
	static void method4350() {
		if ((Client.worldProperties & class530.field5214.rsOrdinal()) != 0) {
			Login.Login_response0 = "";
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
			Login.Login_response2 = "Your normal account will not be affected.";
			Login.Login_response3 = "";
			class210.method3930(1);
			Friend.method8099();
		} else if ((Client.worldProperties & class530.field5221.rsOrdinal()) != 0) {
			if ((Client.worldProperties & class530.field5199.rsOrdinal()) != 0) {
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other almost everywhere";
				Login.Login_response3 = "and the Protect Item prayer won't work.";
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other";
				Login.Login_response3 = "almost everywhere.";
			}

			Login.Login_response0 = "Warning!";
			class210.method3930(1);
			Friend.method8099();
		} else if ((Client.worldProperties & class530.field5199.rsOrdinal()) != 0) {
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
			Login.Login_response2 = "The Protect Item prayer will";
			Login.Login_response3 = "not work on this world.";
			Login.Login_response0 = "Warning!";
			class210.method3930(1);
			Friend.method8099();
		} else {
			class130.Login_promptCredentials(false);
		}

	}
}
