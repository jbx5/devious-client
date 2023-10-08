import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class344 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	class409 field3634;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	class409 field3658;
	@ObfuscatedName("ae")
	boolean field3653;
	@ObfuscatedName("aw")
	boolean field3640;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -286517097
	)
	int field3629;
	@ObfuscatedName("az")
	boolean field3642;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 433913125
	)
	int field3643;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1855293077
	)
	int field3648;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 513255703
	)
	int field3639;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1553113311
	)
	int field3646;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -301492353
	)
	int field3647;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1848989437
	)
	int field3645;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -830849715
	)
	int field3649;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1721588169
	)
	int field3650;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1477303877
	)
	int field3651;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 98211697
	)
	int field3652;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1299374005
	)
	int field3637;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -211082193
	)
	int field3641;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 655548705
	)
	int field3655;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	class337 field3656;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	class337 field3657;

	class344() {
		this.field3634 = new class409();
		this.field3658 = new class409();
		this.field3653 = false;
		this.field3640 = true;
		this.field3629 = 0;
		this.field3642 = false;
		this.field3643 = 0;
		this.field3648 = 0;
		this.field3639 = 0;
		this.field3646 = 0;
		this.field3647 = 0;
		this.field3645 = 0;
		this.field3649 = 0;
		this.field3650 = Integer.MAX_VALUE;
		this.field3651 = Integer.MAX_VALUE;
		this.field3652 = 0;
		this.field3637 = 0;
		this.field3641 = 0;
		this.field3655 = 0;
		this.field3634.method7473(1);
		this.field3658.method7473(1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	void method6397() {
		this.field3629 = (this.field3629 + 1) % 60;
		if (this.field3649 > 0) {
			--this.field3649;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "523317409"
	)
	public boolean method6304(boolean var1) {
		var1 = var1 && this.field3640;
		boolean var2 = this.field3653 != var1;
		this.field3653 = var1;
		if (!this.field3653) {
			this.method6314(this.field3646, this.field3646);
		}

		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1481904343"
	)
	public void method6305(boolean var1) {
		this.field3640 = var1;
		this.field3653 = var1 && this.field3653;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2133127223"
	)
	public boolean method6306(String var1) {
		String var2 = this.field3634.method7468();
		if (!var2.equals(var1)) {
			var1 = this.method6543(var1);
			this.field3634.method7552(var1);
			this.method6314(this.field3647, this.field3646);
			this.method6313(this.field3641, this.field3655);
			this.method6376();
			this.method6567();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1293964055"
	)
	boolean method6307(String var1) {
		this.field3658.method7552(var1);
		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpk;I)Z",
		garbageValue = "2045619310"
	)
	boolean method6308(AbstractFont var1) {
		boolean var2 = !this.field3642;
		this.field3634.method7472(var1);
		this.field3658.method7472(var1);
		this.field3642 = true;
		var2 |= this.method6313(this.field3641, this.field3655);
		var2 |= this.method6314(this.field3647, this.field3646);
		if (this.method6376()) {
			this.method6567();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "70"
	)
	public boolean method6501(int var1, int var2) {
		boolean var3 = this.field3652 != var1 || var2 != this.field3637;
		this.field3652 = var1;
		this.field3637 = var2;
		var3 |= this.method6313(this.field3641, this.field3655);
		return var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-74"
	)
	public boolean method6321(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3634.method7476();
		this.field3634.method7527(var1);
		this.field3658.method7527(var1);
		if (this.method6376()) {
			this.method6567();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "6"
	)
	public boolean method6311(int var1) {
		this.field3634.method7470(var1);
		if (this.method6376()) {
			this.method6567();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1717570728"
	)
	public boolean method6412(int var1) {
		this.field3651 = var1;
		if (this.method6376()) {
			this.method6567();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1634456183"
	)
	public boolean method6313(int var1, int var2) {
		if (!this.method6360()) {
			this.field3641 = var1;
			this.field3655 = var2;
			return false;
		} else {
			int var3 = this.field3641;
			int var4 = this.field3655;
			int var5 = Math.max(0, this.field3634.method7486() - this.field3652 + 2);
			int var6 = Math.max(0, this.field3634.method7487() - this.field3637 + 1);
			this.field3641 = Math.max(0, Math.min(var5, var1));
			this.field3655 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3641 || var4 != this.field3655;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2093677654"
	)
	public boolean method6537(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3634.method7474(var1, var2) : false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-939191131"
	)
	public void method6315(int var1) {
		this.field3634.method7475(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-592386576"
	)
	public void method6316(int var1) {
		this.field3643 = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	public void method6317(int var1) {
		this.field3634.method7473(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1498031514"
	)
	public void method6318(int var1) {
		this.field3634.method7471(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "180"
	)
	public boolean method6319(int var1) {
		this.field3639 = var1;
		String var2 = this.field3634.method7468();
		int var3 = var2.length();
		var2 = this.method6543(var2);
		if (var2.length() != var3) {
			this.field3634.method7552(var2);
			this.method6313(this.field3641, this.field3655);
			this.method6376();
			this.method6567();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-969199499"
	)
	public void method6486() {
		this.field3642 = false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "4138"
	)
	public boolean method6333(int var1) {
		if (this.method6382(var1)) {
			this.method6326();
			class410 var2 = this.field3634.method7583((char)var1, this.field3646, this.field3650);
			this.method6314(var2.method7603(), var2.method7603());
			this.method6376();
			this.method6567();
		}

		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "755624940"
	)
	public void method6322() {
		if (!this.method6326() && this.field3646 > 0) {
			int var1 = this.field3634.method7482(this.field3646 - 1);
			this.method6567();
			this.method6314(var1, var1);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	public void method6495() {
		if (!this.method6326() && this.field3646 < this.field3634.method7467()) {
			int var1 = this.field3634.method7482(this.field3646);
			this.method6567();
			this.method6314(var1, var1);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2101637945"
	)
	public void method6479() {
		if (!this.method6326() && this.field3646 > 0) {
			class500 var1 = this.method6374(this.field3646 - 1);
			int var2 = this.field3634.method7483((Integer)var1.field5003, this.field3646);
			this.method6567();
			this.method6314(var2, var2);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-882101391"
	)
	public void method6563() {
		if (!this.method6326() && this.field3646 < this.field3634.method7467()) {
			class500 var1 = this.method6374(this.field3646);
			int var2 = this.field3634.method7483(this.field3646, (Integer)var1.field5004);
			this.method6567();
			this.method6314(var2, var2);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-639259447"
	)
	boolean method6326() {
		if (!this.method6565()) {
			return false;
		} else {
			int var1 = this.field3634.method7483(this.field3647, this.field3646);
			this.method6567();
			this.method6314(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	public void method6327() {
		this.method6314(0, this.field3634.method7467());
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-504671047"
	)
	public boolean method6314(int var1, int var2) {
		if (!this.method6360()) {
			this.field3647 = var1;
			this.field3646 = var2;
			return false;
		} else {
			if (var1 > this.field3634.method7467()) {
				var1 = this.field3634.method7467();
			}

			if (var2 > this.field3634.method7467()) {
				var2 = this.field3634.method7467();
			}

			boolean var3 = this.field3647 != var1 || var2 != this.field3646;
			this.field3647 = var1;
			if (var2 != this.field3646) {
				this.field3646 = var2;
				this.field3629 = 0;
				this.method6379();
			}

			if (var3 && this.field3657 != null) {
				this.field3657.vmethod6238();
			}

			return var3;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "55"
	)
	public void method6481(boolean var1) {
		class500 var2 = this.method6375(this.field3646);
		this.method6377((Integer)var2.field5003, var1);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2010552592"
	)
	public void method6330(boolean var1) {
		class500 var2 = this.method6375(this.field3646);
		this.method6377((Integer)var2.field5004, var1);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-81"
	)
	public void method6331(boolean var1) {
		this.method6377(0, var1);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1475070773"
	)
	public void method6332(boolean var1) {
		this.method6377(this.field3634.method7467(), var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1914804723"
	)
	public void method6453(boolean var1) {
		if (this.method6565() && !var1) {
			this.method6377(Math.min(this.field3647, this.field3646), var1);
		} else if (this.field3646 > 0) {
			this.method6377(this.field3646 - 1, var1);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1254852438"
	)
	public void method6334(boolean var1) {
		if (this.method6565() && !var1) {
			this.method6377(Math.max(this.field3647, this.field3646), var1);
		} else if (this.field3646 < this.field3634.method7467()) {
			this.method6377(this.field3646 + 1, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1246989574"
	)
	public void method6335(boolean var1) {
		if (this.field3646 > 0) {
			class500 var2 = this.method6374(this.field3646 - 1);
			this.method6377((Integer)var2.field5003, var1);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-589145055"
	)
	public void method6336(boolean var1) {
		if (this.field3646 < this.field3634.method7467()) {
			class500 var2 = this.method6374(this.field3646 + 1);
			this.method6377((Integer)var2.field5004, var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1596308602"
	)
	public void method6337(boolean var1) {
		if (this.field3646 > 0) {
			this.method6377(this.field3634.method7485(this.field3646, -1), var1);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1852812163"
	)
	public void method6338(boolean var1) {
		if (this.field3646 < this.field3634.method7467()) {
			this.method6377(this.field3634.method7485(this.field3646, 1), var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-28"
	)
	public void method6339(boolean var1) {
		if (this.field3646 > 0) {
			int var2 = this.method6378();
			this.method6377(this.field3634.method7485(this.field3646, -var2), var1);
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-196223675"
	)
	public void method6340(boolean var1) {
		if (this.field3646 < this.field3634.method7467()) {
			int var2 = this.method6378();
			this.method6377(this.field3634.method7485(this.field3646, var2), var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "18712"
	)
	public void method6341(boolean var1) {
		class413 var2 = this.field3634.method7549(0, this.field3646);
		class500 var3 = var2.method7711();
		this.method6377(this.field3634.method7484((Integer)var3.field5003, this.field3655), var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-124"
	)
	public void method6342(boolean var1) {
		class413 var2 = this.field3634.method7549(0, this.field3646);
		class500 var3 = var2.method7711();
		this.method6377(this.field3634.method7484((Integer)var3.field5003, this.field3637 + this.field3655), var1);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1267266894"
	)
	public void method6343(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class500 var6;
		int var8;
		if (!this.field3642) {
			var8 = 0;
		} else {
			var1 += this.field3641;
			var2 += this.field3655;
			var6 = this.method6569();
			var8 = this.field3634.method7484(var1 - (Integer)var6.field5003, var2 - (Integer)var6.field5004);
		}

		if (var3 && var4) {
			this.field3648 = 1;
			var6 = this.method6374(var8);
			class500 var7 = this.method6374(this.field3645);
			this.method6303(var7, var6);
		} else if (var3) {
			this.field3648 = 1;
			var6 = this.method6374(var8);
			this.method6314((Integer)var6.field5003, (Integer)var6.field5004);
			this.field3645 = (Integer)var6.field5003;
		} else if (var4) {
			this.method6314(this.field3645, var8);
		} else {
			if (this.field3649 > 0 && var8 == this.field3645) {
				if (this.field3646 == this.field3647) {
					this.field3648 = 1;
					var6 = this.method6374(var8);
					this.method6314((Integer)var6.field5003, (Integer)var6.field5004);
				} else {
					this.field3648 = 2;
					var6 = this.method6375(var8);
					this.method6314((Integer)var6.field5003, (Integer)var6.field5004);
				}
			} else {
				this.field3648 = 0;
				this.method6314(var8, var8);
				this.field3645 = var8;
			}

			this.field3649 = 25;
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1597491058"
	)
	public void method6562(int var1, int var2) {
		if (this.field3642 && this.method6355()) {
			var1 += this.field3641;
			var2 += this.field3655;
			class500 var3 = this.method6569();
			int var4 = this.field3634.method7484(var1 - (Integer)var3.field5003, var2 - (Integer)var3.field5004);
			class500 var5;
			class500 var6;
			switch(this.field3648) {
			case 0:
				this.method6314(this.field3647, var4);
				break;
			case 1:
				var5 = this.method6374(this.field3645);
				var6 = this.method6374(var4);
				this.method6303(var5, var6);
				break;
			case 2:
				var5 = this.method6375(this.field3645);
				var6 = this.method6375(var4);
				this.method6303(var5, var6);
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-839335368"
	)
	public void method6345(Clipboard var1) {
		class413 var2 = this.field3634.method7549(this.field3647, this.field3646);
		if (!var2.method7707()) {
			String var3 = var2.method7720();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "2087668691"
	)
	public void method6454(Clipboard var1) {
		if (this.method6565()) {
			this.method6345(var1);
			this.method6326();
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "84"
	)
	public void method6508(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6543((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6326();
				class410 var4 = this.field3634.method7478(var3, this.field3646, this.field3650);
				this.method6314(var4.method7603(), var4.method7603());
				this.method6376();
				this.method6567();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method6411() {
		this.field3655 = Math.max(0, this.field3655 - this.field3634.method7488());
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-794433961"
	)
	public void method6320() {
		int var1 = Math.max(0, this.field3634.method7487() - this.field3637);
		this.field3655 = Math.min(var1, this.field3655 + this.field3634.method7488());
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)V",
		garbageValue = "-1738038140"
	)
	public void method6350(class337 var1) {
		this.field3656 = var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)V",
		garbageValue = "1967767680"
	)
	public void method6349(class337 var1) {
		this.field3657 = var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)Lpp;",
		garbageValue = "-4"
	)
	public class409 method6532() {
		return this.field3634;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lpp;",
		garbageValue = "1583287029"
	)
	public class409 method6353() {
		return this.field3658;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lpr;",
		garbageValue = "1493883876"
	)
	public class413 method6354() {
		return this.field3634.method7549(this.field3647, this.field3646);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "435699001"
	)
	public boolean method6355() {
		return this.field3653;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "515348942"
	)
	public boolean method6356() {
		return this.field3640;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "30"
	)
	public boolean method6357() {
		return this.method6355() && this.field3629 % 60 < 30;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-272595100"
	)
	public int method6358() {
		return this.field3646;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int method6359() {
		return this.field3647;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1559709726"
	)
	public boolean method6360() {
		return this.field3642;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1987240412"
	)
	public int method6361() {
		return this.field3641;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-123"
	)
	public int method6362() {
		return this.field3655;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1717649091"
	)
	public int method6523() {
		return this.field3634.method7476();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	public int method6364() {
		return this.field3634.method7504();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "418287158"
	)
	public int method6365() {
		return this.field3651;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "250709855"
	)
	public int method6302() {
		return this.field3643;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-150919313"
	)
	public int method6367() {
		return this.field3634.method7493();
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "128"
	)
	public int method6368() {
		return this.field3639;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "29102"
	)
	public int method6372() {
		return this.field3634.method7494();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "114534110"
	)
	public boolean method6370() {
		return this.method6364() > 1;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-455222882"
	)
	boolean method6565() {
		return this.field3646 != this.field3647;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-21"
	)
	String method6543(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6382(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ltw;Ltw;I)V",
		garbageValue = "1806400604"
	)
	void method6303(class500 var1, class500 var2) {
		if ((Integer)var2.field5003 < (Integer)var1.field5003) {
			this.method6314((Integer)var1.field5004, (Integer)var2.field5003);
		} else {
			this.method6314((Integer)var1.field5003, (Integer)var2.field5004);
		}

	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)Ltw;",
		garbageValue = "1967174247"
	)
	class500 method6374(int var1) {
		int var2 = this.field3634.method7467();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6380(this.field3634.method7463(var5 - 1).field4523)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6380(this.field3634.method7463(var5).field4523)) {
				var4 = var5;
				break;
			}
		}

		return new class500(var3, var4);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Ltw;",
		garbageValue = "-1936541681"
	)
	class500 method6375(int var1) {
		int var2 = this.field3634.method7467();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3634.method7463(var5 - 1).field4523 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3634.method7463(var5).field4523 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class500(var3, var4);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1778479023"
	)
	boolean method6376() {
		if (!this.method6360()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3634.method7467() > this.field3651) {
				this.field3634.method7483(this.field3651, this.field3634.method7467());
				var1 = true;
			}

			int var2 = this.method6364();
			int var3;
			if (this.field3634.method7489() > var2) {
				var3 = this.field3634.method7485(0, var2) - 1;
				this.field3634.method7483(var3, this.field3634.method7467());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3646;
				int var4 = this.field3647;
				int var5 = this.field3634.method7467();
				if (this.field3646 > var5) {
					var3 = var5;
				}

				if (this.field3647 > var5) {
					var4 = var5;
				}

				this.method6314(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1307117212"
	)
	void method6377(int var1, boolean var2) {
		if (var2) {
			this.method6314(this.field3647, var1);
		} else {
			this.method6314(var1, var1);
		}

	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "996246059"
	)
	int method6378() {
		return this.field3637 / this.field3634.method7488();
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1596440102"
	)
	void method6379() {
		class413 var1 = this.field3634.method7549(0, this.field3646);
		class500 var2 = var1.method7711();
		int var3 = this.field3634.method7488();
		int var4 = (Integer)var2.field5003 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5004 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3641;
		int var9 = var8 + this.field3652;
		int var10 = this.field3655;
		int var11 = var10 + this.field3637;
		int var12 = this.field3641;
		int var13 = this.field3655;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3652;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3637;
		}

		this.method6313(var12, var13);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "5"
	)
	boolean method6380(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "844665494"
	)
	void method6567() {
		if (this.field3656 != null) {
			this.field3656.vmethod6238();
		}

	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method6382(int var1) {
		switch(this.field3639) {
		case 1:
			return Decimator.isAlphaNumeric((char)var1);
		case 2:
			return class135.isCharAlphabetic((char)var1);
		case 3:
			return IsaacCipher.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (IsaacCipher.isDigit(var2)) {
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

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)Ltw;",
		garbageValue = "-1694076835"
	)
	class500 method6569() {
		int var1 = this.field3634.method7495(this.field3652);
		int var2 = this.field3634.method7595(this.field3637);
		return new class500(var1, var2);
	}
}
