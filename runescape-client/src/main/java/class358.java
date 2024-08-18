import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class358 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	class433 field3786;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	class433 field3766;
	@ObfuscatedName("av")
	boolean field3767;
	@ObfuscatedName("ar")
	boolean field3768;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 965865505
	)
	int field3769;
	@ObfuscatedName("ak")
	boolean field3770;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 136645947
	)
	int field3771;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -817034543
	)
	int field3772;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1077852543
	)
	int field3773;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1196995713
	)
	int field3774;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -805232013
	)
	int field3775;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1866712067
	)
	int field3776;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -729918059
	)
	int field3783;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 876091377
	)
	int field3760;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -659477631
	)
	int field3779;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1475382445
	)
	int field3780;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1607259281
	)
	int field3777;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 33899273
	)
	int field3782;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1246999211
	)
	int field3758;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	class350 field3784;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	class350 field3785;

	class358() {
		this.field3786 = new class433();
		this.field3766 = new class433();
		this.field3767 = false;
		this.field3768 = true;
		this.field3769 = 0;
		this.field3770 = false;
		this.field3771 = 0;
		this.field3772 = 0;
		this.field3773 = 0;
		this.field3774 = 0;
		this.field3775 = 0;
		this.field3776 = 0;
		this.field3783 = 0;
		this.field3760 = Integer.MAX_VALUE;
		this.field3779 = Integer.MAX_VALUE;
		this.field3780 = 0;
		this.field3777 = 0;
		this.field3782 = 0;
		this.field3758 = 0;
		this.field3786.method8027(1);
		this.field3766.method8027(1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2107346630"
	)
	void method6639() {
		this.field3769 = (this.field3769 + 1) % 60;
		if (this.field3783 > 0) {
			--this.field3783;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1587607414"
	)
	public boolean method6640(boolean var1) {
		var1 = var1 && this.field3768;
		boolean var2 = this.field3767 != var1;
		this.field3767 = var1;
		if (!this.field3767) {
			this.method6664(this.field3774, this.field3774);
		}

		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1020751639"
	)
	public void method6652(boolean var1) {
		this.field3768 = var1;
		this.field3767 = var1 && this.field3767;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-25"
	)
	public boolean method6642(String var1) {
		String var2 = this.field3786.method8107();
		if (!var2.equals(var1)) {
			var1 = this.method6800(var1);
			this.field3786.method8034(var1);
			this.method6664(this.field3775, this.field3774);
			this.method6880(this.field3782, this.field3758);
			this.method6861();
			this.method6717();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "48044905"
	)
	boolean method6643(String var1) {
		this.field3766.method8034(var1);
		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqv;I)Z",
		garbageValue = "407975723"
	)
	boolean method6751(AbstractFont var1) {
		boolean var2 = !this.field3770;
		this.field3786.method8026(var1);
		this.field3766.method8026(var1);
		this.field3770 = true;
		var2 |= this.method6880(this.field3782, this.field3758);
		var2 |= this.method6664(this.field3775, this.field3774);
		if (this.method6861()) {
			this.method6717();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2086724924"
	)
	public boolean method6645(int var1, int var2) {
		boolean var3 = this.field3780 != var1 || var2 != this.field3777;
		this.field3780 = var1;
		this.field3777 = var2;
		var3 |= this.method6880(this.field3782, this.field3758);
		return var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method6646(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3786.method8045();
		this.field3786.method8023(var1);
		this.field3766.method8023(var1);
		if (this.method6861()) {
			this.method6717();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-109"
	)
	public boolean method6647(int var1) {
		this.field3786.method8144(var1);
		if (this.method6861()) {
			this.method6717();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1134816766"
	)
	public boolean method6648(int var1) {
		this.field3779 = var1;
		if (this.method6861()) {
			this.method6717();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "388321902"
	)
	public boolean method6880(int var1, int var2) {
		if (!this.method6843()) {
			this.field3782 = var1;
			this.field3758 = var2;
			return false;
		} else {
			int var3 = this.field3782;
			int var4 = this.field3758;
			int var5 = Math.max(0, this.field3786.method8047() - this.field3780 + 2);
			int var6 = Math.max(0, this.field3786.method8038() - this.field3777 + 1);
			this.field3782 = Math.max(0, Math.min(var5, var1));
			this.field3758 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3782 || var4 != this.field3758;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "5"
	)
	public boolean method6650(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3786.method8028(var1, var2) : false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-25"
	)
	public void method6798(int var1) {
		this.field3786.method8123(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "94"
	)
	public void method6723(int var1) {
		this.field3771 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "97"
	)
	public void method6653(int var1) {
		this.field3786.method8027(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-150835231"
	)
	public void method6886(int var1) {
		this.field3786.method8025(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2090750267"
	)
	public boolean method6655(int var1) {
		this.field3773 = var1;
		String var2 = this.field3786.method8107();
		int var3 = var2.length();
		var2 = this.method6800(var2);
		if (var2.length() != var3) {
			this.field3786.method8034(var2);
			this.method6880(this.field3782, this.field3758);
			this.method6861();
			this.method6717();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-616142534"
	)
	public void method6656() {
		this.field3770 = false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "2"
	)
	public boolean method6724(int var1) {
		if (this.method6667(var1)) {
			this.method6874();
			class434 var2 = this.field3786.method8016((char)var1, this.field3774, this.field3760);
			this.method6664(var2.method8151(), var2.method8151());
			this.method6861();
			this.method6717();
		}

		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-610397123"
	)
	public void method6787() {
		if (!this.method6874() && this.field3774 > 0) {
			int var1 = this.field3786.method8036(this.field3774 - 1);
			this.method6717();
			this.method6664(var1, var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	public void method6659() {
		if (!this.method6874() && this.field3774 < this.field3786.method8021()) {
			int var1 = this.field3786.method8036(this.field3774);
			this.method6717();
			this.method6664(var1, var1);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-842528836"
	)
	public void method6660() {
		if (!this.method6874() && this.field3774 > 0) {
			class518 var1 = this.method6710(this.field3774 - 1);
			int var2 = this.field3786.method8057((Integer)var1.field5229, this.field3774);
			this.method6717();
			this.method6664(var2, var2);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1952812103"
	)
	public void method6661() {
		if (!this.method6874() && this.field3774 < this.field3786.method8021()) {
			class518 var1 = this.method6710(this.field3774);
			int var2 = this.field3786.method8057(this.field3774, (Integer)var1.field5227);
			this.method6717();
			this.method6664(var2, var2);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1627087090"
	)
	boolean method6874() {
		if (!this.method6707()) {
			return false;
		} else {
			int var1 = this.field3786.method8057(this.field3775, this.field3774);
			this.method6717();
			this.method6664(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1478450620"
	)
	public void method6663() {
		this.method6664(0, this.field3786.method8021());
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "14"
	)
	public boolean method6664(int var1, int var2) {
		if (!this.method6843()) {
			this.field3775 = var1;
			this.field3774 = var2;
			return false;
		} else {
			if (var1 > this.field3786.method8021()) {
				var1 = this.field3786.method8021();
			}

			if (var2 > this.field3786.method8021()) {
				var2 = this.field3786.method8021();
			}

			boolean var3 = this.field3775 != var1 || var2 != this.field3774;
			this.field3775 = var1;
			if (var2 != this.field3774) {
				this.field3774 = var2;
				this.field3769 = 0;
				this.method6715();
			}

			if (var3 && this.field3785 != null) {
				this.field3785.vmethod6542();
			}

			return var3;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1567615802"
	)
	public void method6665(boolean var1) {
		class518 var2 = this.method6711(this.field3774);
		this.method6909((Integer)var2.field5229, var1);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-660522825"
	)
	public void method6666(boolean var1) {
		class518 var2 = this.method6711(this.field3774);
		this.method6909((Integer)var2.field5227, var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "722292258"
	)
	public void method6675(boolean var1) {
		this.method6909(0, var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "117600026"
	)
	public void method6668(boolean var1) {
		this.method6909(this.field3786.method8021(), var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "255"
	)
	public void method6889(boolean var1) {
		if (this.method6707() && !var1) {
			this.method6909(Math.min(this.field3775, this.field3774), var1);
		} else if (this.field3774 > 0) {
			this.method6909(this.field3774 - 1, var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method6685(boolean var1) {
		if (this.method6707() && !var1) {
			this.method6909(Math.max(this.field3775, this.field3774), var1);
		} else if (this.field3774 < this.field3786.method8021()) {
			this.method6909(this.field3774 + 1, var1);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "70"
	)
	public void method6746(boolean var1) {
		if (this.field3774 > 0) {
			class518 var2 = this.method6710(this.field3774 - 1);
			this.method6909((Integer)var2.field5229, var1);
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "14"
	)
	public void method6672(boolean var1) {
		if (this.field3774 < this.field3786.method8021()) {
			class518 var2 = this.method6710(this.field3774 + 1);
			this.method6909((Integer)var2.field5227, var1);
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "35"
	)
	public void method6673(boolean var1) {
		if (this.field3774 > 0) {
			this.method6909(this.field3786.method8039(this.field3774, -1), var1);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-3270"
	)
	public void method6674(boolean var1) {
		if (this.field3774 < this.field3786.method8021()) {
			this.method6909(this.field3786.method8039(this.field3774, 1), var1);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1647122091"
	)
	public void method6823(boolean var1) {
		if (this.field3774 > 0) {
			int var2 = this.method6714();
			this.method6909(this.field3786.method8039(this.field3774, -var2), var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1272915572"
	)
	public void method6676(boolean var1) {
		if (this.field3774 < this.field3786.method8021()) {
			int var2 = this.method6714();
			this.method6909(this.field3786.method8039(this.field3774, var2), var1);
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-118"
	)
	public void method6644(boolean var1) {
		class437 var2 = this.field3786.method8099(0, this.field3774);
		class518 var3 = var2.method8269();
		this.method6909(this.field3786.method8065((Integer)var3.field5229, this.field3758), var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-127"
	)
	public void method6726(boolean var1) {
		class437 var2 = this.field3786.method8099(0, this.field3774);
		class518 var3 = var2.method8269();
		this.method6909(this.field3786.method8065((Integer)var3.field5229, this.field3777 + this.field3758), var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1465602143"
	)
	public void method6679(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class518 var6;
		int var8;
		if (!this.field3770) {
			var8 = 0;
		} else {
			var1 += this.field3782;
			var2 += this.field3758;
			var6 = this.method6719();
			var8 = this.field3786.method8065(var1 - (Integer)var6.field5229, var2 - (Integer)var6.field5227);
		}

		if (var3 && var4) {
			this.field3772 = 1;
			var6 = this.method6710(var8);
			class518 var7 = this.method6710(this.field3776);
			this.method6709(var7, var6);
		} else if (var3) {
			this.field3772 = 1;
			var6 = this.method6710(var8);
			this.method6664((Integer)var6.field5229, (Integer)var6.field5227);
			this.field3776 = (Integer)var6.field5229;
		} else if (var4) {
			this.method6664(this.field3776, var8);
		} else {
			if (this.field3783 > 0 && var8 == this.field3776) {
				if (this.field3775 == this.field3774) {
					this.field3772 = 1;
					var6 = this.method6710(var8);
					this.method6664((Integer)var6.field5229, (Integer)var6.field5227);
				} else {
					this.field3772 = 2;
					var6 = this.method6711(var8);
					this.method6664((Integer)var6.field5229, (Integer)var6.field5227);
				}
			} else {
				this.field3772 = 0;
				this.method6664(var8, var8);
				this.field3776 = var8;
			}

			this.field3783 = 25;
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "81"
	)
	public void method6680(int var1, int var2) {
		if (this.field3770 && this.method6691()) {
			var1 += this.field3782;
			var2 += this.field3758;
			class518 var3 = this.method6719();
			int var4 = this.field3786.method8065(var1 - (Integer)var3.field5229, var2 - (Integer)var3.field5227);
			class518 var5;
			class518 var6;
			switch(this.field3772) {
			case 0:
				this.method6664(this.field3775, var4);
				break;
			case 1:
				var5 = this.method6710(this.field3776);
				var6 = this.method6710(var4);
				this.method6709(var5, var6);
				break;
			case 2:
				var5 = this.method6711(this.field3776);
				var6 = this.method6711(var4);
				this.method6709(var5, var6);
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "64"
	)
	public void method6789(Clipboard var1) {
		class437 var2 = this.field3786.method8099(this.field3775, this.field3774);
		if (!var2.method8289()) {
			String var3 = var2.method8267();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1845370475"
	)
	public void method6682(Clipboard var1) {
		if (this.method6707()) {
			this.method6789(var1);
			this.method6874();
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1813867561"
	)
	public void method6683(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6800((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6874();
				class434 var4 = this.field3786.method8032(var3, this.field3774, this.field3760);
				this.method6664(var4.method8151(), var4.method8151());
				this.method6861();
				this.method6717();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-619205972"
	)
	public void method6742() {
		this.field3758 = Math.max(0, this.field3758 - this.field3786.method8146());
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "245815557"
	)
	public void method6856() {
		int var1 = Math.max(0, this.field3786.method8038() - this.field3777);
		this.field3758 = Math.min(var1, this.field3758 + this.field3786.method8146());
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "-1980020838"
	)
	public void method6686(class350 var1) {
		this.field3784 = var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "164183097"
	)
	public void method6687(class350 var1) {
		this.field3785 = var1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Lqd;",
		garbageValue = "-1596476442"
	)
	public class433 method6712() {
		return this.field3786;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lqd;",
		garbageValue = "-319335341"
	)
	public class433 method6824() {
		return this.field3766;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lqx;",
		garbageValue = "-2135530826"
	)
	public class437 method6881() {
		return this.field3786.method8099(this.field3775, this.field3774);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1767921415"
	)
	public boolean method6691() {
		return this.field3767;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "80"
	)
	public boolean method6692() {
		return this.field3768;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method6862() {
		return this.method6691() && this.field3769 % 60 < 30;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "224006048"
	)
	public int method6694() {
		return this.field3774;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1043277340"
	)
	public int method6695() {
		return this.field3775;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-66"
	)
	public boolean method6843() {
		return this.field3770;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1923847940"
	)
	public int method6697() {
		return this.field3782;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2115890981"
	)
	public int method6698() {
		return this.field3758;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1429463424"
	)
	public int method6699() {
		return this.field3786.method8045();
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-304532023"
	)
	public int method6700() {
		return this.field3786.method8086();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2085581390"
	)
	public int method6701() {
		return this.field3779;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method6702() {
		return this.field3771;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2045755560"
	)
	public int method6678() {
		return this.field3786.method8056();
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2138276482"
	)
	public int method6704() {
		return this.field3773;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1411263892"
	)
	public int method6705() {
		return this.field3786.method8048();
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1376944106"
	)
	public boolean method6706() {
		return this.method6700() > 1;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	boolean method6707() {
		return this.field3775 != this.field3774;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "11"
	)
	String method6800(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6667(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ltj;Ltj;B)V",
		garbageValue = "55"
	)
	void method6709(class518 var1, class518 var2) {
		if ((Integer)var2.field5229 < (Integer)var1.field5229) {
			this.method6664((Integer)var1.field5227, (Integer)var2.field5229);
		} else {
			this.method6664((Integer)var1.field5229, (Integer)var2.field5227);
		}

	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltj;",
		garbageValue = "37"
	)
	class518 method6710(int var1) {
		int var2 = this.field3786.method8021();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6716(this.field3786.method8017(var5 - 1).field4747)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6716(this.field3786.method8017(var5).field4747)) {
				var4 = var5;
				break;
			}
		}

		return new class518(var3, var4);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)Ltj;",
		garbageValue = "1556737961"
	)
	class518 method6711(int var1) {
		int var2 = this.field3786.method8021();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3786.method8017(var5 - 1).field4747 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3786.method8017(var5).field4747 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class518(var3, var4);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1524449330"
	)
	boolean method6861() {
		if (!this.method6843()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3786.method8021() > this.field3779) {
				this.field3786.method8057(this.field3779, this.field3786.method8021());
				var1 = true;
			}

			int var2 = this.method6700();
			int var3;
			if (this.field3786.method8089() > var2) {
				var3 = this.field3786.method8039(0, var2) - 1;
				this.field3786.method8057(var3, this.field3786.method8021());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3774;
				int var4 = this.field3775;
				int var5 = this.field3786.method8021();
				if (this.field3774 > var5) {
					var3 = var5;
				}

				if (this.field3775 > var5) {
					var4 = var5;
				}

				this.method6664(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "133577075"
	)
	void method6909(int var1, boolean var2) {
		if (var2) {
			this.method6664(this.field3775, var1);
		} else {
			this.method6664(var1, var1);
		}

	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1635835271"
	)
	int method6714() {
		return this.field3777 / this.field3786.method8146();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	void method6715() {
		class437 var1 = this.field3786.method8099(0, this.field3774);
		class518 var2 = var1.method8269();
		int var3 = this.field3786.method8146();
		int var4 = (Integer)var2.field5229 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5227 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3782;
		int var9 = var8 + this.field3780;
		int var10 = this.field3758;
		int var11 = var10 + this.field3777;
		int var12 = this.field3782;
		int var13 = this.field3758;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3780;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3777;
		}

		this.method6880(var12, var13);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "405724614"
	)
	boolean method6716(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1109244663"
	)
	void method6717() {
		if (this.field3784 != null) {
			this.field3784.vmethod6542();
		}

	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1906837505"
	)
	boolean method6667(int var1) {
		switch(this.field3773) {
		case 1:
			return class148.isAlphaNumeric((char)var1);
		case 2:
			return MusicSong.isCharAlphabetic((char)var1);
		case 3:
			return Sound.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (Sound.isDigit(var2)) {
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

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)Ltj;",
		garbageValue = "-1486493147"
	)
	class518 method6719() {
		int var1 = this.field3786.method8085(this.field3780);
		int var2 = this.field3786.method8069(this.field3777);
		return new class518(var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "61336381"
	)
	static int method6931(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)Lnq;",
		garbageValue = "1055473595"
	)
	static Widget method6669(Widget var0) {
		int var1 = AuthenticationScheme.method3313(SpriteMask.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = FloorUnderlayDefinition.widgetDefinition.method6544(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
