import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class132 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1437500881
	)
	public final int field1546;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	public class132 field1554;
	@ObfuscatedName("ag")
	float[][] field1547;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lqg;"
	)
	final class424[] field1556;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lqg;"
	)
	class424[] field1549;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lqg;"
	)
	class424[] field1550;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	class424 field1551;
	@ObfuscatedName("av")
	boolean field1552;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	class424 field1555;
	@ObfuscatedName("ai")
	boolean field1559;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	class424 field1545;
	@ObfuscatedName("au")
	float[][] field1548;
	@ObfuscatedName("ah")
	float[][] field1557;
	@ObfuscatedName("az")
	float[][] field1558;

	@ObfuscatedSignature(
		descriptor = "(ILvp;Z)V"
	)
	public class132(int var1, Buffer var2, boolean var3) {
		this.field1551 = new class424();
		this.field1552 = true;
		this.field1555 = new class424();
		this.field1559 = true;
		this.field1545 = new class424();
		this.field1546 = var2.readShort();
		this.field1556 = new class424[var1];
		this.field1549 = new class424[this.field1556.length];
		this.field1550 = new class424[this.field1556.length];
		this.field1547 = new float[this.field1556.length][3];

		for (int var4 = 0; var4 < this.field1556.length; ++var4) {
			this.field1556[var4] = new class424(var2, var3);
			this.field1547[var4][0] = var2.method9565();
			this.field1547[var4][1] = var2.method9565();
			this.field1547[var4][2] = var2.method9565();
		}

		this.method3074();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-375520590"
	)
	void method3074() {
		this.field1548 = new float[this.field1556.length][3];
		this.field1557 = new float[this.field1556.length][3];
		this.field1558 = new float[this.field1556.length][3];
		class424 var1;
		synchronized(class424.field4704) {
			if (class424.field4706 == 0) {
				var1 = new class424();
			} else {
				class424.field4704[--class424.field4706].method7789();
				var1 = class424.field4704[class424.field4706];
			}
		}

		class424 var2 = var1;

		for (int var5 = 0; var5 < this.field1556.length; ++var5) {
			class424 var4 = this.method3075(var5);
			var2.method7809(var4);
			var2.method7790();
			this.field1548[var5] = var2.method7779();
			this.field1557[var5][0] = var4.field4709[12];
			this.field1557[var5][1] = var4.field4709[13];
			this.field1557[var5][2] = var4.field4709[14];
			this.field1558[var5] = var4.method7798();
		}

		var2.method7801();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqg;",
		garbageValue = "69"
	)
	class424 method3075(int var1) {
		return this.field1556[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lqg;",
		garbageValue = "829200770"
	)
	class424 method3116(int var1) {
		if (this.field1549[var1] == null) {
			this.field1549[var1] = new class424(this.method3075(var1));
			if (this.field1554 != null) {
				this.field1549[var1].method7785(this.field1554.method3116(var1));
			} else {
				this.field1549[var1].method7785(class424.field4707);
			}
		}

		return this.field1549[var1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqg;",
		garbageValue = "0"
	)
	class424 method3079(int var1) {
		if (this.field1550[var1] == null) {
			this.field1550[var1] = new class424(this.method3116(var1));
			this.field1550[var1].method7790();
		}

		return this.field1550[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqg;B)V",
		garbageValue = "54"
	)
	void method3078(class424 var1) {
		this.field1551.method7809(var1);
		this.field1552 = true;
		this.field1559 = true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lqg;",
		garbageValue = "104"
	)
	class424 method3095() {
		return this.field1551;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lqg;",
		garbageValue = "1080468653"
	)
	class424 method3117() {
		if (this.field1552) {
			this.field1555.method7809(this.method3095());
			if (this.field1554 != null) {
				this.field1555.method7785(this.field1554.method3117());
			}

			this.field1552 = false;
		}

		return this.field1555;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lqg;",
		garbageValue = "-2053259314"
	)
	public class424 method3093(int var1) {
		if (this.field1559) {
			this.field1545.method7809(this.method3079(var1));
			this.field1545.method7785(this.method3117());
			this.field1559 = false;
		}

		return this.field1545;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "396253425"
	)
	float[] method3082(int var1) {
		return this.field1548[var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1697728094"
	)
	float[] method3080(int var1) {
		return this.field1557[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-36"
	)
	float[] method3120(int var1) {
		return this.field1558[var1];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljg;",
		garbageValue = "382186703"
	)
	static WorldMapSprite method3118(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class199.readSpritePixelsFromBytes(var0).pixels);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2065475327"
	)
	public static int method3073(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 49 & 2047L);
		return var1;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-723149829"
	)
	static final void method3099() {
		KitDefinition.KitDefinition_archive = null;
		KitDefinition.KitDefinition_modelsArchive = null;
		class333.KitDefinition_fileCount = 0;
	}
}
