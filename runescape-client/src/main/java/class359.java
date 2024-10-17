import java.awt.Component;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class359 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class436 field3832;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class436 field3841;
	@ObfuscatedName("ac")
	boolean field3842;
	@ObfuscatedName("av")
	boolean field3843;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 417166631
	)
	int field3844;
	@ObfuscatedName("aq")
	boolean field3840;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -775849883
	)
	int field3846;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -948655523
	)
	int field3847;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1053083809
	)
	int field3845;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1571468601
	)
	int field3836;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -292783411
	)
	int field3837;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1456243619
	)
	int field3851;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -311551055
	)
	int field3852;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 224193227
	)
	int field3853;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -613554215
	)
	int field3849;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -703902065
	)
	int field3861;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1737556603
	)
	int field3856;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -429869409
	)
	int field3857;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1737232087
	)
	int field3858;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	class351 field3859;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	class351 field3854;

	class359() {
		this.field3832 = new class436();
		this.field3841 = new class436();
		this.field3842 = false;
		this.field3843 = true;
		this.field3844 = 0;
		this.field3840 = false;
		this.field3846 = 0;
		this.field3847 = 0;
		this.field3845 = 0;
		this.field3836 = 0;
		this.field3837 = 0;
		this.field3851 = 0;
		this.field3852 = 0;
		this.field3853 = Integer.MAX_VALUE;
		this.field3849 = Integer.MAX_VALUE;
		this.field3861 = 0;
		this.field3856 = 0;
		this.field3857 = 0;
		this.field3858 = 0;
		this.field3832.method8409(1);
		this.field3841.method8409(1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	void method7266() {
		this.field3844 = (this.field3844 + 1) % 60;
		if (this.field3852 > 0) {
			--this.field3852;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1952780964"
	)
	public boolean method7215(boolean var1) {
		var1 = var1 && this.field3843;
		boolean var2 = this.field3842 != var1;
		this.field3842 = var1;
		if (!this.field3842) {
			this.method7157(this.field3836, this.field3836);
		}

		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1999468687"
	)
	public void method7011(boolean var1) {
		this.field3843 = var1;
		this.field3842 = var1 && this.field3842;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "37"
	)
	public boolean method7012(String var1) {
		String var2 = this.field3832.method8415();
		if (!var2.equals(var1)) {
			var1 = this.method7019(var1);
			this.field3832.method8427(var1);
			this.method7157(this.field3837, this.field3836);
			this.method7252(this.field3857, this.field3858);
			this.method7038();
			this.method7086();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1013474680"
	)
	boolean method7239(String var1) {
		this.field3841.method8427(var1);
		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Z",
		garbageValue = "2027037085"
	)
	boolean method7014(AbstractFont var1) {
		boolean var2 = !this.field3840;
		this.field3832.method8477(var1);
		this.field3841.method8477(var1);
		this.field3840 = true;
		var2 |= this.method7252(this.field3857, this.field3858);
		var2 |= this.method7157(this.field3837, this.field3836);
		if (this.method7038()) {
			this.method7086();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1570527280"
	)
	public boolean method7229(int var1, int var2) {
		boolean var3 = this.field3861 != var1 || var2 != this.field3856;
		this.field3861 = var1;
		this.field3856 = var2;
		var3 |= this.method7252(this.field3857, this.field3858);
		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "123"
	)
	public boolean method7016(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3832.method8438();
		this.field3832.method8506(var1);
		this.field3841.method8506(var1);
		if (this.method7038()) {
			this.method7086();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-261146629"
	)
	public boolean method7226(int var1) {
		this.field3832.method8417(var1);
		if (this.method7038()) {
			this.method7086();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1503139826"
	)
	public boolean method7018(int var1) {
		this.field3849 = var1;
		if (this.method7038()) {
			this.method7086();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-330508271"
	)
	public boolean method7252(int var1, int var2) {
		if (!this.method7065()) {
			this.field3857 = var1;
			this.field3858 = var2;
			return false;
		} else {
			int var3 = this.field3857;
			int var4 = this.field3858;
			int var5 = Math.max(0, this.field3832.method8433() - this.field3861 + 2);
			int var6 = Math.max(0, this.field3832.method8430() - this.field3856 + 1);
			this.field3857 = Math.max(0, Math.min(var5, var1));
			this.field3858 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3857 || var4 != this.field3858;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "255"
	)
	public boolean method7207(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3832.method8421(var1, var2) : false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-225789200"
	)
	public void method7112(int var1) {
		this.field3832.method8422(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2146455803"
	)
	public void method7022(int var1) {
		this.field3846 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-371111029"
	)
	public void method7023(int var1) {
		this.field3832.method8409(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-2"
	)
	public void method7024(int var1) {
		this.field3832.method8425(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method7025(int var1) {
		this.field3845 = var1;
		String var2 = this.field3832.method8415();
		int var3 = var2.length();
		var2 = this.method7019(var2);
		if (var2.length() != var3) {
			this.field3832.method8427(var2);
			this.method7252(this.field3857, this.field3858);
			this.method7038();
			this.method7086();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1979728813"
	)
	public void method7026() {
		this.field3840 = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "56"
	)
	public boolean method7138(int var1) {
		if (this.method7087(var1)) {
			this.method7032();
			class437 var2 = this.field3832.method8410((char)var1, this.field3836, this.field3853);
			this.method7157(var2.method8551(), var2.method8551());
			this.method7038();
			this.method7086();
		}

		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	public void method7028() {
		if (!this.method7032() && this.field3836 > 0) {
			int var1 = this.field3832.method8429(this.field3836 - 1);
			this.method7086();
			this.method7157(var1, var1);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	public void method7163() {
		if (!this.method7032() && this.field3836 < this.field3832.method8414()) {
			int var1 = this.field3832.method8429(this.field3836);
			this.method7086();
			this.method7157(var1, var1);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1419705781"
	)
	public void method7196() {
		if (!this.method7032() && this.field3836 > 0) {
			class527 var1 = this.method7220(this.field3836 - 1);
			int var2 = this.field3832.method8521((Integer)var1.field5316, this.field3836);
			this.method7086();
			this.method7157(var2, var2);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "357403829"
	)
	public void method7031() {
		if (!this.method7032() && this.field3836 < this.field3832.method8414()) {
			class527 var1 = this.method7220(this.field3836);
			int var2 = this.field3832.method8521(this.field3836, (Integer)var1.field5317);
			this.method7086();
			this.method7157(var2, var2);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "899704133"
	)
	boolean method7032() {
		if (!this.method7076()) {
			return false;
		} else {
			int var1 = this.field3832.method8521(this.field3837, this.field3836);
			this.method7086();
			this.method7157(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-8955"
	)
	public void method7033() {
		this.method7157(0, this.field3832.method8414());
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-248173194"
	)
	public boolean method7157(int var1, int var2) {
		if (!this.method7065()) {
			this.field3837 = var1;
			this.field3836 = var2;
			return false;
		} else {
			if (var1 > this.field3832.method8414()) {
				var1 = this.field3832.method8414();
			}

			if (var2 > this.field3832.method8414()) {
				var2 = this.field3832.method8414();
			}

			boolean var3 = this.field3837 != var1 || var2 != this.field3836;
			this.field3837 = var1;
			if (var2 != this.field3836) {
				this.field3836 = var2;
				this.field3844 = 0;
				this.method7092();
			}

			if (var3 && this.field3854 != null) {
				this.field3854.vmethod6889();
			}

			return var3;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1673494871"
	)
	public void method7035(boolean var1) {
		class527 var2 = this.method7080(this.field3836);
		this.method7082((Integer)var2.field5316, var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-66"
	)
	public void method7020(boolean var1) {
		class527 var2 = this.method7080(this.field3836);
		this.method7082((Integer)var2.field5317, var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1225233019"
	)
	public void method7008(boolean var1) {
		this.method7082(0, var1);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "645317464"
	)
	public void method7224(boolean var1) {
		this.method7082(this.field3832.method8414(), var1);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-344304301"
	)
	public void method7039(boolean var1) {
		if (this.method7076() && !var1) {
			this.method7082(Math.min(this.field3837, this.field3836), var1);
		} else if (this.field3836 > 0) {
			this.method7082(this.field3836 - 1, var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1716162562"
	)
	public void method7083(boolean var1) {
		if (this.method7076() && !var1) {
			this.method7082(Math.max(this.field3837, this.field3836), var1);
		} else if (this.field3836 < this.field3832.method8414()) {
			this.method7082(this.field3836 + 1, var1);
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1703777675"
	)
	public void method7041(boolean var1) {
		if (this.field3836 > 0) {
			class527 var2 = this.method7220(this.field3836 - 1);
			this.method7082((Integer)var2.field5316, var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-934817534"
	)
	public void method7042(boolean var1) {
		if (this.field3836 < this.field3832.method8414()) {
			class527 var2 = this.method7220(this.field3836 + 1);
			this.method7082((Integer)var2.field5317, var1);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1450043463"
	)
	public void method7043(boolean var1) {
		if (this.field3836 > 0) {
			this.method7082(this.field3832.method8432(this.field3836, -1), var1);
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-85"
	)
	public void method7128(boolean var1) {
		if (this.field3836 < this.field3832.method8414()) {
			this.method7082(this.field3832.method8432(this.field3836, 1), var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method7151(boolean var1) {
		if (this.field3836 > 0) {
			int var2 = this.method7238();
			this.method7082(this.field3832.method8432(this.field3836, -var2), var1);
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "30203"
	)
	public void method7046(boolean var1) {
		if (this.field3836 < this.field3832.method8414()) {
			int var2 = this.method7238();
			this.method7082(this.field3832.method8432(this.field3836, var2), var1);
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "13"
	)
	public void method7047(boolean var1) {
		class440 var2 = this.field3832.method8423(0, this.field3836);
		class527 var3 = var2.method8666();
		this.method7082(this.field3832.method8431((Integer)var3.field5316, this.field3858), var1);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1071766312"
	)
	public void method7048(boolean var1) {
		class440 var2 = this.field3832.method8423(0, this.field3836);
		class527 var3 = var2.method8666();
		this.method7082(this.field3832.method8431((Integer)var3.field5316, this.field3858 + this.field3856), var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "855819225"
	)
	public void method7084(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class527 var6;
		int var8;
		if (!this.field3840) {
			var8 = 0;
		} else {
			var1 += this.field3857;
			var2 += this.field3858;
			var6 = this.method7088();
			var8 = this.field3832.method8431(var1 - (Integer)var6.field5316, var2 - (Integer)var6.field5317);
		}

		if (var3 && var4) {
			this.field3847 = 1;
			var6 = this.method7220(var8);
			class527 var7 = this.method7220(this.field3851);
			this.method7049(var7, var6);
		} else if (var3) {
			this.field3847 = 1;
			var6 = this.method7220(var8);
			this.method7157((Integer)var6.field5316, (Integer)var6.field5317);
			this.field3851 = (Integer)var6.field5316;
		} else if (var4) {
			this.method7157(this.field3851, var8);
		} else {
			if (this.field3852 > 0 && var8 == this.field3851) {
				if (this.field3836 == this.field3837) {
					this.field3847 = 1;
					var6 = this.method7220(var8);
					this.method7157((Integer)var6.field5316, (Integer)var6.field5317);
				} else {
					this.field3847 = 2;
					var6 = this.method7080(var8);
					this.method7157((Integer)var6.field5316, (Integer)var6.field5317);
				}
			} else {
				this.field3847 = 0;
				this.method7157(var8, var8);
				this.field3851 = var8;
			}

			this.field3852 = 25;
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-27"
	)
	public void method7050(int var1, int var2) {
		if (this.field3840 && this.method7060()) {
			var1 += this.field3857;
			var2 += this.field3858;
			class527 var3 = this.method7088();
			int var4 = this.field3832.method8431(var1 - (Integer)var3.field5316, var2 - (Integer)var3.field5317);
			class527 var5;
			class527 var6;
			switch(this.field3847) {
			case 0:
				this.method7157(this.field3837, var4);
				break;
			case 1:
				var5 = this.method7220(this.field3851);
				var6 = this.method7220(var4);
				this.method7049(var5, var6);
				break;
			case 2:
				var5 = this.method7080(this.field3851);
				var6 = this.method7080(var4);
				this.method7049(var5, var6);
			}
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-454152995"
	)
	public void method7156(Clipboard var1) {
		class440 var2 = this.field3832.method8423(this.field3837, this.field3836);
		if (!var2.method8678()) {
			String var3 = var2.method8665();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;S)V",
		garbageValue = "-17495"
	)
	public void method7051(Clipboard var1) {
		if (this.method7076()) {
			this.method7156(var1);
			this.method7032();
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "35"
	)
	public void method7052(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7019((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7032();
				class437 var4 = this.field3832.method8476(var3, this.field3836, this.field3853);
				this.method7157(var4.method8551(), var4.method8551());
				this.method7038();
				this.method7086();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-853271958"
	)
	public void method7053() {
		this.field3858 = Math.max(0, this.field3858 - this.field3832.method8435());
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1743025261"
	)
	public void method7223() {
		int var1 = Math.max(0, this.field3832.method8430() - this.field3856);
		this.field3858 = Math.min(var1, this.field3858 + this.field3832.method8435());
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lnj;I)V",
		garbageValue = "-821306554"
	)
	public void method7055(class351 var1) {
		this.field3859 = var1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lnj;S)V",
		garbageValue = "-16967"
	)
	public void method7067(class351 var1) {
		this.field3854 = var1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "-1952494424"
	)
	public class436 method7057() {
		return this.field3832;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "-289245489"
	)
	public class436 method7111() {
		return this.field3841;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lqb;",
		garbageValue = "-1170792501"
	)
	public class440 method7054() {
		return this.field3832.method8423(this.field3837, this.field3836);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "67"
	)
	public boolean method7060() {
		return this.field3842;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1691777440"
	)
	public boolean method7061() {
		return this.field3843;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-36"
	)
	public boolean method7062() {
		return this.method7060() && this.field3844 % 60 < 30;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1019304197"
	)
	public int method7063() {
		return this.field3836;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "49"
	)
	public int method7064() {
		return this.field3837;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "962467160"
	)
	public boolean method7065() {
		return this.field3840;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	public int method7066() {
		return this.field3857;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-116"
	)
	public int method7168() {
		return this.field3858;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-27"
	)
	public int method7069() {
		return this.field3832.method8438();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1189835467"
	)
	public int method7167() {
		return this.field3832.method8470();
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "158"
	)
	public int method7070() {
		return this.field3849;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-74"
	)
	public int method7071() {
		return this.field3846;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1464938968"
	)
	public int method7072() {
		return this.field3832.method8440();
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1195847563"
	)
	public int method7077() {
		return this.field3845;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1744670016"
	)
	public int method7170() {
		return this.field3832.method8515();
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2072236164"
	)
	public boolean method7075() {
		return this.method7167() > 1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1832157469"
	)
	boolean method7076() {
		return this.field3836 != this.field3837;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-13982"
	)
	String method7019(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7087(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luy;B)V",
		garbageValue = "0"
	)
	void method7049(class527 var1, class527 var2) {
		if ((Integer)var2.field5316 < (Integer)var1.field5316) {
			this.method7157((Integer)var1.field5317, (Integer)var2.field5316);
		} else {
			this.method7157((Integer)var1.field5316, (Integer)var2.field5317);
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;",
		garbageValue = "384480115"
	)
	class527 method7220(int var1) {
		int var2 = this.field3832.method8414();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7085(this.field3832.method8444(var5 - 1).field4839)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7085(this.field3832.method8444(var5).field4839)) {
				var4 = var5;
				break;
			}
		}

		return new class527(var3, var4);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;",
		garbageValue = "1379494582"
	)
	class527 method7080(int var1) {
		int var2 = this.field3832.method8414();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3832.method8444(var5 - 1).field4839 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3832.method8444(var5).field4839 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class527(var3, var4);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1214242487"
	)
	boolean method7038() {
		if (!this.method7065()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3832.method8414() > this.field3849) {
				this.field3832.method8521(this.field3849, this.field3832.method8414());
				var1 = true;
			}

			int var2 = this.method7167();
			int var3;
			if (this.field3832.method8436() > var2) {
				var3 = this.field3832.method8432(0, var2) - 1;
				this.field3832.method8521(var3, this.field3832.method8414());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3836;
				int var4 = this.field3837;
				int var5 = this.field3832.method8414();
				if (this.field3836 > var5) {
					var3 = var5;
				}

				if (this.field3837 > var5) {
					var4 = var5;
				}

				this.method7157(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1800990096"
	)
	void method7082(int var1, boolean var2) {
		if (var2) {
			this.method7157(this.field3837, var1);
		} else {
			this.method7157(var1, var1);
		}

	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-78"
	)
	int method7238() {
		return this.field3856 / this.field3832.method8435();
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-869164123"
	)
	void method7092() {
		class440 var1 = this.field3832.method8423(0, this.field3836);
		class527 var2 = var1.method8666();
		int var3 = this.field3832.method8435();
		int var4 = (Integer)var2.field5316 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5317 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3857;
		int var9 = var8 + this.field3861;
		int var10 = this.field3858;
		int var11 = var10 + this.field3856;
		int var12 = this.field3857;
		int var13 = this.field3858;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3861;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3856;
		}

		this.method7252(var12, var13);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-721598904"
	)
	boolean method7085(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-278790421"
	)
	void method7086() {
		if (this.field3859 != null) {
			this.field3859.vmethod6889();
		}

	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1307995963"
	)
	boolean method7087(int var1) {
		switch(this.field3845) {
		case 1:
			return GrandExchangeEvent.isAlphaNumeric((char)var1);
		case 2:
			return class288.isCharAlphabetic((char)var1);
		case 3:
			return SpotAnimationDefinition.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (SpotAnimationDefinition.isDigit(var2)) {
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

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(B)Luy;",
		garbageValue = "19"
	)
	class527 method7088() {
		int var1 = this.field3832.method8442(this.field3861);
		int var2 = this.field3832.method8443(this.field3856);
		return new class527(var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "42"
	)
	static void method7285(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}
}
