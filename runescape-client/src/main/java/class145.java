import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class145 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1308585921
	)
	static int field1679;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1761379419
	)
	int field1670;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Lfr;"
	)
	public class137[][] field1672;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Lfr;"
	)
	class137[][] field1674;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public Skeleton field1673;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -272291257
	)
	int field1675;
	@ObfuscatedName("aq")
	boolean field1677;
	@ObfuscatedName("au")
	Future field1676;
	@ObfuscatedName("ar")
	List field1671;

	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;IZ)V"
	)
	class145(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1672 = null;
		this.field1674 = null;
		this.field1675 = 0;
		this.field1670 = var3;
		byte[] var5 = var1.takeFile(this.field1670 >> 16 & 65535, this.field1670 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1673 = new Skeleton(var8, var9);
		this.field1671 = new ArrayList();
		this.field1676 = Fonts.field5251.submit(new class144(this, var6, var7));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "-143337670"
	)
	void method3416(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1675 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1674 = new class137[this.field1673.method4887().method4823()][];
		this.field1672 = new class137[this.field1673.method4889()][];
		class136[] var4 = new class136[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class138[] var14 = new class138[]{class138.field1628, class138.field1631, class138.field1629, class138.field1630, class138.field1627, class138.field1632};
			class138 var15 = (class138)ArchiveDiskAction.findEnumerated(var14, var7);
			if (var15 == null) {
				var15 = class138.field1628;
			}

			var9 = var1.readShortSmart();
			class139 var17 = class133.method3273(var1.readUnsignedByte());
			class137 var18 = new class137();
			var18.method3320(var1, var2);
			var4[var5] = new class136(this, var18, var15, var17, var9);
			int var12 = var15.method3355();
			class137[][] var13;
			if (var15 == class138.field1631) {
				var13 = this.field1674;
			} else {
				var13 = this.field1672;
			}

			if (var13[var9] == null) {
				var13[var9] = new class137[var12];
			}

			if (var15 == class138.field1627) {
				this.field1677 = true;
			}
		}

		var5 = var3 / GrandExchangeOfferOwnWorldComparator.field482;
		int var6 = var3 % GrandExchangeOfferOwnWorldComparator.field482;
		int var8 = 0;

		for (var9 = 0; var9 < GrandExchangeOfferOwnWorldComparator.field482; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1671.add(Fonts.field5251.submit(new class140(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1818801014"
	)
	public boolean method3396() {
		if (this.field1676 == null && this.field1671 == null) {
			return true;
		} else {
			if (this.field1676 != null) {
				if (!this.field1676.isDone()) {
					return false;
				}

				this.field1676 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1671.size(); ++var2) {
				if (!((Future)this.field1671.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1671.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1671 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public int method3397() {
		return this.field1675;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1837013714"
	)
	public boolean method3395() {
		return this.field1677;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILfb;IIB)V",
		garbageValue = "33"
	)
	public void method3399(int var1, class134 var2, int var3, int var4) {
		TransformationMatrix var5 = class172.method3757();
		this.method3400(var5, var3, var2, var1);
		this.method3402(var5, var3, var2, var1);
		this.method3401(var5, var3, var2, var1);
		var2.method3307(var5);
		var5.method8125();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqf;ILfb;IB)V",
		garbageValue = "-8"
	)
	void method3400(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3309(this.field1675);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1674[var2] != null) {
			class137 var9 = this.field1674[var2][0];
			class137 var10 = this.field1674[var2][1];
			class137 var11 = this.field1674[var2][2];
			if (var9 != null) {
				var6 = var9.method3323(var4);
			}

			if (var10 != null) {
				var7 = var10.method3323(var4);
			}

			if (var11 != null) {
				var8 = var11.method3323(var4);
			}
		}

		class426 var16 = class157.method3544();
		var16.method8107(1.0F, 0.0F, 0.0F, var6);
		class426 var14 = class157.method3544();
		var14.method8107(0.0F, 1.0F, 0.0F, var7);
		class426 var15 = class157.method3544();
		var15.method8107(0.0F, 0.0F, 1.0F, var8);
		class426 var12 = class157.method3544();
		var12.method8103(var15);
		var12.method8103(var16);
		var12.method8103(var14);
		TransformationMatrix var13 = class172.method3757();
		var13.method8137(var12);
		var1.method8135(var13);
		var16.method8098();
		var14.method8098();
		var15.method8098();
		var12.method8098();
		var13.method8125();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqf;ILfb;II)V",
		garbageValue = "-1831320952"
	)
	void method3401(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3284(this.field1675);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1674[var2] != null) {
			class137 var9 = this.field1674[var2][3];
			class137 var10 = this.field1674[var2][4];
			class137 var11 = this.field1674[var2][5];
			if (var9 != null) {
				var6 = var9.method3323(var4);
			}

			if (var10 != null) {
				var7 = var10.method3323(var4);
			}

			if (var11 != null) {
				var8 = var11.method3323(var4);
			}
		}

		var1.field4737[12] = var6;
		var1.field4737[13] = var7;
		var1.field4737[14] = var8;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqf;ILfb;II)V",
		garbageValue = "1597728924"
	)
	void method3402(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3294(this.field1675);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1674[var2] != null) {
			class137 var9 = this.field1674[var2][6];
			class137 var10 = this.field1674[var2][7];
			class137 var11 = this.field1674[var2][8];
			if (var9 != null) {
				var6 = var9.method3323(var4);
			}

			if (var10 != null) {
				var7 = var10.method3323(var4);
			}

			if (var11 != null) {
				var8 = var11.method3323(var4);
			}
		}

		TransformationMatrix var12 = class172.method3757();
		var12.method8133(var6, var7, var8);
		var1.method8135(var12);
		var12.method8125();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "347621045"
	)
	public static long method3424(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-308817549"
	)
	static Object method3409(int var0) {
		return WallDecoration.method5536((class537)ArchiveDiskAction.findEnumerated(class537.method9774(), var0));
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZI)V",
		garbageValue = "1775184496"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			TaskHandler.widgetDefinition.method6855(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) {
			if ((long)var2 == (var4.key >> 48 & 65535L)) {
				var4.remove();
			}
		}

		Widget var5 = TaskHandler.widgetDefinition.method6841(var3);
		if (var5 != null) {
			SecureRandomCallable.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) {
			class147.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
