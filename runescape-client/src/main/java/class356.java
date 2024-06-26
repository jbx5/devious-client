import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class356 {
	@ObfuscatedName("ap")
	static byte[][][] field3810;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class432 field3792;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class432 field3793;
	@ObfuscatedName("aa")
	boolean field3802;
	@ObfuscatedName("as")
	boolean field3805;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -750548211
	)
	int field3796;
	@ObfuscatedName("at")
	boolean field3789;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 980897855
	)
	int field3798;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 854950137
	)
	int field3803;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 535951409
	)
	int field3800;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1896169033
	)
	int field3799;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1513845077
	)
	int field3809;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 502615579
	)
	int field3794;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2065933361
	)
	int field3804;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1593022913
	)
	int field3813;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1092874469
	)
	int field3806;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -670226323
	)
	int field3807;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1971877053
	)
	int field3808;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1273574081
	)
	int field3786;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1349805081
	)
	int field3812;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	class348 field3811;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	class348 field3797;

	class356() {
		this.field3792 = new class432();
		this.field3793 = new class432();
		this.field3802 = false;
		this.field3805 = true;
		this.field3796 = 0;
		this.field3789 = false;
		this.field3798 = 0;
		this.field3803 = 0;
		this.field3800 = 0;
		this.field3799 = 0;
		this.field3809 = 0;
		this.field3794 = 0;
		this.field3804 = 0;
		this.field3813 = Integer.MAX_VALUE;
		this.field3806 = Integer.MAX_VALUE;
		this.field3807 = 0;
		this.field3808 = 0;
		this.field3786 = 0;
		this.field3812 = 0;
		this.field3792.method7929(1);
		this.field3793.method7929(1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6832() {
		this.field3796 = (this.field3796 + 1) % 60;
		if (this.field3804 > 0) {
			--this.field3804;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-47"
	)
	public boolean method6763(boolean var1) {
		var1 = var1 && this.field3805;
		boolean var2 = this.field3802 != var1;
		this.field3802 = var1;
		if (!this.field3802) {
			this.method6608(this.field3799, this.field3799);
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-376651850"
	)
	public void method6585(boolean var1) {
		this.field3805 = var1;
		this.field3802 = var1 && this.field3802;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1134998565"
	)
	public boolean method6658(String var1) {
		String var2 = this.field3792.method7924();
		if (!var2.equals(var1)) {
			var1 = this.method6652(var1);
			this.field3792.method8040(var1);
			this.method6608(this.field3809, this.field3799);
			this.method6730(this.field3786, this.field3812);
			this.method6656();
			this.method6661();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-259359510"
	)
	boolean method6587(String var1) {
		this.field3793.method8040(var1);
		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqz;B)Z",
		garbageValue = "-114"
	)
	boolean method6795(AbstractFont var1) {
		boolean var2 = !this.field3789;
		this.field3792.method7974(var1);
		this.field3793.method7974(var1);
		this.field3789 = true;
		var2 |= this.method6730(this.field3786, this.field3812);
		var2 |= this.method6608(this.field3809, this.field3799);
		if (this.method6656()) {
			this.method6661();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-382329429"
	)
	public boolean method6637(int var1, int var2) {
		boolean var3 = this.field3807 != var1 || var2 != this.field3808;
		this.field3807 = var1;
		this.field3808 = var2;
		var3 |= this.method6730(this.field3786, this.field3812);
		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "80"
	)
	public boolean method6716(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3792.method7944();
		this.field3792.method8009(var1);
		this.field3793.method8009(var1);
		if (this.method6656()) {
			this.method6661();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "22395"
	)
	public boolean method6591(int var1) {
		this.field3792.method8030(var1);
		if (this.method6656()) {
			this.method6661();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1478386211"
	)
	public boolean method6592(int var1) {
		this.field3806 = var1;
		if (this.method6656()) {
			this.method6661();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "46"
	)
	public boolean method6730(int var1, int var2) {
		if (!this.method6640()) {
			this.field3786 = var1;
			this.field3812 = var2;
			return false;
		} else {
			int var3 = this.field3786;
			int var4 = this.field3812;
			int var5 = Math.max(0, this.field3792.method7941() - this.field3807 + 2);
			int var6 = Math.max(0, this.field3792.method7942() - this.field3808 + 1);
			this.field3786 = Math.max(0, Math.min(var5, var1));
			this.field3812 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3786 || var4 != this.field3812;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1478814835"
	)
	public boolean method6649(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3792.method8029(var1, var2) : false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1993281382"
	)
	public void method6620(int var1) {
		this.field3792.method7931(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-74"
	)
	public void method6749(int var1) {
		this.field3798 = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "100"
	)
	public void method6597(int var1) {
		this.field3792.method7929(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-47"
	)
	public void method6613(int var1) {
		this.field3792.method7927(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1009932172"
	)
	public boolean method6599(int var1) {
		this.field3800 = var1;
		String var2 = this.field3792.method7924();
		int var3 = var2.length();
		var2 = this.method6652(var2);
		if (var2.length() != var3) {
			this.field3792.method8040(var2);
			this.method6730(this.field3786, this.field3812);
			this.method6656();
			this.method6661();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1486801004"
	)
	public void method6600() {
		this.field3789 = false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "238863288"
	)
	public boolean method6601(int var1) {
		if (this.method6662(var1)) {
			this.method6606();
			class433 var2 = this.field3792.method8019((char)var1, this.field3799, this.field3813);
			this.method6608(var2.method8075(), var2.method8075());
			this.method6656();
			this.method6661();
		}

		return true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	public void method6786() {
		if (!this.method6606() && this.field3799 > 0) {
			int var1 = this.field3792.method7981(this.field3799 - 1);
			this.method6661();
			this.method6608(var1, var1);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "675803200"
	)
	public void method6603() {
		if (!this.method6606() && this.field3799 < this.field3792.method7984()) {
			int var1 = this.field3792.method7981(this.field3799);
			this.method6661();
			this.method6608(var1, var1);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1470814709"
	)
	public void method6604() {
		if (!this.method6606() && this.field3799 > 0) {
			class517 var1 = this.method6746(this.field3799 - 1);
			int var2 = this.field3792.method7938((Integer)var1.field5225, this.field3799);
			this.method6661();
			this.method6608(var2, var2);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	public void method6582() {
		if (!this.method6606() && this.field3799 < this.field3792.method7984()) {
			class517 var1 = this.method6746(this.field3799);
			int var2 = this.field3792.method7938(this.field3799, (Integer)var1.field5222);
			this.method6661();
			this.method6608(var2, var2);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "128"
	)
	boolean method6606() {
		if (!this.method6651()) {
			return false;
		} else {
			int var1 = this.field3792.method7938(this.field3809, this.field3799);
			this.method6661();
			this.method6608(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-658610274"
	)
	public void method6654() {
		this.method6608(0, this.field3792.method7984());
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "614125994"
	)
	public boolean method6608(int var1, int var2) {
		if (!this.method6640()) {
			this.field3809 = var1;
			this.field3799 = var2;
			return false;
		} else {
			if (var1 > this.field3792.method7984()) {
				var1 = this.field3792.method7984();
			}

			if (var2 > this.field3792.method7984()) {
				var2 = this.field3792.method7984();
			}

			boolean var3 = this.field3809 != var1 || var2 != this.field3799;
			this.field3809 = var1;
			if (var2 != this.field3799) {
				this.field3799 = var2;
				this.field3796 = 0;
				this.method6852();
			}

			if (var3 && this.field3797 != null) {
				this.field3797.vmethod6510();
			}

			return var3;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1244855518"
	)
	public void method6609(boolean var1) {
		class517 var2 = this.method6655(this.field3799);
		this.method6628((Integer)var2.field5225, var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method6610(boolean var1) {
		class517 var2 = this.method6655(this.field3799);
		this.method6628((Integer)var2.field5222, var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "13"
	)
	public void method6793(boolean var1) {
		this.method6628(0, var1);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-44"
	)
	public void method6612(boolean var1) {
		this.method6628(this.field3792.method7984(), var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-94"
	)
	public void method6765(boolean var1) {
		if (this.method6651() && !var1) {
			this.method6628(Math.min(this.field3809, this.field3799), var1);
		} else if (this.field3799 > 0) {
			this.method6628(this.field3799 - 1, var1);
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-759400096"
	)
	public void method6614(boolean var1) {
		if (this.method6651() && !var1) {
			this.method6628(Math.max(this.field3809, this.field3799), var1);
		} else if (this.field3799 < this.field3792.method7984()) {
			this.method6628(this.field3799 + 1, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "102"
	)
	public void method6615(boolean var1) {
		if (this.field3799 > 0) {
			class517 var2 = this.method6746(this.field3799 - 1);
			this.method6628((Integer)var2.field5225, var1);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "52"
	)
	public void method6602(boolean var1) {
		if (this.field3799 < this.field3792.method7984()) {
			class517 var2 = this.method6746(this.field3799 + 1);
			this.method6628((Integer)var2.field5222, var1);
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "83"
	)
	public void method6794(boolean var1) {
		if (this.field3799 > 0) {
			this.method6628(this.field3792.method7940(this.field3799, -1), var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2061880298"
	)
	public void method6618(boolean var1) {
		if (this.field3799 < this.field3792.method7984()) {
			this.method6628(this.field3792.method7940(this.field3799, 1), var1);
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-26477"
	)
	public void method6619(boolean var1) {
		if (this.field3799 > 0) {
			int var2 = this.method6770();
			this.method6628(this.field3792.method7940(this.field3799, -var2), var1);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1922994733"
	)
	public void method6742(boolean var1) {
		if (this.field3799 < this.field3792.method7984()) {
			int var2 = this.method6770();
			this.method6628(this.field3792.method7940(this.field3799, var2), var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "47"
	)
	public void method6607(boolean var1) {
		class436 var2 = this.field3792.method7932(0, this.field3799);
		class517 var3 = var2.method8201();
		this.method6628(this.field3792.method7926((Integer)var3.field5225, this.field3812), var1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "95"
	)
	public void method6622(boolean var1) {
		class436 var2 = this.field3792.method7932(0, this.field3799);
		class517 var3 = var2.method8201();
		this.method6628(this.field3792.method7926((Integer)var3.field5225, this.field3812 + this.field3808), var1);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "69"
	)
	public void method6623(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class517 var6;
		int var8;
		if (!this.field3789) {
			var8 = 0;
		} else {
			var1 += this.field3786;
			var2 += this.field3812;
			var6 = this.method6663();
			var8 = this.field3792.method7926(var1 - (Integer)var6.field5225, var2 - (Integer)var6.field5222);
		}

		if (var3 && var4) {
			this.field3803 = 1;
			var6 = this.method6746(var8);
			class517 var7 = this.method6746(this.field3794);
			this.method6653(var7, var6);
		} else if (var3) {
			this.field3803 = 1;
			var6 = this.method6746(var8);
			this.method6608((Integer)var6.field5225, (Integer)var6.field5222);
			this.field3794 = (Integer)var6.field5225;
		} else if (var4) {
			this.method6608(this.field3794, var8);
		} else {
			if (this.field3804 > 0 && var8 == this.field3794) {
				if (this.field3799 == this.field3809) {
					this.field3803 = 1;
					var6 = this.method6746(var8);
					this.method6608((Integer)var6.field5225, (Integer)var6.field5222);
				} else {
					this.field3803 = 2;
					var6 = this.method6655(var8);
					this.method6608((Integer)var6.field5225, (Integer)var6.field5222);
				}
			} else {
				this.field3803 = 0;
				this.method6608(var8, var8);
				this.field3794 = var8;
			}

			this.field3804 = 25;
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	public void method6624(int var1, int var2) {
		if (this.field3789 && this.method6635()) {
			var1 += this.field3786;
			var2 += this.field3812;
			class517 var3 = this.method6663();
			int var4 = this.field3792.method7926(var1 - (Integer)var3.field5225, var2 - (Integer)var3.field5222);
			class517 var5;
			class517 var6;
			switch(this.field3803) {
			case 0:
				this.method6608(this.field3809, var4);
				break;
			case 1:
				var5 = this.method6746(this.field3794);
				var6 = this.method6746(var4);
				this.method6653(var5, var6);
				break;
			case 2:
				var5 = this.method6655(this.field3794);
				var6 = this.method6655(var4);
				this.method6653(var5, var6);
			}
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1500532859"
	)
	public void method6625(Clipboard var1) {
		class436 var2 = this.field3792.method7932(this.field3809, this.field3799);
		if (!var2.method8197()) {
			String var3 = var2.method8195();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1336177437"
	)
	public void method6626(Clipboard var1) {
		if (this.method6651()) {
			this.method6625(var1);
			this.method6606();
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "2146143551"
	)
	public void method6748(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6652((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6606();
				class433 var4 = this.field3792.method8045(var3, this.field3799, this.field3813);
				this.method6608(var4.method8075(), var4.method8075());
				this.method6656();
				this.method6661();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1583213346"
	)
	public void method6634() {
		this.field3812 = Math.max(0, this.field3812 - this.field3792.method7943());
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1667126411"
	)
	public void method6629() {
		int var1 = Math.max(0, this.field3792.method7942() - this.field3808);
		this.field3812 = Math.min(var1, this.field3812 + this.field3792.method7943());
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lnj;I)V",
		garbageValue = "757007438"
	)
	public void method6630(class348 var1) {
		this.field3811 = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lnj;I)V",
		garbageValue = "-347826455"
	)
	public void method6631(class348 var1) {
		this.field3797 = var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "1641601454"
	)
	public class432 method6632() {
		return this.field3792;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)Lql;",
		garbageValue = "2"
	)
	public class432 method6675() {
		return this.field3793;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Lqw;",
		garbageValue = "0"
	)
	public class436 method6797() {
		return this.field3792.method7932(this.field3809, this.field3799);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1139117686"
	)
	public boolean method6635() {
		return this.field3802;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2063549797"
	)
	public boolean method6636() {
		return this.field3805;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "22"
	)
	public boolean method6838() {
		return this.method6635() && this.field3796 % 60 < 30;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	public int method6779() {
		return this.field3799;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1005765087"
	)
	public int method6639() {
		return this.field3809;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "125"
	)
	public boolean method6640() {
		return this.field3789;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-110388572"
	)
	public int method6641() {
		return this.field3786;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1779232418"
	)
	public int method6642() {
		return this.field3812;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-971102710"
	)
	public int method6643() {
		return this.field3792.method7944();
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "525578185"
	)
	public int method6644() {
		return this.field3792.method7993();
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1925639631"
	)
	public int method6645() {
		return this.field3806;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "116"
	)
	public int method6784() {
		return this.field3798;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-99"
	)
	public int method6647() {
		return this.field3792.method7948();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1596302393"
	)
	public int method6648() {
		return this.field3800;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-30"
	)
	public int method6830() {
		return this.field3792.method7949();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1438811815"
	)
	public boolean method6650() {
		return this.method6644() > 1;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-444458900"
	)
	boolean method6651() {
		return this.field3809 != this.field3799;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2144438361"
	)
	String method6652(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6662(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;I)V",
		garbageValue = "200764013"
	)
	void method6653(class517 var1, class517 var2) {
		if ((Integer)var2.field5225 < (Integer)var1.field5225) {
			this.method6608((Integer)var1.field5222, (Integer)var2.field5225);
		} else {
			this.method6608((Integer)var1.field5225, (Integer)var2.field5222);
		}

	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltu;",
		garbageValue = "8"
	)
	class517 method6746(int var1) {
		int var2 = this.field3792.method7984();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6660(this.field3792.method7919(var5 - 1).field4763)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6660(this.field3792.method7919(var5).field4763)) {
				var4 = var5;
				break;
			}
		}

		return new class517(var3, var4);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltu;",
		garbageValue = "23"
	)
	class517 method6655(int var1) {
		int var2 = this.field3792.method7984();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3792.method7919(var5 - 1).field4763 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3792.method7919(var5).field4763 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class517(var3, var4);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "75"
	)
	boolean method6656() {
		if (!this.method6640()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3792.method7984() > this.field3806) {
				this.field3792.method7938(this.field3806, this.field3792.method7984());
				var1 = true;
			}

			int var2 = this.method6644();
			int var3;
			if (this.field3792.method8035() > var2) {
				var3 = this.field3792.method7940(0, var2) - 1;
				this.field3792.method7938(var3, this.field3792.method7984());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3799;
				int var4 = this.field3809;
				int var5 = this.field3792.method7984();
				if (this.field3799 > var5) {
					var3 = var5;
				}

				if (this.field3809 > var5) {
					var4 = var5;
				}

				this.method6608(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-739799736"
	)
	void method6628(int var1, boolean var2) {
		if (var2) {
			this.method6608(this.field3809, var1);
		} else {
			this.method6608(var1, var1);
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1099233004"
	)
	int method6770() {
		return this.field3808 / this.field3792.method7943();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "110733004"
	)
	void method6852() {
		class436 var1 = this.field3792.method7932(0, this.field3799);
		class517 var2 = var1.method8201();
		int var3 = this.field3792.method7943();
		int var4 = (Integer)var2.field5225 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5222 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3786;
		int var9 = var8 + this.field3807;
		int var10 = this.field3812;
		int var11 = var10 + this.field3808;
		int var12 = this.field3786;
		int var13 = this.field3812;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3807;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3808;
		}

		this.method6730(var12, var13);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1787897975"
	)
	boolean method6660(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	void method6661() {
		if (this.field3811 != null) {
			this.field3811.vmethod6510();
		}

	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-5"
	)
	boolean method6662(int var1) {
		switch(this.field3800) {
		case 1:
			return VarpDefinition.isAlphaNumeric((char)var1);
		case 2:
			return class333.isCharAlphabetic((char)var1);
		case 3:
			return WorldMapID.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (WorldMapID.isDigit(var2)) {
				return true;
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') {
					return false;
				}

				return true;
			}
		default:
			return true;
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)Ltu;",
		garbageValue = "55"
	)
	class517 method6663() {
		int var1 = this.field3792.method8059(this.field3807);
		int var2 = this.field3792.method7928(this.field3808);
		return new class517(var1, var2);
	}
}
