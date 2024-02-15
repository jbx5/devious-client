import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class347 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class413 field3683;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class413 field3684;
	@ObfuscatedName("at")
	boolean field3687;
	@ObfuscatedName("ay")
	boolean field3686;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -98494749
	)
	int field3692;
	@ObfuscatedName("ac")
	boolean field3688;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 457671495
	)
	int field3689;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 576040561
	)
	int field3690;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2028893089
	)
	int field3691;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2064086413
	)
	int field3693;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 100459291
	)
	int field3679;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1200781745
	)
	int field3699;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1619311665
	)
	int field3676;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1109506203
	)
	int field3696;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1106870875
	)
	int field3697;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1605854399
	)
	int field3698;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -413240369
	)
	int field3695;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1727719529
	)
	int field3694;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 977160551
	)
	int field3701;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class339 field3702;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class339 field3703;

	class347() {
		this.field3683 = new class413();
		this.field3684 = new class413();
		this.field3687 = false;
		this.field3686 = true;
		this.field3692 = 0;
		this.field3688 = false;
		this.field3689 = 0;
		this.field3690 = 0;
		this.field3691 = 0;
		this.field3693 = 0;
		this.field3679 = 0;
		this.field3699 = 0;
		this.field3676 = 0;
		this.field3696 = Integer.MAX_VALUE;
		this.field3697 = Integer.MAX_VALUE;
		this.field3698 = 0;
		this.field3695 = 0;
		this.field3694 = 0;
		this.field3701 = 0;
		this.field3683.method7779(1);
		this.field3684.method7779(1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-756472438"
	)
	void method6681() {
		this.field3692 = (this.field3692 + 1) % 60;
		if (this.field3676 > 0) {
			--this.field3676;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "753569973"
	)
	public boolean method6722(boolean var1) {
		var1 = var1 && this.field3686;
		boolean var2 = this.field3687 != var1;
		this.field3687 = var1;
		if (!this.field3687) {
			this.method6530(this.field3693, this.field3693);
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1273758417"
	)
	public void method6508(boolean var1) {
		this.field3686 = var1;
		this.field3687 = var1 && this.field3687;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "528177582"
	)
	public boolean method6551(String var1) {
		String var2 = this.field3683.method7754();
		if (!var2.equals(var1)) {
			var1 = this.method6527(var1);
			this.field3683.method7792(var1);
			this.method6530(this.field3679, this.field3693);
			this.method6516(this.field3694, this.field3701);
			this.method6578();
			this.method6583();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2132521772"
	)
	boolean method6510(String var1) {
		this.field3684.method7792(var1);
		return true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)Z",
		garbageValue = "7"
	)
	boolean method6511(AbstractFont var1) {
		boolean var2 = !this.field3688;
		this.field3683.method7800(var1);
		this.field3684.method7800(var1);
		this.field3688 = true;
		var2 |= this.method6516(this.field3694, this.field3701);
		var2 |= this.method6530(this.field3679, this.field3693);
		if (this.method6578()) {
			this.method6583();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "4"
	)
	public boolean method6512(int var1, int var2) {
		boolean var3 = this.field3698 != var1 || var2 != this.field3695;
		this.field3698 = var1;
		this.field3695 = var2;
		var3 |= this.method6516(this.field3694, this.field3701);
		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2020341672"
	)
	public boolean method6519(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3683.method7767();
		this.field3683.method7700(var1);
		this.field3684.method7700(var1);
		if (this.method6578()) {
			this.method6583();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "96"
	)
	public boolean method6577(int var1) {
		this.field3683.method7701(var1);
		if (this.method6578()) {
			this.method6583();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2117018219"
	)
	public boolean method6772(int var1) {
		this.field3697 = var1;
		if (this.method6578()) {
			this.method6583();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1128260790"
	)
	public boolean method6516(int var1, int var2) {
		if (!this.method6562()) {
			this.field3694 = var1;
			this.field3701 = var2;
			return false;
		} else {
			int var3 = this.field3694;
			int var4 = this.field3701;
			int var5 = Math.max(0, this.field3683.method7717() - this.field3698 + 2);
			int var6 = Math.max(0, this.field3683.method7735() - this.field3695 + 1);
			this.field3694 = Math.max(0, Math.min(var5, var1));
			this.field3701 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3694 || var4 != this.field3701;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "911185863"
	)
	public boolean method6517(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3683.method7705(var1, var2) : false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "65"
	)
	public void method6554(int var1) {
		this.field3683.method7706(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1715771131"
	)
	public void method6639(int var1) {
		this.field3689 = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-525256758"
	)
	public void method6520(int var1) {
		this.field3683.method7779(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	public void method6521(int var1) {
		this.field3683.method7731(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-104"
	)
	public boolean method6651(int var1) {
		this.field3691 = var1;
		String var2 = this.field3683.method7754();
		int var3 = var2.length();
		var2 = this.method6527(var2);
		if (var2.length() != var3) {
			this.field3683.method7792(var2);
			this.method6516(this.field3694, this.field3701);
			this.method6578();
			this.method6583();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-20912"
	)
	public void method6742() {
		this.field3688 = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-290248574"
	)
	public boolean method6524(int var1) {
		if (this.method6584(var1)) {
			this.method6734();
			class414 var2 = this.field3683.method7708((char)var1, this.field3693, this.field3696);
			this.method6530(var2.method7832(), var2.method7832());
			this.method6578();
			this.method6583();
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method6525() {
		if (!this.method6734() && this.field3693 > 0) {
			int var1 = this.field3683.method7713(this.field3693 - 1);
			this.method6583();
			this.method6530(var1, var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "898173700"
	)
	public void method6526() {
		if (!this.method6734() && this.field3693 < this.field3683.method7711()) {
			int var1 = this.field3683.method7713(this.field3693);
			this.method6583();
			this.method6530(var1, var1);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-811114332"
	)
	public void method6783() {
		if (!this.method6734() && this.field3693 > 0) {
			class504 var1 = this.method6657(this.field3693 - 1);
			int var2 = this.field3683.method7798((Integer)var1.field5063, this.field3693);
			this.method6583();
			this.method6530(var2, var2);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "878062977"
	)
	public void method6528() {
		if (!this.method6734() && this.field3693 < this.field3683.method7711()) {
			class504 var1 = this.method6657(this.field3693);
			int var2 = this.field3683.method7798(this.field3693, (Integer)var1.field5064);
			this.method6583();
			this.method6530(var2, var2);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1048060656"
	)
	boolean method6734() {
		if (!this.method6600()) {
			return false;
		} else {
			int var1 = this.field3683.method7798(this.field3679, this.field3693);
			this.method6583();
			this.method6530(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1354777542"
	)
	public void method6514() {
		this.method6530(0, this.field3683.method7711());
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "34"
	)
	public boolean method6530(int var1, int var2) {
		if (!this.method6562()) {
			this.field3679 = var1;
			this.field3693 = var2;
			return false;
		} else {
			if (var1 > this.field3683.method7711()) {
				var1 = this.field3683.method7711();
			}

			if (var2 > this.field3683.method7711()) {
				var2 = this.field3683.method7711();
			}

			boolean var3 = this.field3679 != var1 || var2 != this.field3693;
			this.field3679 = var1;
			if (var2 != this.field3693) {
				this.field3693 = var2;
				this.field3692 = 0;
				this.method6715();
			}

			if (var3 && this.field3703 != null) {
				this.field3703.vmethod6430();
			}

			return var3;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-955837720"
	)
	public void method6531(boolean var1) {
		class504 var2 = this.method6574(this.field3693);
		this.method6579((Integer)var2.field5063, var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-552794233"
	)
	public void method6532(boolean var1) {
		class504 var2 = this.method6574(this.field3693);
		this.method6579((Integer)var2.field5064, var1);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "7"
	)
	public void method6533(boolean var1) {
		this.method6579(0, var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1480986847"
	)
	public void method6766(boolean var1) {
		this.method6579(this.field3683.method7711(), var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1932709766"
	)
	public void method6535(boolean var1) {
		if (this.method6600() && !var1) {
			this.method6579(Math.min(this.field3679, this.field3693), var1);
		} else if (this.field3693 > 0) {
			this.method6579(this.field3693 - 1, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1446723021"
	)
	public void method6737(boolean var1) {
		if (this.method6600() && !var1) {
			this.method6579(Math.max(this.field3679, this.field3693), var1);
		} else if (this.field3693 < this.field3683.method7711()) {
			this.method6579(this.field3693 + 1, var1);
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method6537(boolean var1) {
		if (this.field3693 > 0) {
			class504 var2 = this.method6657(this.field3693 - 1);
			this.method6579((Integer)var2.field5063, var1);
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1107971774"
	)
	public void method6538(boolean var1) {
		if (this.field3693 < this.field3683.method7711()) {
			class504 var2 = this.method6657(this.field3693 + 1);
			this.method6579((Integer)var2.field5064, var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-59"
	)
	public void method6539(boolean var1) {
		if (this.field3693 > 0) {
			this.method6579(this.field3683.method7716(this.field3693, -1), var1);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6710(boolean var1) {
		if (this.field3693 < this.field3683.method7711()) {
			this.method6579(this.field3683.method7716(this.field3693, 1), var1);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6505(boolean var1) {
		if (this.field3693 > 0) {
			int var2 = this.method6580();
			this.method6579(this.field3683.method7716(this.field3693, -var2), var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-9"
	)
	public void method6542(boolean var1) {
		if (this.field3693 < this.field3683.method7711()) {
			int var2 = this.method6580();
			this.method6579(this.field3683.method7716(this.field3693, var2), var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-57"
	)
	public void method6543(boolean var1) {
		class417 var2 = this.field3683.method7707(0, this.field3693);
		class504 var3 = var2.method7963();
		this.method6579(this.field3683.method7715((Integer)var3.field5063, this.field3701), var1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-25917"
	)
	public void method6544(boolean var1) {
		class417 var2 = this.field3683.method7707(0, this.field3693);
		class504 var3 = var2.method7963();
		this.method6579(this.field3683.method7715((Integer)var3.field5063, this.field3695 + this.field3701), var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1047851640"
	)
	public void method6545(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class504 var6;
		int var8;
		if (!this.field3688) {
			var8 = 0;
		} else {
			var1 += this.field3694;
			var2 += this.field3701;
			var6 = this.method6585();
			var8 = this.field3683.method7715(var1 - (Integer)var6.field5063, var2 - (Integer)var6.field5064);
		}

		if (var3 && var4) {
			this.field3690 = 1;
			var6 = this.method6657(var8);
			class504 var7 = this.method6657(this.field3699);
			this.method6575(var7, var6);
		} else if (var3) {
			this.field3690 = 1;
			var6 = this.method6657(var8);
			this.method6530((Integer)var6.field5063, (Integer)var6.field5064);
			this.field3699 = (Integer)var6.field5063;
		} else if (var4) {
			this.method6530(this.field3699, var8);
		} else {
			if (this.field3676 > 0 && var8 == this.field3699) {
				if (this.field3679 == this.field3693) {
					this.field3690 = 1;
					var6 = this.method6657(var8);
					this.method6530((Integer)var6.field5063, (Integer)var6.field5064);
				} else {
					this.field3690 = 2;
					var6 = this.method6574(var8);
					this.method6530((Integer)var6.field5063, (Integer)var6.field5064);
				}
			} else {
				this.field3690 = 0;
				this.method6530(var8, var8);
				this.field3699 = var8;
			}

			this.field3676 = 25;
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "528254532"
	)
	public void method6546(int var1, int var2) {
		if (this.field3688 && this.method6557()) {
			var1 += this.field3694;
			var2 += this.field3701;
			class504 var3 = this.method6585();
			int var4 = this.field3683.method7715(var1 - (Integer)var3.field5063, var2 - (Integer)var3.field5064);
			class504 var5;
			class504 var6;
			switch(this.field3690) {
			case 0:
				this.method6530(this.field3679, var4);
				break;
			case 1:
				var5 = this.method6657(this.field3699);
				var6 = this.method6657(var4);
				this.method6575(var5, var6);
				break;
			case 2:
				var5 = this.method6574(this.field3699);
				var6 = this.method6574(var4);
				this.method6575(var5, var6);
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1147801496"
	)
	public void method6547(Clipboard var1) {
		class417 var2 = this.field3683.method7707(this.field3679, this.field3693);
		if (!var2.method7956()) {
			String var3 = var2.method7960();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-2048151798"
	)
	public void method6747(Clipboard var1) {
		if (this.method6600()) {
			this.method6547(var1);
			this.method6734();
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-932002013"
	)
	public void method6599(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6527((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6734();
				class414 var4 = this.field3683.method7709(var3, this.field3693, this.field3696);
				this.method6530(var4.method7832(), var4.method7832());
				this.method6578();
				this.method6583();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1610173482"
	)
	public void method6550() {
		this.field3701 = Math.max(0, this.field3701 - this.field3683.method7719());
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1391428115"
	)
	public void method6653() {
		int var1 = Math.max(0, this.field3683.method7735() - this.field3695);
		this.field3701 = Math.min(var1, this.field3701 + this.field3683.method7719());
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "8"
	)
	public void method6552(class339 var1) {
		this.field3702 = var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "-1665927607"
	)
	public void method6779(class339 var1) {
		this.field3703 = var1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "1257442185"
	)
	public class413 method6515() {
		return this.field3683;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "-212619046"
	)
	public class413 method6711() {
		return this.field3684;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Lqz;",
		garbageValue = "-57"
	)
	public class417 method6556() {
		return this.field3683.method7707(this.field3679, this.field3693);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1403865728"
	)
	public boolean method6557() {
		return this.field3687;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-3432"
	)
	public boolean method6558() {
		return this.field3686;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method6559() {
		return this.method6557() && this.field3692 % 60 < 30;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-73"
	)
	public int method6560() {
		return this.field3693;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "395517084"
	)
	public int method6561() {
		return this.field3679;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1180862872"
	)
	public boolean method6562() {
		return this.field3688;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "101"
	)
	public int method6507() {
		return this.field3694;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2060373188"
	)
	public int method6564() {
		return this.field3701;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2120111535"
	)
	public int method6565() {
		return this.field3683.method7767();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108307152"
	)
	public int method6663() {
		return this.field3683.method7808();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2136471290"
	)
	public int method6623() {
		return this.field3697;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1990544466"
	)
	public int method6568() {
		return this.field3689;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	public int method6569() {
		return this.field3683.method7724();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "95"
	)
	public int method6570() {
		return this.field3691;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-773664366"
	)
	public int method6636() {
		return this.field3683.method7765();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1937995389"
	)
	public boolean method6572() {
		return this.method6663() > 1;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1356361203"
	)
	boolean method6600() {
		return this.field3679 != this.field3693;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "159066077"
	)
	String method6527(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6584(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lth;Lth;S)V",
		garbageValue = "-86"
	)
	void method6575(class504 var1, class504 var2) {
		if ((Integer)var2.field5063 < (Integer)var1.field5063) {
			this.method6530((Integer)var1.field5064, (Integer)var2.field5063);
		} else {
			this.method6530((Integer)var1.field5063, (Integer)var2.field5064);
		}

	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)Lth;",
		garbageValue = "326724202"
	)
	class504 method6657(int var1) {
		int var2 = this.field3683.method7711();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6522(this.field3683.method7775(var5 - 1).field4583)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6522(this.field3683.method7775(var5).field4583)) {
				var4 = var5;
				break;
			}
		}

		return new class504(var3, var4);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)Lth;",
		garbageValue = "1298604778"
	)
	class504 method6574(int var1) {
		int var2 = this.field3683.method7711();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3683.method7775(var5 - 1).field4583 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3683.method7775(var5).field4583 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class504(var3, var4);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-140710823"
	)
	boolean method6578() {
		if (!this.method6562()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3683.method7711() > this.field3697) {
				this.field3683.method7798(this.field3697, this.field3683.method7711());
				var1 = true;
			}

			int var2 = this.method6663();
			int var3;
			if (this.field3683.method7720() > var2) {
				var3 = this.field3683.method7716(0, var2) - 1;
				this.field3683.method7798(var3, this.field3683.method7711());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3693;
				int var4 = this.field3679;
				int var5 = this.field3683.method7711();
				if (this.field3693 > var5) {
					var3 = var5;
				}

				if (this.field3679 > var5) {
					var4 = var5;
				}

				this.method6530(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1955972447"
	)
	void method6579(int var1, boolean var2) {
		if (var2) {
			this.method6530(this.field3679, var1);
		} else {
			this.method6530(var1, var1);
		}

	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-925662674"
	)
	int method6580() {
		return this.field3695 / this.field3683.method7719();
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1025063266"
	)
	void method6715() {
		class417 var1 = this.field3683.method7707(0, this.field3693);
		class504 var2 = var1.method7963();
		int var3 = this.field3683.method7719();
		int var4 = (Integer)var2.field5063 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5064 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3694;
		int var9 = var8 + this.field3698;
		int var10 = this.field3701;
		int var11 = var10 + this.field3695;
		int var12 = this.field3694;
		int var13 = this.field3701;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3698;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3695;
		}

		this.method6516(var12, var13);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2048388371"
	)
	boolean method6522(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method6583() {
		if (this.field3702 != null) {
			this.field3702.vmethod6430();
		}

	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-423014427"
	)
	boolean method6584(int var1) {
		switch(this.field3691) {
		case 1:
			return BoundaryObject.isAlphaNumeric((char)var1);
		case 2:
			return class154.isCharAlphabetic((char)var1);
		case 3:
			return class237.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class237.isDigit(var2)) {
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

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)Lth;",
		garbageValue = "1240566023"
	)
	class504 method6585() {
		int var1 = this.field3683.method7773(this.field3698);
		int var2 = this.field3683.method7786(this.field3695);
		return new class504(var1, var2);
	}
}
