import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class137 extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1073701221
	)
	int field1607;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	public class130[][] field1608;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	class130[][] field1610;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public Skeleton field1609;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 225489079
	)
	int field1611;
	@ObfuscatedName("aj")
	boolean field1612;
	@ObfuscatedName("av")
	Future field1613;
	@ObfuscatedName("ap")
	List field1614;

	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;IZ)V",
		garbageValue = "0"
	)
	public class137(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1608 = null;
		this.field1610 = null;
		this.field1611 = 0;
		this.field1607 = var3;
		byte[] var5 = var1.takeFile(this.field1607 >> 16 & 65535, this.field1607 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.getFile(var8, 0);
		this.field1609 = new Skeleton(var8, var9);
		this.field1614 = new ArrayList();
		this.field1613 = SoundCache.field344.submit(new class134(this, var6, var7));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)V",
		garbageValue = "-79"
	)
	void method3055(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1611 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1610 = new class130[this.field1609.method4549().method4493()][];
		this.field1608 = new class130[this.field1609.method4554()][];
		class129[] var4 = new class129[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class131[] var16 = new class131[]{class131.field1556, class131.field1557, class131.field1560, class131.field1559, class131.field1562, class131.field1561};
			class131 var17 = (class131)ClientPreferences.findEnumerated(var16, var7);
			if (var17 == null) {
				var17 = class131.field1556;
			}

			var9 = var1.readShortSmart();
			int var11 = var1.readUnsignedByte();
			class132 var12 = (class132)ClientPreferences.findEnumerated(MenuAction.method2085(), var11);
			if (var12 == null) {
				var12 = class132.field1575;
			}

			class130 var13 = new class130();
			var13.method2991(var1, var2);
			var4[var5] = new class129(this, var13, var17, var12, var9);
			int var14 = var17.method3018();
			class130[][] var15;
			if (var17 == class131.field1557) {
				var15 = this.field1610;
			} else {
				var15 = this.field1608;
			}

			if (var15[var9] == null) {
				var15[var9] = new class130[var14];
			}

			if (var17 == class131.field1562) {
				this.field1612 = true;
			}
		}

		var5 = var3 / UserComparator4.field1444;
		int var6 = var3 % UserComparator4.field1444;
		int var8 = 0;

		for (var9 = 0; var9 < UserComparator4.field1444; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1614.add(SoundCache.field344.submit(new class136(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method3056() {
		if (this.field1613 == null && this.field1614 == null) {
			return true;
		} else {
			if (this.field1613 != null) {
				if (!this.field1613.isDone()) {
					return false;
				}

				this.field1613 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1614.size(); ++var2) {
				if (!((Future)this.field1614.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1614.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1614 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-316980325"
	)
	public int method3082() {
		return this.field1611;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-96"
	)
	public boolean method3073() {
		return this.field1612;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILek;III)V",
		garbageValue = "519510056"
	)
	public void method3059(int var1, class127 var2, int var3, int var4) {
		class451 var5 = class138.method3097();
		this.method3060(var5, var3, var2, var1);
		this.method3075(var5, var3, var2, var1);
		this.method3061(var5, var3, var2, var1);
		var2.method2974(var5);
		var5.method8279();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrm;ILek;IB)V",
		garbageValue = "2"
	)
	void method3060(class451 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2951(this.field1611);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1610[var2] != null) {
			class130 var9 = this.field1610[var2][0];
			class130 var10 = this.field1610[var2][1];
			class130 var11 = this.field1610[var2][2];
			if (var9 != null) {
				var6 = var9.method2993(var4);
			}

			if (var10 != null) {
				var7 = var10.method2993(var4);
			}

			if (var11 != null) {
				var8 = var11.method2993(var4);
			}
		}

		class450 var16 = ViewportMouse.method4940();
		var16.method8222(1.0F, 0.0F, 0.0F, var6);
		class450 var14 = ViewportMouse.method4940();
		var14.method8222(0.0F, 1.0F, 0.0F, var7);
		class450 var15 = ViewportMouse.method4940();
		var15.method8222(0.0F, 0.0F, 1.0F, var8);
		class450 var12 = ViewportMouse.method4940();
		var12.method8228(var15);
		var12.method8228(var16);
		var12.method8228(var14);
		class451 var13 = class138.method3097();
		var13.method8255(var12);
		var1.method8285(var13);
		var16.method8224();
		var14.method8224();
		var15.method8224();
		var12.method8224();
		var13.method8279();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrm;ILek;II)V",
		garbageValue = "-502012777"
	)
	void method3061(class451 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2952(this.field1611);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1610[var2] != null) {
			class130 var9 = this.field1610[var2][3];
			class130 var10 = this.field1610[var2][4];
			class130 var11 = this.field1610[var2][5];
			if (var9 != null) {
				var6 = var9.method2993(var4);
			}

			if (var10 != null) {
				var7 = var10.method2993(var4);
			}

			if (var11 != null) {
				var8 = var11.method2993(var4);
			}
		}

		var1.field4743[12] = var6;
		var1.field4743[13] = var7;
		var1.field4743[14] = var8;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrm;ILek;II)V",
		garbageValue = "1367616310"
	)
	void method3075(class451 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2953(this.field1611);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1610[var2] != null) {
			class130 var9 = this.field1610[var2][6];
			class130 var10 = this.field1610[var2][7];
			class130 var11 = this.field1610[var2][8];
			if (var9 != null) {
				var6 = var9.method2993(var4);
			}

			if (var10 != null) {
				var7 = var10.method2993(var4);
			}

			if (var11 != null) {
				var8 = var11.method2993(var4);
			}
		}

		class451 var12 = class138.method3097();
		var12.method8266(var6, var7, var8);
		var1.method8285(var12);
		var12.method8279();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "1214318405"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			PendingSpawn.method2378(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			class425.method7865(class386.archive8, var0.properties);
		}

		VarbitComposition.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		VarpDefinition.field1910 = var0.field823;
		Login.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class11.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		Varps.currentPort = Login.worldPort;
	}
}
