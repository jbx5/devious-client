import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class141 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 910389071
	)
	static int field1649;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field1656;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 997175123
	)
	int field1651;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	public class133[][] field1653;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	class133[][] field1647;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public Skeleton field1650;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -130218119
	)
	int field1648;
	@ObfuscatedName("aa")
	boolean field1652;
	@ObfuscatedName("ac")
	Future field1654;
	@ObfuscatedName("ao")
	List field1655;

	@ObfuscatedSignature(
		descriptor = "(Lor;Lor;IZ)V"
	)
	class141(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1653 = null;
		this.field1647 = null;
		this.field1648 = 0;
		this.field1651 = var3;
		byte[] var5 = var1.takeFile(this.field1651 >> 16 & 65535, this.field1651 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1650 = new Skeleton(var8, var9);
		this.field1655 = new ArrayList();
		this.field1654 = PcmPlayer.field279.submit(new class140(this, var6, var7));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;IS)V",
		garbageValue = "20860"
	)
	void method3148(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1648 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1647 = new class133[this.field1650.method4844().method4777()][];
		this.field1653 = new class133[this.field1650.method4846()][];
		class132[] var4 = new class132[var3];

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) {
			class134 var12 = class296.method5945(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			class135 var13 = MouseRecorder.method2334(var1.readUnsignedByte());
			class133 var14 = new class133();
			var14.method3097(var1, var2);
			var4[var5] = new class132(this, var14, var12, var13, var7);
			int var10 = var12.method3102();
			class133[][] var15;
			if (var12 == class134.field1604) {
				var15 = this.field1647;
			} else {
				var15 = this.field1653;
			}

			if (var15[var7] == null) {
				var15[var7] = new class133[var10];
			}

			if (var12 == class134.field1614) {
				this.field1652 = true;
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

			if (var8 == var7) {
				break;
			}

			this.field1655.add(PcmPlayer.field279.submit(new class136(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1750704421"
	)
	public boolean method3149() {
		if (this.field1654 == null && this.field1655 == null) {
			return true;
		} else {
			if (this.field1654 != null) {
				if (!this.field1654.isDone()) {
					return false;
				}

				this.field1654 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1655.size(); ++var2) {
				if (!((Future)this.field1655.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1655.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1655 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	public int method3150() {
		return this.field1648;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-569686441"
	)
	public boolean method3151() {
		return this.field1652;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILfh;III)V",
		garbageValue = "1061437397"
	)
	public void method3152(int var1, class130 var2, int var3, int var4) {
		class423 var5;
		synchronized(class423.field4691) {
			if (AccessFile.field5239 == 0) {
				var5 = new class423();
			} else {
				class423.field4691[--AccessFile.field5239].method7884();
				var5 = class423.field4691[AccessFile.field5239];
			}
		}

		this.method3174(var5, var3, var2, var1);
		this.method3154(var5, var3, var2, var1);
		this.method3153(var5, var3, var2, var1);
		var2.method3061(var5);
		var5.method7871();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lql;ILfh;II)V",
		garbageValue = "1426325109"
	)
	void method3174(class423 var1, int var2, class130 var3, int var4) {
		float[] var5 = var3.method3049(this.field1648);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1647[var2] != null) {
			class133 var9 = this.field1647[var2][0];
			class133 var10 = this.field1647[var2][1];
			class133 var11 = this.field1647[var2][2];
			if (var9 != null) {
				var6 = var9.method3079(var4);
			}

			if (var10 != null) {
				var7 = var10.method3079(var4);
			}

			if (var11 != null) {
				var8 = var11.method3079(var4);
			}
		}

		class422 var17 = UrlRequester.method2921();
		var17.method7813(1.0F, 0.0F, 0.0F, var6);
		class422 var18 = UrlRequester.method2921();
		var18.method7813(0.0F, 1.0F, 0.0F, var7);
		class422 var19 = UrlRequester.method2921();
		var19.method7813(0.0F, 0.0F, 1.0F, var8);
		class422 var12 = UrlRequester.method2921();
		var12.method7816(var19);
		var12.method7816(var17);
		var12.method7816(var18);
		class423 var13;
		synchronized(class423.field4691) {
			if (AccessFile.field5239 == 0) {
				var13 = new class423();
			} else {
				class423.field4691[--AccessFile.field5239].method7884();
				var13 = class423.field4691[AccessFile.field5239];
			}
		}

		var13.method7847(var12);
		var1.method7898(var13);
		var17.method7834();
		var18.method7834();
		var19.method7834();
		var12.method7834();
		var13.method7871();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lql;ILfh;IB)V",
		garbageValue = "-86"
	)
	void method3153(class423 var1, int var2, class130 var3, int var4) {
		float[] var5 = var3.method3050(this.field1648);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1647[var2] != null) {
			class133 var9 = this.field1647[var2][3];
			class133 var10 = this.field1647[var2][4];
			class133 var11 = this.field1647[var2][5];
			if (var9 != null) {
				var6 = var9.method3079(var4);
			}

			if (var10 != null) {
				var7 = var10.method3079(var4);
			}

			if (var11 != null) {
				var8 = var11.method3079(var4);
			}
		}

		var1.field4694[12] = var6;
		var1.field4694[13] = var7;
		var1.field4694[14] = var8;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lql;ILfh;II)V",
		garbageValue = "121992439"
	)
	void method3154(class423 var1, int var2, class130 var3, int var4) {
		float[] var5 = var3.method3046(this.field1648);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1647[var2] != null) {
			class133 var9 = this.field1647[var2][6];
			class133 var10 = this.field1647[var2][7];
			class133 var11 = this.field1647[var2][8];
			if (var9 != null) {
				var6 = var9.method3079(var4);
			}

			if (var10 != null) {
				var7 = var10.method3079(var4);
			}

			if (var11 != null) {
				var8 = var11.method3079(var4);
			}
		}

		class423 var14;
		synchronized(class423.field4691) {
			if (AccessFile.field5239 == 0) {
				var14 = new class423();
			} else {
				class423.field4691[--AccessFile.field5239].method7884();
				var14 = class423.field4691[AccessFile.field5239];
			}
		}

		var14.method7851(var6, var7, var8);
		var1.method7898(var14);
		var14.method7871();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-2"
	)
	public static boolean method3171(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lvl;",
		garbageValue = "709857085"
	)
	static IndexedSprite method3182(boolean var0, boolean var1) {
		return var0 ? (var1 ? Varps.field3710 : class206.options_buttons_2Sprite) : (var1 ? Login.field946 : class397.options_buttons_0Sprite);
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1987064021"
	)
	static void method3164() {
		ClanMate.compass = null;
		class17.redHintArrowSprite = null;
		AsyncRestClient.mapSceneSprites = null;
		class4.headIconPkSprites = null;
		HttpMethod.headIconPrayerSprites = null;
		class369.headIconHintSprites = null;
		Varcs.mapDotSprites = null;
		class237.crossSprites = null;
		SequenceDefinition.field2434 = null;
		UrlRequest.scrollBarSprites = null;
		class30.field156 = null;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ldt;Lde;IILjv;I)V",
		garbageValue = "-389547247"
	)
	static final void method3184(class101 var0, Player var1, int var2, int var3, class237 var4) {
		int var5 = var1.field1229[0];
		int var6 = var1.field1276[0];
		int var7 = var1.transformedSize();
		if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7) {
			if (var2 >= var7 && var2 < 104 - var7 && var3 >= var7 && var3 < 104 - var7) {
				class239 var8 = Client.field770;
				int var11 = var1.transformedSize();
				Client.field829.approxDestinationX = var2;
				Client.field829.approxDestinationY = var3;
				Client.field829.field2509 = 1;
				Client.field829.field2512 = 1;
				ApproximateRouteStrategy var12 = Client.field829;
				int var13 = var8.method4556(var5, var6, var11, var12, var0.field1332[var1.plane], true, Client.field830, Client.field831);
				if (var13 >= 1) {
					for (int var14 = 0; var14 < var13 - 1; ++var14) {
						var1.method2372(Client.field830[var14], Client.field831[var14], var4);
					}

				}
			}
		}
	}
}
