import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public class class360 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1547070923
	)
	static int field3813;
	@ObfuscatedName("jt")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	class435 field3812;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	class435 field3807;
	@ObfuscatedName("as")
	boolean field3823;
	@ObfuscatedName("ay")
	boolean field3815;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1572926641
	)
	int field3816;
	@ObfuscatedName("av")
	boolean field3814;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -136937227
	)
	int field3818;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -659549073
	)
	int field3824;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 481042769
	)
	int field3830;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1382295725
	)
	int field3821;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1769221039
	)
	int field3822;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1628739947
	)
	int field3833;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -135842677
	)
	int field3834;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -469093959
	)
	int field3825;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 888722909
	)
	int field3826;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 430265267
	)
	int field3827;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1564355311
	)
	int field3828;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1210694197
	)
	int field3829;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -418263167
	)
	int field3817;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	class352 field3831;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	class352 field3832;

	class360() {
		this.field3812 = new class435();
		this.field3807 = new class435();
		this.field3823 = false;
		this.field3815 = true;
		this.field3816 = 0;
		this.field3814 = false;
		this.field3818 = 0;
		this.field3824 = 0;
		this.field3830 = 0;
		this.field3821 = 0;
		this.field3822 = 0;
		this.field3833 = 0;
		this.field3834 = 0;
		this.field3825 = Integer.MAX_VALUE;
		this.field3826 = Integer.MAX_VALUE;
		this.field3827 = 0;
		this.field3828 = 0;
		this.field3829 = 0;
		this.field3817 = 0;
		this.field3812.method8288(1);
		this.field3807.method8288(1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-921972435"
	)
	void method6952() {
		this.field3816 = (this.field3816 + 1) % 60;
		if (this.field3834 > 0) {
			--this.field3834;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1628077642"
	)
	public boolean method6953(boolean var1) {
		var1 = var1 && this.field3815;
		boolean var2 = this.field3823 != var1;
		this.field3823 = var1;
		if (!this.field3823) {
			this.method6977(this.field3821, this.field3821);
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-27106"
	)
	public void method6954(boolean var1) {
		this.field3815 = var1;
		this.field3823 = var1 && this.field3823;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1810541704"
	)
	public boolean method7231(String var1) {
		String var2 = this.field3812.method8367();
		if (!var2.equals(var1)) {
			var1 = this.method7021(var1);
			this.field3812.method8350(var1);
			this.method6977(this.field3822, this.field3821);
			this.method6962(this.field3829, this.field3817);
			this.method7156();
			this.method7030();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "1"
	)
	boolean method7133(String var1) {
		this.field3807.method8350(var1);
		return true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqk;S)Z",
		garbageValue = "-19149"
	)
	boolean method7092(AbstractFont var1) {
		boolean var2 = !this.field3814;
		this.field3812.method8287(var1);
		this.field3807.method8287(var1);
		this.field3814 = true;
		var2 |= this.method6962(this.field3829, this.field3817);
		var2 |= this.method6977(this.field3822, this.field3821);
		if (this.method7156()) {
			this.method7030();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "48"
	)
	public boolean method6958(int var1, int var2) {
		boolean var3 = this.field3827 != var1 || var2 != this.field3828;
		this.field3827 = var1;
		this.field3828 = var2;
		var3 |= this.method6962(this.field3829, this.field3817);
		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1270852262"
	)
	public boolean method7125(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3812.method8306();
		this.field3812.method8284(var1);
		this.field3807.method8284(var1);
		if (this.method7156()) {
			this.method7030();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-80223600"
	)
	public boolean method6960(int var1) {
		this.field3812.method8285(var1);
		if (this.method7156()) {
			this.method7030();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-496554117"
	)
	public boolean method6995(int var1) {
		this.field3826 = var1;
		if (this.method7156()) {
			this.method7030();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1985987913"
	)
	public boolean method6962(int var1, int var2) {
		if (!this.method7009()) {
			this.field3829 = var1;
			this.field3817 = var2;
			return false;
		} else {
			int var3 = this.field3829;
			int var4 = this.field3817;
			int var5 = Math.max(0, this.field3812.method8301() - this.field3827 + 2);
			int var6 = Math.max(0, this.field3812.method8302() - this.field3828 + 1);
			this.field3829 = Math.max(0, Math.min(var5, var1));
			this.field3817 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3829 || var4 != this.field3817;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-16287"
	)
	public boolean method6963(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3812.method8289(var1, var2) : false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "36"
	)
	public void method6964(int var1) {
		this.field3812.method8290(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1948299368"
	)
	public void method7217(int var1) {
		this.field3818 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	public void method6966(int var1) {
		this.field3812.method8288(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1598550304"
	)
	public void method7162(int var1) {
		this.field3812.method8309(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1202084940"
	)
	public boolean method7008(int var1) {
		this.field3830 = var1;
		String var2 = this.field3812.method8367();
		int var3 = var2.length();
		var2 = this.method7021(var2);
		if (var2.length() != var3) {
			this.field3812.method8350(var2);
			this.method6962(this.field3829, this.field3817);
			this.method7156();
			this.method7030();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	public void method6969() {
		this.field3814 = false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-955475894"
	)
	public boolean method6970(int var1) {
		if (this.method7031(var1)) {
			this.method6967();
			class436 var2 = this.field3812.method8292((char)var1, this.field3821, this.field3825);
			this.method6977(var2.method8417(), var2.method8417());
			this.method7156();
			this.method7030();
		}

		return true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2139152823"
	)
	public void method6971() {
		if (!this.method6967() && this.field3821 > 0) {
			int var1 = this.field3812.method8312(this.field3821 - 1);
			this.method7030();
			this.method6977(var1, var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "841946261"
	)
	public void method7081() {
		if (!this.method6967() && this.field3821 < this.field3812.method8345()) {
			int var1 = this.field3812.method8312(this.field3821);
			this.method7030();
			this.method6977(var1, var1);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-200854668"
	)
	public void method6973() {
		if (!this.method6967() && this.field3821 > 0) {
			class520 var1 = this.method7023(this.field3821 - 1);
			int var2 = this.field3812.method8396((Integer)var1.field5264, this.field3821);
			this.method7030();
			this.method6977(var2, var2);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method7183() {
		if (!this.method6967() && this.field3821 < this.field3812.method8345()) {
			class520 var1 = this.method7023(this.field3821);
			int var2 = this.field3812.method8396(this.field3821, (Integer)var1.field5265);
			this.method7030();
			this.method6977(var2, var2);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-104"
	)
	boolean method6967() {
		if (!this.method6957()) {
			return false;
		} else {
			int var1 = this.field3812.method8396(this.field3822, this.field3821);
			this.method7030();
			this.method6977(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1231855695"
	)
	public void method7068() {
		this.method6977(0, this.field3812.method8345());
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "597424712"
	)
	public boolean method6977(int var1, int var2) {
		if (!this.method7009()) {
			this.field3822 = var1;
			this.field3821 = var2;
			return false;
		} else {
			if (var1 > this.field3812.method8345()) {
				var1 = this.field3812.method8345();
			}

			if (var2 > this.field3812.method8345()) {
				var2 = this.field3812.method8345();
			}

			boolean var3 = this.field3822 != var1 || var2 != this.field3821;
			this.field3822 = var1;
			if (var2 != this.field3821) {
				this.field3821 = var2;
				this.field3816 = 0;
				this.method7028();
			}

			if (var3 && this.field3832 != null) {
				this.field3832.vmethod6836();
			}

			return var3;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-967682496"
	)
	public void method6978(boolean var1) {
		class520 var2 = this.method7158(this.field3821);
		this.method7026((Integer)var2.field5264, var1);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1089271096"
	)
	public void method6979(boolean var1) {
		class520 var2 = this.method7158(this.field3821);
		this.method7026((Integer)var2.field5265, var1);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "466441964"
	)
	public void method7119(boolean var1) {
		this.method7026(0, var1);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1498090903"
	)
	public void method6981(boolean var1) {
		this.method7026(this.field3812.method8345(), var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "420832671"
	)
	public void method6982(boolean var1) {
		if (this.method6957() && !var1) {
			this.method7026(Math.min(this.field3822, this.field3821), var1);
		} else if (this.field3821 > 0) {
			this.method7026(this.field3821 - 1, var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1337021251"
	)
	public void method7170(boolean var1) {
		if (this.method6957() && !var1) {
			this.method7026(Math.max(this.field3822, this.field3821), var1);
		} else if (this.field3821 < this.field3812.method8345()) {
			this.method7026(this.field3821 + 1, var1);
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1876532395"
	)
	public void method6984(boolean var1) {
		if (this.field3821 > 0) {
			class520 var2 = this.method7023(this.field3821 - 1);
			this.method7026((Integer)var2.field5264, var1);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6985(boolean var1) {
		if (this.field3821 < this.field3812.method8345()) {
			class520 var2 = this.method7023(this.field3821 + 1);
			this.method7026((Integer)var2.field5265, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1337983762"
	)
	public void method7175(boolean var1) {
		if (this.field3821 > 0) {
			this.method7026(this.field3812.method8300(this.field3821, -1), var1);
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-200480724"
	)
	public void method7033(boolean var1) {
		if (this.field3821 < this.field3812.method8345()) {
			this.method7026(this.field3812.method8300(this.field3821, 1), var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "428945884"
	)
	public void method6988(boolean var1) {
		if (this.field3821 > 0) {
			int var2 = this.method7027();
			this.method7026(this.field3812.method8300(this.field3821, -var2), var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "17"
	)
	public void method6989(boolean var1) {
		if (this.field3821 < this.field3812.method8345()) {
			int var2 = this.method7027();
			this.method7026(this.field3812.method8300(this.field3821, var2), var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1386986591"
	)
	public void method6959(boolean var1) {
		class439 var2 = this.field3812.method8291(0, this.field3821);
		class520 var3 = var2.method8552();
		this.method7026(this.field3812.method8299((Integer)var3.field5264, this.field3817), var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1072301226"
	)
	public void method6991(boolean var1) {
		class439 var2 = this.field3812.method8291(0, this.field3821);
		class520 var3 = var2.method8552();
		this.method7026(this.field3812.method8299((Integer)var3.field5264, this.field3817 + this.field3828), var1);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-2024643238"
	)
	public void method7055(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class520 var6;
		int var8;
		if (!this.field3814) {
			var8 = 0;
		} else {
			var1 += this.field3829;
			var2 += this.field3817;
			var6 = this.method7032();
			var8 = this.field3812.method8299(var1 - (Integer)var6.field5264, var2 - (Integer)var6.field5265);
		}

		if (var3 && var4) {
			this.field3824 = 1;
			var6 = this.method7023(var8);
			class520 var7 = this.method7023(this.field3833);
			this.method7100(var7, var6);
		} else if (var3) {
			this.field3824 = 1;
			var6 = this.method7023(var8);
			this.method6977((Integer)var6.field5264, (Integer)var6.field5265);
			this.field3833 = (Integer)var6.field5264;
		} else if (var4) {
			this.method6977(this.field3833, var8);
		} else {
			if (this.field3834 > 0 && var8 == this.field3833) {
				if (this.field3822 == this.field3821) {
					this.field3824 = 1;
					var6 = this.method7023(var8);
					this.method6977((Integer)var6.field5264, (Integer)var6.field5265);
				} else {
					this.field3824 = 2;
					var6 = this.method7158(var8);
					this.method6977((Integer)var6.field5264, (Integer)var6.field5265);
				}
			} else {
				this.field3824 = 0;
				this.method6977(var8, var8);
				this.field3833 = var8;
			}

			this.field3834 = 25;
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "84"
	)
	public void method6993(int var1, int var2) {
		if (this.field3814 && this.method7004()) {
			var1 += this.field3829;
			var2 += this.field3817;
			class520 var3 = this.method7032();
			int var4 = this.field3812.method8299(var1 - (Integer)var3.field5264, var2 - (Integer)var3.field5265);
			class520 var5;
			class520 var6;
			switch(this.field3824) {
			case 0:
				this.method6977(this.field3822, var4);
				break;
			case 1:
				var5 = this.method7023(this.field3833);
				var6 = this.method7023(var4);
				this.method7100(var5, var6);
				break;
			case 2:
				var5 = this.method7158(this.field3833);
				var6 = this.method7158(var4);
				this.method7100(var5, var6);
			}
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1992428461"
	)
	public void method6994(Clipboard var1) {
		class439 var2 = this.field3812.method8291(this.field3822, this.field3821);
		if (!var2.method8549()) {
			String var3 = var2.method8547();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-3165036"
	)
	public void method7022(Clipboard var1) {
		if (this.method6957()) {
			this.method6994(var1);
			this.method6967();
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1368513143"
	)
	public void method6996(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7021((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6967();
				class436 var4 = this.field3812.method8357(var3, this.field3821, this.field3825);
				this.method6977(var4.method8417(), var4.method8417());
				this.method7156();
				this.method7030();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1913272015"
	)
	public void method6997() {
		this.field3817 = Math.max(0, this.field3817 - this.field3812.method8340());
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method6998() {
		int var1 = Math.max(0, this.field3812.method8302() - this.field3828);
		this.field3817 = Math.min(var1, this.field3817 + this.field3812.method8340());
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "-2017826927"
	)
	public void method7000(class352 var1) {
		this.field3831 = var1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lni;B)V",
		garbageValue = "-83"
	)
	public void method7189(class352 var1) {
		this.field3832 = var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "-365867306"
	)
	public class435 method7048() {
		return this.field3812;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "-2011425237"
	)
	public class435 method7002() {
		return this.field3807;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Lqw;",
		garbageValue = "-1"
	)
	public class439 method7003() {
		return this.field3812.method8291(this.field3822, this.field3821);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1395233286"
	)
	public boolean method7004() {
		return this.field3823;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1597991474"
	)
	public boolean method7005() {
		return this.field3815;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1001243433"
	)
	public boolean method7006() {
		return this.method7004() && this.field3816 % 60 < 30;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "549954819"
	)
	public int method7007() {
		return this.field3821;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	public int method7087() {
		return this.field3822;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1027766515"
	)
	public boolean method7009() {
		return this.field3814;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243446200"
	)
	public int method7010() {
		return this.field3829;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1209143128"
	)
	public int method6956() {
		return this.field3817;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-137846393"
	)
	public int method7123() {
		return this.field3812.method8306();
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-198478463"
	)
	public int method7013() {
		return this.field3812.method8307();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2087549703"
	)
	public int method7211() {
		return this.field3826;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "44458136"
	)
	public int method7015() {
		return this.field3818;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-25"
	)
	public int method7093() {
		return this.field3812.method8308();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-774688963"
	)
	public int method7017() {
		return this.field3830;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-525259240"
	)
	public int method7052() {
		return this.field3812.method8320();
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "6808"
	)
	public boolean method7019() {
		return this.method7013() > 1;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "52"
	)
	boolean method6957() {
		return this.field3822 != this.field3821;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "958464685"
	)
	String method7021(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7031(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lue;Lue;I)V",
		garbageValue = "-883052893"
	)
	void method7100(class520 var1, class520 var2) {
		if ((Integer)var2.field5264 < (Integer)var1.field5264) {
			this.method6977((Integer)var1.field5265, (Integer)var2.field5264);
		} else {
			this.method6977((Integer)var1.field5264, (Integer)var2.field5265);
		}

	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IS)Lue;",
		garbageValue = "17937"
	)
	class520 method7023(int var1) {
		int var2 = this.field3812.method8345();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7029(this.field3812.method8279(var5 - 1).field4794)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7029(this.field3812.method8279(var5).field4794)) {
				var4 = var5;
				break;
			}
		}

		return new class520(var3, var4);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)Lue;",
		garbageValue = "-1587879711"
	)
	class520 method7158(int var1) {
		int var2 = this.field3812.method8345();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3812.method8279(var5 - 1).field4794 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3812.method8279(var5).field4794 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class520(var3, var4);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1786057077"
	)
	boolean method7156() {
		if (!this.method7009()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3812.method8345() > this.field3826) {
				this.field3812.method8396(this.field3826, this.field3812.method8345());
				var1 = true;
			}

			int var2 = this.method7013();
			int var3;
			if (this.field3812.method8283() > var2) {
				var3 = this.field3812.method8300(0, var2) - 1;
				this.field3812.method8396(var3, this.field3812.method8345());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3821;
				int var4 = this.field3822;
				int var5 = this.field3812.method8345();
				if (this.field3821 > var5) {
					var3 = var5;
				}

				if (this.field3822 > var5) {
					var4 = var5;
				}

				this.method6977(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "661117368"
	)
	void method7026(int var1, boolean var2) {
		if (var2) {
			this.method6977(this.field3822, var1);
		} else {
			this.method6977(var1, var1);
		}

	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-113"
	)
	int method7027() {
		return this.field3828 / this.field3812.method8340();
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	void method7028() {
		class439 var1 = this.field3812.method8291(0, this.field3821);
		class520 var2 = var1.method8552();
		int var3 = this.field3812.method8340();
		int var4 = (Integer)var2.field5264 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5265 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3829;
		int var9 = var8 + this.field3827;
		int var10 = this.field3817;
		int var11 = var10 + this.field3828;
		int var12 = this.field3829;
		int var13 = this.field3817;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3827;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3828;
		}

		this.method6962(var12, var13);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-968000539"
	)
	boolean method7029(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "39"
	)
	void method7030() {
		if (this.field3831 != null) {
			this.field3831.vmethod6836();
		}

	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "8"
	)
	boolean method7031(int var1) {
		switch(this.field3830) {
		case 1:
			return LoginPacket.isAlphaNumeric((char)var1);
		case 2:
			return class356.isCharAlphabetic((char)var1);
		case 3:
			return HealthBarUpdate.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (HealthBarUpdate.isDigit(var2)) {
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

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)Lue;",
		garbageValue = "-2030048293"
	)
	class520 method7032() {
		int var1 = this.field3812.method8310(this.field3827);
		int var2 = this.field3812.method8311(this.field3828);
		return new class520(var1, var2);
	}
}
