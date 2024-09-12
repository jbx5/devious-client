import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("ae")
	char[] field2978;
	@ObfuscatedName("ag")
	int[] field2979;
	@ObfuscatedName("am")
	public int[] field2980;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1512297219
	)
	public int field2987;
	@ObfuscatedName("aq")
	int[] field2982;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 686608497
	)
	int field2983;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1367415837
	)
	int field2977;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1760161195
	)
	int field2981;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 915423915
	)
	int field2986;
	@ObfuscatedName("al")
	boolean[] field2984;
	@ObfuscatedName("ad")
	boolean[] field2988;
	@ObfuscatedName("ah")
	boolean[] field2985;
	@ObfuscatedName("ap")
	public char field2990;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 585229647
	)
	public int field2991;

	public IndexCheck() {
		this.field2978 = new char[128];
		this.field2979 = new int[128];
		this.field2980 = new int[128];
		this.field2987 = 0;
		this.field2982 = new int[128];
		this.field2983 = 0;
		this.field2977 = 0;
		this.field2981 = 0;
		this.field2986 = 0;
		this.field2984 = new boolean[112];
		this.field2988 = new boolean[112];
		this.field2985 = new boolean[112];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2101251211"
	)
	public boolean vmethod5567(int var1) {
		this.method5583(var1);
		this.field2984[var1] = true;
		this.field2988[var1] = true;
		this.field2985[var1] = false;
		if (this.field2987 < 128) {
			this.field2980[++this.field2987 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-101296173"
	)
	public boolean vmethod5568(int var1) {
		this.field2984[var1] = false;
		this.field2988[var1] = false;
		this.field2985[var1] = true;
		if (this.field2983 < 128) {
			this.field2982[++this.field2983 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-893504177"
	)
	public boolean vmethod5569(char var1) {
		int var2 = this.field2981 + 1 & 127;
		if (var2 != this.field2977) {
			this.field2979[this.field2981] = -1;
			this.field2978[this.field2981] = var1;
			this.field2981 = var2;
		}

		return false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1165234574"
	)
	public boolean vmethod5588(boolean var1) {
		return false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2084513655"
	)
	void method5583(int var1) {
		int var2 = this.field2981 + 1 & 127;
		if (var2 != this.field2977) {
			this.field2979[this.field2981] = var1;
			this.field2978[this.field2981] = 0;
			this.field2981 = var2;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1224192495"
	)
	public void method5572() {
		this.field2977 = this.field2986;
		this.field2986 = this.field2981;
		this.field2987 = 0;
		this.field2983 = 0;
		Arrays.fill(this.field2988, false);
		Arrays.fill(this.field2985, false);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	public final boolean method5573() {
		if (this.field2986 == this.field2977) {
			return false;
		} else {
			this.field2991 = this.field2979[this.field2977];
			this.field2990 = this.field2978[this.field2977];
			this.field2977 = this.field2977 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1238638734"
	)
	public boolean method5574(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2988[var1] : false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1770128204"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2984[var1] : false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "42"
	)
	public boolean method5576(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2985[var1] : false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2084655634"
	)
	public int[] method5577() {
		int[] var1 = new int[this.field2987];

		for (int var2 = 0; var2 < this.field2987; ++var2) {
			var1[var2] = this.field2980[var2];
		}

		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1017987876"
	)
	public int[] method5596() {
		int[] var1 = new int[this.field2983];

		for (int var2 = 0; var2 < this.field2983; ++var2) {
			var1[var2] = this.field2982[var2];
		}

		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "75"
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
