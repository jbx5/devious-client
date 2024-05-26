import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Collections;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("np")
public class class355 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	class431 field3776;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	class431 field3777;
	@ObfuscatedName("aw")
	boolean field3788;
	@ObfuscatedName("ad")
	boolean field3779;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1476265967
	)
	int field3780;
	@ObfuscatedName("an")
	boolean field3790;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 859979755
	)
	int field3783;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1938382695
	)
	int field3778;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1966868349
	)
	int field3784;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1383013209
	)
	int field3785;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -340689853
	)
	int field3786;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1680593439
	)
	int field3770;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1950948635
	)
	int field3793;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1781594129
	)
	int field3789;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1092299803
	)
	int field3787;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 901723077
	)
	int field3791;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 573482059
	)
	int field3771;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 591817547
	)
	int field3792;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1826285097
	)
	int field3794;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	class347 field3795;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	class347 field3796;

	class355() {
		this.field3776 = new class431();
		this.field3777 = new class431();
		this.field3788 = false;
		this.field3779 = true;
		this.field3780 = 0;
		this.field3790 = false;
		this.field3783 = 0;
		this.field3778 = 0;
		this.field3784 = 0;
		this.field3785 = 0;
		this.field3786 = 0;
		this.field3770 = 0;
		this.field3793 = 0;
		this.field3789 = Integer.MAX_VALUE;
		this.field3787 = Integer.MAX_VALUE;
		this.field3791 = 0;
		this.field3771 = 0;
		this.field3792 = 0;
		this.field3794 = 0;
		this.field3776.method8005(1);
		this.field3777.method8005(1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1097981617"
	)
	void method6616() {
		this.field3780 = (this.field3780 + 1) % 60;
		if (this.field3793 > 0) {
			--this.field3793;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-815567998"
	)
	public boolean method6617(boolean var1) {
		var1 = var1 && this.field3779;
		boolean var2 = this.field3788 != var1;
		this.field3788 = var1;
		if (!this.field3788) {
			this.method6887(this.field3785, this.field3785);
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1338932815"
	)
	public void method6740(boolean var1) {
		this.field3779 = var1;
		this.field3788 = var1 && this.field3788;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1950882546"
	)
	public boolean method6619(String var1) {
		String var2 = this.field3776.method8000();
		if (!var2.equals(var1)) {
			var1 = this.method6641(var1);
			this.field3776.method8044(var1);
			this.method6887(this.field3786, this.field3785);
			this.method6849(this.field3792, this.field3794);
			this.method6689();
			this.method6720();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "2"
	)
	boolean method6620(String var1) {
		this.field3777.method8044(var1);
		return true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)Z",
		garbageValue = "1431780617"
	)
	boolean method6621(AbstractFont var1) {
		boolean var2 = !this.field3790;
		this.field3776.method8004(var1);
		this.field3777.method8004(var1);
		this.field3790 = true;
		var2 |= this.method6849(this.field3792, this.field3794);
		var2 |= this.method6887(this.field3786, this.field3785);
		if (this.method6689()) {
			this.method6720();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2121671318"
	)
	public boolean method6622(int var1, int var2) {
		boolean var3 = this.field3791 != var1 || var2 != this.field3771;
		this.field3791 = var1;
		this.field3771 = var2;
		var3 |= this.method6849(this.field3792, this.field3794);
		return var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "465521698"
	)
	public boolean method6623(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3776.method8023();
		this.field3776.method8001(var1);
		this.field3777.method8001(var1);
		if (this.method6689()) {
			this.method6720();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1482629101"
	)
	public boolean method6821(int var1) {
		this.field3776.method8002(var1);
		if (this.method6689()) {
			this.method6720();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-514506050"
	)
	public boolean method6625(int var1) {
		this.field3787 = var1;
		if (this.method6689()) {
			this.method6720();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "119"
	)
	public boolean method6849(int var1, int var2) {
		if (!this.method6673()) {
			this.field3792 = var1;
			this.field3794 = var2;
			return false;
		} else {
			int var3 = this.field3792;
			int var4 = this.field3794;
			int var5 = Math.max(0, this.field3776.method8018() - this.field3791 + 2);
			int var6 = Math.max(0, this.field3776.method8075() - this.field3771 + 1);
			this.field3792 = Math.max(0, Math.min(var5, var1));
			this.field3794 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3792 || var4 != this.field3794;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1300527046"
	)
	public boolean method6627(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3776.method8006(var1, var2) : false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "151479134"
	)
	public void method6628(int var1) {
		this.field3776.method8045(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1598022999"
	)
	public void method6629(int var1) {
		this.field3783 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1039142462"
	)
	public void method6630(int var1) {
		this.field3776.method8005(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method6631(int var1) {
		this.field3776.method8003(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "8"
	)
	public boolean method6632(int var1) {
		this.field3784 = var1;
		String var2 = this.field3776.method8000();
		int var3 = var2.length();
		var2 = this.method6641(var2);
		if (var2.length() != var3) {
			this.field3776.method8044(var2);
			this.method6849(this.field3792, this.field3794);
			this.method6689();
			this.method6720();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method6762() {
		this.field3790 = false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-31"
	)
	public boolean method6634(int var1) {
		if (this.method6695(var1)) {
			this.method6862();
			class432 var2 = this.field3776.method8095((char)var1, this.field3785, this.field3789);
			this.method6887(var2.method8126(), var2.method8126());
			this.method6689();
			this.method6720();
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "583119805"
	)
	public void method6635() {
		if (!this.method6862() && this.field3785 > 0) {
			int var1 = this.field3776.method8065(this.field3785 - 1);
			this.method6720();
			this.method6887(var1, var1);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1303639177"
	)
	public void method6636() {
		if (!this.method6862() && this.field3785 < this.field3776.method8050()) {
			int var1 = this.field3776.method8065(this.field3785);
			this.method6720();
			this.method6887(var1, var1);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1717351868"
	)
	public void method6774() {
		if (!this.method6862() && this.field3785 > 0) {
			class516 var1 = this.method6657(this.field3785 - 1);
			int var2 = this.field3776.method8015((Integer)var1.field5199, this.field3785);
			this.method6720();
			this.method6887(var2, var2);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method6698() {
		if (!this.method6862() && this.field3785 < this.field3776.method8050()) {
			class516 var1 = this.method6657(this.field3785);
			int var2 = this.field3776.method8015(this.field3785, (Integer)var1.field5198);
			this.method6720();
			this.method6887(var2, var2);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "97219535"
	)
	boolean method6862() {
		if (!this.method6643()) {
			return false;
		} else {
			int var1 = this.field3776.method8015(this.field3786, this.field3785);
			this.method6720();
			this.method6887(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-669537727"
	)
	public void method6796() {
		this.method6887(0, this.field3776.method8050());
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1515618731"
	)
	public boolean method6887(int var1, int var2) {
		if (!this.method6673()) {
			this.field3786 = var1;
			this.field3785 = var2;
			return false;
		} else {
			if (var1 > this.field3776.method8050()) {
				var1 = this.field3776.method8050();
			}

			if (var2 > this.field3776.method8050()) {
				var2 = this.field3776.method8050();
			}

			boolean var3 = this.field3786 != var1 || var2 != this.field3785;
			this.field3786 = var1;
			if (var2 != this.field3785) {
				this.field3785 = var2;
				this.field3780 = 0;
				this.method6692();
			}

			if (var3 && this.field3796 != null) {
				this.field3796.vmethod6534();
			}

			return var3;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1399175503"
	)
	public void method6704(boolean var1) {
		class516 var2 = this.method6749(this.field3785);
		this.method6626((Integer)var2.field5199, var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6682(boolean var1) {
		class516 var2 = this.method6749(this.field3785);
		this.method6626((Integer)var2.field5198, var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2038302921"
	)
	public void method6644(boolean var1) {
		this.method6626(0, var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "745568305"
	)
	public void method6645(boolean var1) {
		this.method6626(this.field3776.method8050(), var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-274106425"
	)
	public void method6646(boolean var1) {
		if (this.method6643() && !var1) {
			this.method6626(Math.min(this.field3786, this.field3785), var1);
		} else if (this.field3785 > 0) {
			this.method6626(this.field3785 - 1, var1);
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2057280905"
	)
	public void method6624(boolean var1) {
		if (this.method6643() && !var1) {
			this.method6626(Math.max(this.field3786, this.field3785), var1);
		} else if (this.field3785 < this.field3776.method8050()) {
			this.method6626(this.field3785 + 1, var1);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2040087316"
	)
	public void method6648(boolean var1) {
		if (this.field3785 > 0) {
			class516 var2 = this.method6657(this.field3785 - 1);
			this.method6626((Integer)var2.field5199, var1);
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "418727105"
	)
	public void method6649(boolean var1) {
		if (this.field3785 < this.field3776.method8050()) {
			class516 var2 = this.method6657(this.field3785 + 1);
			this.method6626((Integer)var2.field5198, var1);
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method6810(boolean var1) {
		if (this.field3785 > 0) {
			this.method6626(this.field3776.method8017(this.field3785, -1), var1);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-275801974"
	)
	public void method6651(boolean var1) {
		if (this.field3785 < this.field3776.method8050()) {
			this.method6626(this.field3776.method8017(this.field3785, 1), var1);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	public void method6652(boolean var1) {
		if (this.field3785 > 0) {
			int var2 = this.method6839();
			this.method6626(this.field3776.method8017(this.field3785, -var2), var1);
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-11"
	)
	public void method6653(boolean var1) {
		if (this.field3785 < this.field3776.method8050()) {
			int var2 = this.method6839();
			this.method6626(this.field3776.method8017(this.field3785, var2), var1);
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1031547937"
	)
	public void method6831(boolean var1) {
		class435 var2 = this.field3776.method8008(0, this.field3785);
		class516 var3 = var2.method8246();
		this.method6626(this.field3776.method8016((Integer)var3.field5199, this.field3794), var1);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1544273745"
	)
	public void method6655(boolean var1) {
		class435 var2 = this.field3776.method8008(0, this.field3785);
		class516 var3 = var2.method8246();
		this.method6626(this.field3776.method8016((Integer)var3.field5199, this.field3794 + this.field3771), var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "90"
	)
	public void method6668(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class516 var6;
		int var8;
		if (!this.field3790) {
			var8 = 0;
		} else {
			var1 += this.field3792;
			var2 += this.field3794;
			var6 = this.method6825();
			var8 = this.field3776.method8016(var1 - (Integer)var6.field5199, var2 - (Integer)var6.field5198);
		}

		if (var3 && var4) {
			this.field3778 = 1;
			var6 = this.method6657(var8);
			class516 var7 = this.method6657(this.field3770);
			this.method6857(var7, var6);
		} else if (var3) {
			this.field3778 = 1;
			var6 = this.method6657(var8);
			this.method6887((Integer)var6.field5199, (Integer)var6.field5198);
			this.field3770 = (Integer)var6.field5199;
		} else if (var4) {
			this.method6887(this.field3770, var8);
		} else {
			if (this.field3793 > 0 && var8 == this.field3770) {
				if (this.field3786 == this.field3785) {
					this.field3778 = 1;
					var6 = this.method6657(var8);
					this.method6887((Integer)var6.field5199, (Integer)var6.field5198);
				} else {
					this.field3778 = 2;
					var6 = this.method6749(var8);
					this.method6887((Integer)var6.field5199, (Integer)var6.field5198);
				}
			} else {
				this.field3778 = 0;
				this.method6887(var8, var8);
				this.field3770 = var8;
			}

			this.field3793 = 25;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "52"
	)
	public void method6703(int var1, int var2) {
		if (this.field3790 && this.method6793()) {
			var1 += this.field3792;
			var2 += this.field3794;
			class516 var3 = this.method6825();
			int var4 = this.field3776.method8016(var1 - (Integer)var3.field5199, var2 - (Integer)var3.field5198);
			class516 var5;
			class516 var6;
			switch(this.field3778) {
			case 0:
				this.method6887(this.field3786, var4);
				break;
			case 1:
				var5 = this.method6657(this.field3770);
				var6 = this.method6657(var4);
				this.method6857(var5, var6);
				break;
			case 2:
				var5 = this.method6749(this.field3770);
				var6 = this.method6749(var4);
				this.method6857(var5, var6);
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "0"
	)
	public void method6658(Clipboard var1) {
		class435 var2 = this.field3776.method8008(this.field3786, this.field3785);
		if (!var2.method8242()) {
			String var3 = var2.method8254();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "0"
	)
	public void method6684(Clipboard var1) {
		if (this.method6643()) {
			this.method6658(var1);
			this.method6862();
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "764648930"
	)
	public void method6660(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6641((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6862();
				class432 var4 = this.field3776.method8010(var3, this.field3785, this.field3789);
				this.method6887(var4.method8126(), var4.method8126());
				this.method6689();
				this.method6720();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-121"
	)
	public void method6661() {
		this.field3794 = Math.max(0, this.field3794 - this.field3776.method8020());
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1554090666"
	)
	public void method6662() {
		int var1 = Math.max(0, this.field3776.method8075() - this.field3771);
		this.field3794 = Math.min(var1, this.field3794 + this.field3776.method8020());
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lnl;I)V",
		garbageValue = "-1302850977"
	)
	public void method6663(class347 var1) {
		this.field3795 = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lnl;B)V",
		garbageValue = "0"
	)
	public void method6664(class347 var1) {
		this.field3796 = var1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Lqw;",
		garbageValue = "-7"
	)
	public class431 method6665() {
		return this.field3776;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Lqw;",
		garbageValue = "1015050949"
	)
	public class431 method6666() {
		return this.field3777;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)Lqv;",
		garbageValue = "38"
	)
	public class435 method6667() {
		return this.field3776.method8008(this.field3786, this.field3785);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "466517164"
	)
	public boolean method6793() {
		return this.field3788;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	public boolean method6731() {
		return this.field3779;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-9787"
	)
	public boolean method6670() {
		return this.method6793() && this.field3780 % 60 < 30;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "146933578"
	)
	public int method6671() {
		return this.field3785;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-37"
	)
	public int method6822() {
		return this.field3786;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "409686041"
	)
	public boolean method6673() {
		return this.field3790;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "110119456"
	)
	public int method6672() {
		return this.field3792;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1670936823"
	)
	public int method6697() {
		return this.field3794;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "25678"
	)
	public int method6676() {
		return this.field3776.method8023();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "75"
	)
	public int method6677() {
		return this.field3776.method8024();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-65"
	)
	public int method6678() {
		return this.field3787;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "608764715"
	)
	public int method6679() {
		return this.field3783;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "181768682"
	)
	public int method6680() {
		return this.field3776.method8007();
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-543926199"
	)
	public int method6681() {
		return this.field3784;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-754424863"
	)
	public int method6798() {
		return this.field3776.method8026();
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-19534"
	)
	public boolean method6683() {
		return this.method6677() > 1;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1547961988"
	)
	boolean method6643() {
		return this.field3786 != this.field3785;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1986224271"
	)
	String method6641(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6695(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lto;Lto;I)V",
		garbageValue = "632728748"
	)
	void method6857(class516 var1, class516 var2) {
		if ((Integer)var2.field5199 < (Integer)var1.field5199) {
			this.method6887((Integer)var1.field5198, (Integer)var2.field5199);
		} else {
			this.method6887((Integer)var1.field5199, (Integer)var2.field5198);
		}

	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)Lto;",
		garbageValue = "78"
	)
	class516 method6657(int var1) {
		int var2 = this.field3776.method8050();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6853(this.field3776.method7995(var5 - 1).field4749)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6853(this.field3776.method7995(var5).field4749)) {
				var4 = var5;
				break;
			}
		}

		return new class516(var3, var4);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)Lto;",
		garbageValue = "-1379107743"
	)
	class516 method6749(int var1) {
		int var2 = this.field3776.method8050();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3776.method7995(var5 - 1).field4749 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3776.method7995(var5).field4749 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class516(var3, var4);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "25215159"
	)
	boolean method6689() {
		if (!this.method6673()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3776.method8050() > this.field3787) {
				this.field3776.method8015(this.field3787, this.field3776.method8050());
				var1 = true;
			}

			int var2 = this.method6677();
			int var3;
			if (this.field3776.method8035() > var2) {
				var3 = this.field3776.method8017(0, var2) - 1;
				this.field3776.method8015(var3, this.field3776.method8050());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3785;
				int var4 = this.field3786;
				int var5 = this.field3776.method8050();
				if (this.field3785 > var5) {
					var3 = var5;
				}

				if (this.field3786 > var5) {
					var4 = var5;
				}

				this.method6887(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "1"
	)
	void method6626(int var1, boolean var2) {
		if (var2) {
			this.method6887(this.field3786, var1);
		} else {
			this.method6887(var1, var1);
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "79"
	)
	int method6839() {
		return this.field3771 / this.field3776.method8020();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1995706413"
	)
	void method6692() {
		class435 var1 = this.field3776.method8008(0, this.field3785);
		class516 var2 = var1.method8246();
		int var3 = this.field3776.method8020();
		int var4 = (Integer)var2.field5199 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5198 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3792;
		int var9 = var8 + this.field3791;
		int var10 = this.field3794;
		int var11 = var10 + this.field3771;
		int var12 = this.field3792;
		int var13 = this.field3794;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3791;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3771;
		}

		this.method6849(var12, var13);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "51"
	)
	boolean method6853(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2095811136"
	)
	void method6720() {
		if (this.field3795 != null) {
			this.field3795.vmethod6534();
		}

	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-585828203"
	)
	boolean method6695(int var1) {
		switch(this.field3784) {
		case 1:
			return ScriptEvent.isAlphaNumeric((char)var1);
		case 2:
			return class323.isCharAlphabetic((char)var1);
		case 3:
			return class6.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class6.isDigit(var2)) {
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

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)Lto;",
		garbageValue = "123"
	)
	class516 method6825() {
		int var1 = this.field3776.method8027(this.field3791);
		int var2 = this.field3776.method8028(this.field3771);
		return new class516(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I[IB)V",
		garbageValue = "54"
	)
	public static void method6903(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class47.ByteArrayPool_alternativeSizes = var0;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			class202.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class47.ByteArrayPool_alternativeSizes.length; ++var2) {
				class202.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4828.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4828);
		} else {
			class47.ByteArrayPool_alternativeSizes = null;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = null;
			class202.ByteArrayPool_arrays = null;
			ByteArrayPool.field4828.clear();
			ByteArrayPool.field4828.add(100);
			ByteArrayPool.field4828.add(5000);
			ByteArrayPool.field4828.add(10000);
			ByteArrayPool.field4828.add(30000);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "956879990"
	)
	static int method6701(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			var3 = AsyncRestClient.widgetDefinition.method6536(var4);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class13.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class355 var17 = var3.method6942();
				if (var17 != null && var17.method6849(var23, var16)) {
					class324.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				class324.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			class324.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
			class324.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			class324.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			class324.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			class324.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			class324.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
			class324.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			class324.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class13.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 5];
			class324.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class324.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
			class324.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class355 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method6942();
					if (var21 != null && var21.method6673()) {
						var21.method6619(var15);
					} else {
						var3.text = var15;
					}

					class324.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					class324.invalidateWidget(var3);
				}

				return 1;
			} else {
				class355 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method6942();
						if (var19 != null) {
							var19.method6762();
						}
					}

					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					class13.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method6942();
						if (var19 != null) {
							var19.method6627(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
							var19.method6628(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
					}

					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					class13.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					class324.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						class148.revalidateWidgetScroll(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					SoundCache.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					class324.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					FillMode var22 = (FillMode)MenuAction.findEnumerated(ArchiveDiskActionHandler.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						class324.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
						var3.field3849 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3852 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
						class324.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7008(Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize], "", PacketBufferNode.urlRequester, class92.getUserId());
						return 1;
					} else if (var0 == 1131) {
						class13.Interpreter_intStackSize -= 2;
						var3.method6928(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method6929(Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
						return 1;
					} else {
						class349 var20;
						if (var0 == 1133) {
							--class13.Interpreter_intStackSize;
							var20 = var3.method6943();
							if (var20 != null) {
								var20.field3731 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--class13.Interpreter_intStackSize;
							var20 = var3.method6943();
							if (var20 != null) {
								var20.field3732 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class166.Interpreter_stringStackSize;
							var19 = var3.method6942();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--class13.Interpreter_intStackSize;
							var20 = var3.method6943();
							if (var20 != null) {
								var20.field3733 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--class13.Interpreter_intStackSize;
							var19 = var3.method6942();
							if (var19 != null && var19.method6623(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize])) {
								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--class13.Interpreter_intStackSize;
							var19 = var3.method6942();
							if (var19 != null && var19.method6821(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize])) {
								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--class13.Interpreter_intStackSize;
							var19 = var3.method6942();
							if (var19 != null && var19.method6625(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize])) {
								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							Client.field552.method4379();
							var21 = var3.method6942();
							if (var21 != null && var21.method6617(var14)) {
								if (var14) {
									Client.field552.method4377(var3);
								}

								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field552.method4378() == var3) {
								Client.field552.method4379();
								class324.invalidateWidget(var3);
							}

							var21 = var3.method6942();
							if (var21 != null) {
								var21.method6740(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							class13.Interpreter_intStackSize -= 2;
							var19 = var3.method6942();
							if (var19 != null && var19.method6887(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1])) {
								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--class13.Interpreter_intStackSize;
							var19 = var3.method6942();
							if (var19 != null && var19.method6887(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize])) {
								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--class13.Interpreter_intStackSize;
							var19 = var3.method6942();
							if (var19 != null) {
								var19.method6630(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize]);
								class324.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--class13.Interpreter_intStackSize;
							var19 = var3.method6942();
							if (var19 != null) {
								var19.method6629(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--class13.Interpreter_intStackSize;
							var19 = var3.method6942();
							if (var19 != null) {
								var19.method6632(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--class13.Interpreter_intStackSize;
							var19 = var3.method6942();
							if (var19 != null) {
								var19.method6631(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize]);
								class324.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								class13.Interpreter_intStackSize -= 2;
								var18 = var3.method7041();
								if (var18 != null) {
									var18.method381(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								class13.Interpreter_intStackSize -= 2;
								var18 = var3.method7041();
								if (var18 != null) {
									var18.method382((char)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method6926(Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize], PacketBufferNode.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class166.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 2];
								long var8 = class92.getUserId();
								long var10 = class140.getUserHash();
								String var12 = class128.getPlatformInfo().getDeviceId(class128.getPlatformInfo().os);
								if (-1L != var8) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (var10 != -1L) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method6925(var15, var13, var7, var12, Long.toString(var10), PacketBufferNode.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class174 var5 = var3.method6938();
									boolean var6 = var5 != null && MilliClock.method3646().method3681(var5.method3520());
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}
}
