import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class142 extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1471749567
	)
	public static int field1649;
	@ObfuscatedName("av")
	public static ThreadPoolExecutor field1655;
	@ObfuscatedName("gm")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1622909371
	)
	int field1657;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[[Lfd;"
	)
	public class135[][] field1654;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Lfd;"
	)
	class135[][] field1650;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	public Skeleton field1651;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -433832585
	)
	int field1652;
	@ObfuscatedName("an")
	boolean field1653;
	@ObfuscatedName("ab")
	Future field1656;
	@ObfuscatedName("ai")
	List field1658;

	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;IZ)V",
		garbageValue = "0"
	)
	public class142(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1654 = null;
		this.field1650 = null;
		this.field1652 = 0;
		this.field1657 = var3;
		byte[] var5 = var1.takeFile(this.field1657 >> 16 & 65535, this.field1657 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.getFile(var8, 0);
		this.field1651 = new Skeleton(var8, var9);
		this.field1658 = new ArrayList();
		this.field1656 = field1655.submit(new class139(this, var6, var7));
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "1380157813"
	)
	void method3204(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1652 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1650 = new class135[this.field1651.method5407().method5356()][];
		this.field1654 = new class135[this.field1651.method5406()][];
		class134[] var4 = new class134[var3];

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) {
			class136 var12 = FriendSystem.method1975(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			class137 var13 = class498.method8898(var1.readUnsignedByte());
			class135 var14 = new class135();
			var14.method3135(var1, var2);
			var4[var5] = new class134(this, var14, var12, var13, var7);
			int var10 = var12.method3168();
			class135[][] var15;
			if (var12 == class136.field1601) {
				var15 = this.field1650;
			} else {
				var15 = this.field1654;
			}

			if (var15[var7] == null) {
				var15[var7] = new class135[var10];
			}

			if (var12 == class136.field1600) {
				this.field1653 = true;
			}
		}

		var5 = var3 / field1649;
		int var6 = var3 % field1649;
		int var8 = 0;

		for (int var9 = 0; var9 < field1649; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1658.add(field1655.submit(new class141(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2011777715"
	)
	public boolean method3231() {
		if (this.field1656 == null && this.field1658 == null) {
			return true;
		} else {
			if (this.field1656 != null) {
				if (!this.field1656.isDone()) {
					return false;
				}

				this.field1656 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1658.size(); ++var2) {
				if (!((Future)this.field1658.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1658.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1658 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1590804157"
	)
	public int method3205() {
		return this.field1652;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1212098783"
	)
	public boolean method3206() {
		return this.field1653;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILfv;III)V",
		garbageValue = "776450665"
	)
	public void method3211(int var1, class132 var2, int var3, int var4) {
		class424 var5 = class175.method3560();
		this.method3208(var5, var3, var2, var1);
		this.method3230(var5, var3, var2, var1);
		this.method3209(var5, var3, var2, var1);
		var2.method3078(var5);
		var5.method7801();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqg;ILfv;II)V",
		garbageValue = "1416708693"
	)
	void method3208(class424 var1, int var2, class132 var3, int var4) {
		float[] var5 = var3.method3082(this.field1652);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1650[var2] != null) {
			class135 var9 = this.field1650[var2][0];
			class135 var10 = this.field1650[var2][1];
			class135 var11 = this.field1650[var2][2];
			if (var9 != null) {
				var6 = var9.method3137(var4);
			}

			if (var10 != null) {
				var7 = var10.method3137(var4);
			}

			if (var11 != null) {
				var8 = var11.method3137(var4);
			}
		}

		class423 var17 = DynamicObject.method2270();
		var17.method7734(1.0F, 0.0F, 0.0F, var6);
		class423 var18 = DynamicObject.method2270();
		var18.method7734(0.0F, 1.0F, 0.0F, var7);
		class423 var19 = DynamicObject.method2270();
		var19.method7734(0.0F, 0.0F, 1.0F, var8);
		class423 var12 = DynamicObject.method2270();
		var12.method7737(var19);
		var12.method7737(var17);
		var12.method7737(var18);
		class424 var13;
		synchronized(class424.field4704) {
			if (class424.field4706 == 0) {
				var13 = new class424();
			} else {
				class424.field4704[--class424.field4706].method7789();
				var13 = class424.field4704[class424.field4706];
			}
		}

		var13.method7797(var12);
		var1.method7785(var13);
		var17.method7764();
		var18.method7764();
		var19.method7764();
		var12.method7764();
		var13.method7801();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqg;ILfv;II)V",
		garbageValue = "800913854"
	)
	void method3209(class424 var1, int var2, class132 var3, int var4) {
		float[] var5 = var3.method3080(this.field1652);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1650[var2] != null) {
			class135 var9 = this.field1650[var2][3];
			class135 var10 = this.field1650[var2][4];
			class135 var11 = this.field1650[var2][5];
			if (var9 != null) {
				var6 = var9.method3137(var4);
			}

			if (var10 != null) {
				var7 = var10.method3137(var4);
			}

			if (var11 != null) {
				var8 = var11.method3137(var4);
			}
		}

		var1.field4709[12] = var6;
		var1.field4709[13] = var7;
		var1.field4709[14] = var8;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqg;ILfv;II)V",
		garbageValue = "603613831"
	)
	void method3230(class424 var1, int var2, class132 var3, int var4) {
		float[] var5 = var3.method3120(this.field1652);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1650[var2] != null) {
			class135 var9 = this.field1650[var2][6];
			class135 var10 = this.field1650[var2][7];
			class135 var11 = this.field1650[var2][8];
			if (var9 != null) {
				var6 = var9.method3137(var4);
			}

			if (var10 != null) {
				var7 = var10.method3137(var4);
			}

			if (var11 != null) {
				var8 = var11.method3137(var4);
			}
		}

		class424 var14;
		synchronized(class424.field4704) {
			if (class424.field4706 == 0) {
				var14 = new class424();
			} else {
				class424.field4704[--class424.field4706].method7789();
				var14 = class424.field4704[class424.field4706];
			}
		}

		var14.method7804(var6, var7, var8);
		var1.method7785(var14);
		var14.method7801();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Lei;",
		garbageValue = "12"
	)
	static AttackOption[] method3233() {
		return new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.field1384, AttackOption.field1385, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvq;",
		garbageValue = "-2047102417"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field5446, FillMode.field5444};
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Ljava/lang/String;",
		garbageValue = "-85173996"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (BoundaryObject.Widget_unpackTargetMask(ClanChannel.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
