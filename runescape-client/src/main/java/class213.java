import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class213 implements class29 {
	@ObfuscatedName("aw")
	char[] field2317;
	@ObfuscatedName("ay")
	int[] field2325;
	@ObfuscatedName("ar")
	public int[] field2319;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 175301623
	)
	public int field2331;
	@ObfuscatedName("as")
	int[] field2324;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1941852341
	)
	int field2322;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 781872213
	)
	int field2323;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 914049527
	)
	int field2318;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 85528185
	)
	int field2321;
	@ObfuscatedName("ap")
	boolean[] field2326;
	@ObfuscatedName("aq")
	boolean[] field2327;
	@ObfuscatedName("at")
	boolean[] field2328;
	@ObfuscatedName("ah")
	public char field2329;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 442301753
	)
	public int field2330;

	public class213() {
		this.field2317 = new char[128];
		this.field2325 = new int[128];
		this.field2319 = new int[128];
		this.field2331 = 0;
		this.field2324 = new int[128];
		this.field2322 = 0;
		this.field2323 = 0;
		this.field2318 = 0;
		this.field2321 = 0;
		this.field2326 = new boolean[112];
		this.field2327 = new boolean[112];
		this.field2328 = new boolean[112];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1364202239"
	)
	public boolean vmethod4143(int var1) {
		this.method4144(var1);
		this.field2326[var1] = true;
		this.field2327[var1] = true;
		this.field2328[var1] = false;
		this.field2319[++this.field2331 - 1] = var1;
		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1960624058"
	)
	public boolean vmethod4148(int var1) {
		this.field2326[var1] = false;
		this.field2327[var1] = false;
		this.field2328[var1] = true;
		this.field2324[++this.field2322 - 1] = var1;
		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "932068520"
	)
	public boolean vmethod4145(char var1) {
		int var2 = this.field2318 + 1 & 127;
		if (var2 != this.field2323) {
			this.field2325[this.field2318] = -1;
			this.field2317[this.field2318] = var1;
			this.field2318 = var2;
		}

		return false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-93"
	)
	public boolean vmethod4147(boolean var1) {
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1128886308"
	)
	void method4144(int var1) {
		int var2 = this.field2318 + 1 & 127;
		if (var2 != this.field2323) {
			this.field2325[this.field2318] = var1;
			this.field2317[this.field2318] = 0;
			this.field2318 = var2;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "196397421"
	)
	public void method4171() {
		this.field2323 = this.field2321;
		this.field2321 = this.field2318;
		this.field2331 = 0;
		this.field2322 = 0;
		Arrays.fill(this.field2327, false);
		Arrays.fill(this.field2328, false);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-560084710"
	)
	public final boolean method4162() {
		if (this.field2321 == this.field2323) {
			return false;
		} else {
			this.field2330 = this.field2325[this.field2323];
			this.field2329 = this.field2317[this.field2323];
			this.field2323 = this.field2323 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1196932561"
	)
	public boolean method4150(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2327[var1] : false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1392271778"
	)
	public boolean method4151(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2326[var1] : false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1727357268"
	)
	public boolean method4152(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2328[var1] : false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1635816541"
	)
	public int[] method4177() {
		int[] var1 = new int[this.field2331];

		for (int var2 = 0; var2 < this.field2331; ++var2) {
			var1[var2] = this.field2319[var2];
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "0"
	)
	public int[] method4154() {
		int[] var1 = new int[this.field2322];

		for (int var2 = 0; var2 < this.field2322; ++var2) {
			var1[var2] = this.field2324[var2];
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "4430"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}
}
