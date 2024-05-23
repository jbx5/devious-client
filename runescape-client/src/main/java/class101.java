import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class101 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1413982259
	)
	int field1335;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	public Scene field1331;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	CollisionMap[] field1332;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1305902891
	)
	public int field1348;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1392129955
	)
	int field1346;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1595806771
	)
	int field1330;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1010690991
	)
	int field1337;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -854149623
	)
	int field1333;
	@ObfuscatedName("ac")
	int[][] field1338;
	@ObfuscatedName("ao")
	int[][][] field1339;
	@ObfuscatedName("ah")
	byte[][][] field1340;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lde;"
	)
	Player[] field1341;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	class110 field1336;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ldv;"
	)
	class103[] field1343;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1962706385
	)
	int field1344;
	@ObfuscatedName("ax")
	int[] field1345;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lst;"
	)
	class475[] field1347;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1011567785
	)
	int field1334;
	@ObfuscatedName("as")
	int[] field1350;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[[Lpk;"
	)
	NodeDeque[][][] field1349;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	NodeDeque field1342;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	NodeDeque field1351;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	NodeDeque field1352;

	public class101(int var1, int var2, int var3, int var4) {
		this.field1332 = new CollisionMap[4];
		this.field1341 = new Player[2048];
		this.field1336 = new class110(this);
		this.field1343 = new class103[65536];
		this.field1345 = new int[65536];
		this.field1347 = new class475[2048];
		this.field1350 = new int[2048];
		this.field1342 = new NodeDeque();
		this.field1351 = new NodeDeque();
		this.field1352 = new NodeDeque();
		this.field1335 = var1;
		this.field1346 = var2;
		this.field1330 = var3;
		this.field1349 = new NodeDeque[4][var2][var3];
		this.field1339 = new int[4][var2 + 1][var3 + 1];
		this.field1340 = new byte[4][var2][var3];
		this.field1338 = new int[var2][var3];

		for (int var5 = 0; var5 < 4; ++var5) {
			this.field1332[var5] = new CollisionMap(var2, var3);
		}

		this.field1331 = new Scene(var1, 4, var2, var3, var4, this.field1339);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799077622"
	)
	boolean method2634() {
		return this.field1335 == -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "841220988"
	)
	@Export("clear")
	void clear() {
		this.field1344 = 0;
		this.field1334 = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			this.field1341[var1] = null;
		}

		for (var1 = 0; var1 < 65536; ++var1) {
			this.field1343[var1] = null;
		}

		for (var1 = 0; var1 < 2048; ++var1) {
			this.field1347[var1] = null;
		}

		this.field1351.clear();
		this.field1352.clear();
		this.field1342 = new NodeDeque();

		for (var1 = 0; var1 < 4; ++var1) {
			for (int var2 = 0; var2 < this.field1346; ++var2) {
				for (int var3 = 0; var3 < this.field1330; ++var3) {
					this.field1349[var1][var2][var3] = null;
				}
			}
		}

		this.field1331.clearTempGameObjects();

		for (var1 = 0; var1 < 4; ++var1) {
			this.field1332[var1].clear();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	void method2640() {
		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			this.field1341[var1] = null;
		}

		for (var1 = 0; var1 < this.field1343.length; ++var1) {
			class103 var2 = this.field1343[var1];
			if (var2 != null) {
				var2.field1219 = -1;
				var2.field1240 = false;
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1128508700"
	)
	static void method2642() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-121"
	)
	static boolean method2633(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}
}
