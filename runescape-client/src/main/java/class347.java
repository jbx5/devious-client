import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nf")
public class class347 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	class414 field3704;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	class414 field3705;
	@ObfuscatedName("av")
	boolean field3720;
	@ObfuscatedName("aa")
	boolean field3707;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 633818209
	)
	int field3708;
	@ObfuscatedName("am")
	boolean field3709;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1416549249
	)
	int field3710;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 56930121
	)
	int field3711;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1938348531
	)
	int field3712;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -696415297
	)
	int field3713;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1342328083
	)
	int field3714;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1505266767
	)
	int field3715;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1269111487
	)
	int field3703;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -739586287
	)
	int field3699;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 995068293
	)
	int field3718;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1873962829
	)
	int field3719;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -54602861
	)
	int field3717;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 678412027
	)
	int field3706;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1843053071
	)
	int field3722;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	class339 field3723;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	class339 field3724;

	class347() {
		this.field3704 = new class414();
		this.field3705 = new class414();
		this.field3720 = false;
		this.field3707 = true;
		this.field3708 = 0;
		this.field3709 = false;
		this.field3710 = 0;
		this.field3711 = 0;
		this.field3712 = 0;
		this.field3713 = 0;
		this.field3714 = 0;
		this.field3715 = 0;
		this.field3703 = 0;
		this.field3699 = Integer.MAX_VALUE;
		this.field3718 = Integer.MAX_VALUE;
		this.field3719 = 0;
		this.field3717 = 0;
		this.field3706 = 0;
		this.field3722 = 0;
		this.field3704.method7519(1);
		this.field3705.method7519(1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	void method6575() {
		this.field3708 = (this.field3708 + 1) % 60;
		if (this.field3703 > 0) {
			--this.field3703;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-8"
	)
	public boolean method6486(boolean var1) {
		var1 = var1 && this.field3707;
		boolean var2 = this.field3720 != var1;
		this.field3720 = var1;
		if (!this.field3720) {
			this.method6388(this.field3713, this.field3713);
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2094488853"
	)
	public void method6365(boolean var1) {
		this.field3707 = var1;
		this.field3720 = var1 && this.field3720;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "412370921"
	)
	public boolean method6366(String var1) {
		String var2 = this.field3704.method7539();
		if (!var2.equals(var1)) {
			var1 = this.method6565(var1);
			this.field3704.method7531(var1);
			this.method6388(this.field3714, this.field3713);
			this.method6373(this.field3706, this.field3722);
			this.method6621();
			this.method6441();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1425302395"
	)
	boolean method6367(String var1) {
		this.field3705.method7531(var1);
		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)Z",
		garbageValue = "-1587619498"
	)
	boolean method6368(AbstractFont var1) {
		boolean var2 = !this.field3709;
		this.field3704.method7518(var1);
		this.field3705.method7518(var1);
		this.field3709 = true;
		var2 |= this.method6373(this.field3706, this.field3722);
		var2 |= this.method6388(this.field3714, this.field3713);
		if (this.method6621()) {
			this.method6441();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1248509963"
	)
	public boolean method6369(int var1, int var2) {
		boolean var3 = this.field3719 != var1 || var2 != this.field3717;
		this.field3719 = var1;
		this.field3717 = var2;
		var3 |= this.method6373(this.field3706, this.field3722);
		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1757451957"
	)
	public boolean method6370(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3704.method7537();
		this.field3704.method7515(var1);
		this.field3705.method7515(var1);
		if (this.method6621()) {
			this.method6441();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1759905487"
	)
	public boolean method6390(int var1) {
		this.field3704.method7560(var1);
		if (this.method6621()) {
			this.method6441();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1885012973"
	)
	public boolean method6520(int var1) {
		this.field3718 = var1;
		if (this.method6621()) {
			this.method6441();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2053073056"
	)
	public boolean method6373(int var1, int var2) {
		if (!this.method6513()) {
			this.field3706 = var1;
			this.field3722 = var2;
			return false;
		} else {
			int var3 = this.field3706;
			int var4 = this.field3722;
			int var5 = Math.max(0, this.field3704.method7532() - this.field3719 + 2);
			int var6 = Math.max(0, this.field3704.method7533() - this.field3717 + 1);
			this.field3706 = Math.max(0, Math.min(var5, var1));
			this.field3722 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3706 || var4 != this.field3722;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2108697040"
	)
	public boolean method6374(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3704.method7520(var1, var2) : false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	public void method6375(int var1) {
		this.field3704.method7514(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "949948744"
	)
	public void method6376(int var1) {
		this.field3710 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	public void method6377(int var1) {
		this.field3704.method7519(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-8"
	)
	public void method6465(int var1) {
		this.field3704.method7618(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1787858640"
	)
	public boolean method6379(int var1) {
		this.field3712 = var1;
		String var2 = this.field3704.method7539();
		int var3 = var2.length();
		var2 = this.method6565(var2);
		if (var2.length() != var3) {
			this.field3704.method7531(var2);
			this.method6373(this.field3706, this.field3722);
			this.method6621();
			this.method6441();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1992125382"
	)
	public void method6380() {
		this.field3709 = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1906586043"
	)
	public boolean method6404(int var1) {
		if (this.method6463(var1)) {
			this.method6460();
			class415 var2 = this.field3704.method7523((char)var1, this.field3713, this.field3699);
			this.method6388(var2.method7647(), var2.method7647());
			this.method6621();
			this.method6441();
		}

		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1262687164"
	)
	public void method6382() {
		if (!this.method6460() && this.field3713 > 0) {
			int var1 = this.field3704.method7579(this.field3713 - 1);
			this.method6441();
			this.method6388(var1, var1);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1439316077"
	)
	public void method6383() {
		if (!this.method6460() && this.field3713 < this.field3704.method7513()) {
			int var1 = this.field3704.method7579(this.field3713);
			this.method6441();
			this.method6388(var1, var1);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	public void method6384() {
		if (!this.method6460() && this.field3713 > 0) {
			class505 var1 = this.method6434(this.field3713 - 1);
			int var2 = this.field3704.method7529((Integer)var1.field5090, this.field3713);
			this.method6441();
			this.method6388(var2, var2);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "663917"
	)
	public void method6385() {
		if (!this.method6460() && this.field3713 < this.field3704.method7513()) {
			class505 var1 = this.method6434(this.field3713);
			int var2 = this.field3704.method7529(this.field3713, (Integer)var1.field5089);
			this.method6441();
			this.method6388(var2, var2);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2018454978"
	)
	boolean method6460() {
		if (!this.method6381()) {
			return false;
		} else {
			int var1 = this.field3704.method7529(this.field3714, this.field3713);
			this.method6441();
			this.method6388(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "880872164"
	)
	public void method6387() {
		this.method6388(0, this.field3704.method7513());
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-765314180"
	)
	public boolean method6388(int var1, int var2) {
		if (!this.method6513()) {
			this.field3714 = var1;
			this.field3713 = var2;
			return false;
		} else {
			if (var1 > this.field3704.method7513()) {
				var1 = this.field3704.method7513();
			}

			if (var2 > this.field3704.method7513()) {
				var2 = this.field3704.method7513();
			}

			boolean var3 = this.field3714 != var1 || var2 != this.field3713;
			this.field3714 = var1;
			if (var2 != this.field3713) {
				this.field3713 = var2;
				this.field3708 = 0;
				this.method6439();
			}

			if (var3 && this.field3724 != null) {
				this.field3724.vmethod6279();
			}

			return var3;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2000894436"
	)
	public void method6389(boolean var1) {
		class505 var2 = this.method6435(this.field3713);
		this.method6437((Integer)var2.field5090, var1);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "9"
	)
	public void method6419(boolean var1) {
		class505 var2 = this.method6435(this.field3713);
		this.method6437((Integer)var2.field5089, var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1722616829"
	)
	public void method6391(boolean var1) {
		this.method6437(0, var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1551964769"
	)
	public void method6502(boolean var1) {
		this.method6437(this.field3704.method7513(), var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-116018656"
	)
	public void method6393(boolean var1) {
		if (this.method6381() && !var1) {
			this.method6437(Math.min(this.field3714, this.field3713), var1);
		} else if (this.field3713 > 0) {
			this.method6437(this.field3713 - 1, var1);
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "10"
	)
	public void method6487(boolean var1) {
		if (this.method6381() && !var1) {
			this.method6437(Math.max(this.field3714, this.field3713), var1);
		} else if (this.field3713 < this.field3704.method7513()) {
			this.method6437(this.field3713 + 1, var1);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	public void method6558(boolean var1) {
		if (this.field3713 > 0) {
			class505 var2 = this.method6434(this.field3713 - 1);
			this.method6437((Integer)var2.field5090, var1);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2143687715"
	)
	public void method6396(boolean var1) {
		if (this.field3713 < this.field3704.method7513()) {
			class505 var2 = this.method6434(this.field3713 + 1);
			this.method6437((Integer)var2.field5089, var1);
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1143277370"
	)
	public void method6415(boolean var1) {
		if (this.field3713 > 0) {
			this.method6437(this.field3704.method7601(this.field3713, -1), var1);
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1865829578"
	)
	public void method6398(boolean var1) {
		if (this.field3713 < this.field3704.method7513()) {
			this.method6437(this.field3704.method7601(this.field3713, 1), var1);
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-90655933"
	)
	public void method6399(boolean var1) {
		if (this.field3713 > 0) {
			int var2 = this.method6421();
			this.method6437(this.field3704.method7601(this.field3713, -var2), var1);
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-2"
	)
	public void method6400(boolean var1) {
		if (this.field3713 < this.field3704.method7513()) {
			int var2 = this.method6421();
			this.method6437(this.field3704.method7601(this.field3713, var2), var1);
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-7"
	)
	public void method6444(boolean var1) {
		class418 var2 = this.field3704.method7522(0, this.field3713);
		class505 var3 = var2.method7768();
		this.method6437(this.field3704.method7587((Integer)var3.field5090, this.field3722), var1);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-2"
	)
	public void method6402(boolean var1) {
		class418 var2 = this.field3704.method7522(0, this.field3713);
		class505 var3 = var2.method7768();
		this.method6437(this.field3704.method7587((Integer)var3.field5090, this.field3722 + this.field3717), var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1786925884"
	)
	public void method6403(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class505 var6;
		int var8;
		if (!this.field3709) {
			var8 = 0;
		} else {
			var1 += this.field3706;
			var2 += this.field3722;
			var6 = this.method6443();
			var8 = this.field3704.method7587(var1 - (Integer)var6.field5090, var2 - (Integer)var6.field5089);
		}

		if (var3 && var4) {
			this.field3711 = 1;
			var6 = this.method6434(var8);
			class505 var7 = this.method6434(this.field3715);
			this.method6433(var7, var6);
		} else if (var3) {
			this.field3711 = 1;
			var6 = this.method6434(var8);
			this.method6388((Integer)var6.field5090, (Integer)var6.field5089);
			this.field3715 = (Integer)var6.field5090;
		} else if (var4) {
			this.method6388(this.field3715, var8);
		} else {
			if (this.field3703 > 0 && var8 == this.field3715) {
				if (this.field3714 == this.field3713) {
					this.field3711 = 1;
					var6 = this.method6434(var8);
					this.method6388((Integer)var6.field5090, (Integer)var6.field5089);
				} else {
					this.field3711 = 2;
					var6 = this.method6435(var8);
					this.method6388((Integer)var6.field5090, (Integer)var6.field5089);
				}
			} else {
				this.field3711 = 0;
				this.method6388(var8, var8);
				this.field3715 = var8;
			}

			this.field3703 = 25;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "36"
	)
	public void method6395(int var1, int var2) {
		if (this.field3709 && this.method6459()) {
			var1 += this.field3706;
			var2 += this.field3722;
			class505 var3 = this.method6443();
			int var4 = this.field3704.method7587(var1 - (Integer)var3.field5090, var2 - (Integer)var3.field5089);
			class505 var5;
			class505 var6;
			switch(this.field3711) {
			case 0:
				this.method6388(this.field3714, var4);
				break;
			case 1:
				var5 = this.method6434(this.field3715);
				var6 = this.method6434(var4);
				this.method6433(var5, var6);
				break;
			case 2:
				var5 = this.method6435(this.field3715);
				var6 = this.method6435(var4);
				this.method6433(var5, var6);
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-979681908"
	)
	public void method6405(Clipboard var1) {
		class418 var2 = this.field3704.method7522(this.field3714, this.field3713);
		if (!var2.method7783()) {
			String var3 = var2.method7763();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1627324748"
	)
	public void method6420(Clipboard var1) {
		if (this.method6381()) {
			this.method6405(var1);
			this.method6460();
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1956126753"
	)
	public void method6518(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6565((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6460();
				class415 var4 = this.field3704.method7524(var3, this.field3713, this.field3699);
				this.method6388(var4.method7647(), var4.method7647());
				this.method6621();
				this.method6441();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1264919921"
	)
	public void method6591() {
		this.field3722 = Math.max(0, this.field3722 - this.field3704.method7511());
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-26997525"
	)
	public void method6401() {
		int var1 = Math.max(0, this.field3704.method7533() - this.field3717);
		this.field3722 = Math.min(var1, this.field3722 + this.field3704.method7511());
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "182286842"
	)
	public void method6410(class339 var1) {
		this.field3723 = var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "2061492133"
	)
	public void method6411(class339 var1) {
		this.field3724 = var1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Lpl;",
		garbageValue = "-43"
	)
	public class414 method6412() {
		return this.field3704;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "2055669649"
	)
	public class414 method6413() {
		return this.field3705;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Lqs;",
		garbageValue = "1"
	)
	public class418 method6431() {
		return this.field3704.method7522(this.field3714, this.field3713);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	public boolean method6459() {
		return this.field3720;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2058642585"
	)
	public boolean method6416() {
		return this.field3707;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "6888321"
	)
	public boolean method6616() {
		return this.method6459() && this.field3708 % 60 < 30;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method6510() {
		return this.field3713;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2029522419"
	)
	public int method6559() {
		return this.field3714;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "105"
	)
	public boolean method6513() {
		return this.field3709;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-861544381"
	)
	public int method6473() {
		return this.field3706;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1585413102"
	)
	public int method6422() {
		return this.field3722;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1679889553"
	)
	public int method6423() {
		return this.field3704.method7537();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-762480006"
	)
	public int method6424() {
		return this.field3704.method7642();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1982517099"
	)
	public int method6425() {
		return this.field3718;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	public int method6574() {
		return this.field3710;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1168571052"
	)
	public int method6427() {
		return this.field3704.method7540();
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "11471171"
	)
	public int method6428() {
		return this.field3712;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1121128681"
	)
	public int method6429() {
		return this.field3704.method7534();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-35"
	)
	public boolean method6430() {
		return this.method6424() > 1;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	boolean method6381() {
		return this.field3713 != this.field3714;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1456061272"
	)
	String method6565(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6463(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ltd;Ltd;B)V",
		garbageValue = "114"
	)
	void method6433(class505 var1, class505 var2) {
		if ((Integer)var2.field5090 < (Integer)var1.field5090) {
			this.method6388((Integer)var1.field5089, (Integer)var2.field5090);
		} else {
			this.method6388((Integer)var1.field5090, (Integer)var2.field5089);
		}

	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltd;",
		garbageValue = "1"
	)
	class505 method6434(int var1) {
		int var2 = this.field3704.method7513();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6440(this.field3704.method7509(var5 - 1).field4607)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6440(this.field3704.method7509(var5).field4607)) {
				var4 = var5;
				break;
			}
		}

		return new class505(var3, var4);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)Ltd;",
		garbageValue = "-1223506802"
	)
	class505 method6435(int var1) {
		int var2 = this.field3704.method7513();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3704.method7509(var5 - 1).field4607 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3704.method7509(var5).field4607 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class505(var3, var4);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "161244868"
	)
	boolean method6621() {
		if (!this.method6513()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3704.method7513() > this.field3718) {
				this.field3704.method7529(this.field3718, this.field3704.method7513());
				var1 = true;
			}

			int var2 = this.method6424();
			int var3;
			if (this.field3704.method7535() > var2) {
				var3 = this.field3704.method7601(0, var2) - 1;
				this.field3704.method7529(var3, this.field3704.method7513());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3713;
				int var4 = this.field3714;
				int var5 = this.field3704.method7513();
				if (this.field3713 > var5) {
					var3 = var5;
				}

				if (this.field3714 > var5) {
					var4 = var5;
				}

				this.method6388(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IZS)V",
		garbageValue = "1011"
	)
	void method6437(int var1, boolean var2) {
		if (var2) {
			this.method6388(this.field3714, var1);
		} else {
			this.method6388(var1, var1);
		}

	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1898461256"
	)
	int method6421() {
		return this.field3717 / this.field3704.method7511();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	void method6439() {
		class418 var1 = this.field3704.method7522(0, this.field3713);
		class505 var2 = var1.method7768();
		int var3 = this.field3704.method7511();
		int var4 = (Integer)var2.field5090 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5089 - 3;
		int var7 = var3 + var6 + 6;
		int var8 = this.field3706;
		int var9 = var8 + this.field3719;
		int var10 = this.field3722;
		int var11 = var10 + this.field3717;
		int var12 = this.field3706;
		int var13 = this.field3722;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3719;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3717;
		}

		this.method6373(var12, var13);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-836467031"
	)
	boolean method6440(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "235053595"
	)
	void method6441() {
		if (this.field3723 != null) {
			this.field3723.vmethod6279();
		}

	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1455554406"
	)
	boolean method6463(int var1) {
		switch(this.field3712) {
		case 1:
			return class210.isAlphaNumeric((char)var1);
		case 2:
			return UserComparator10.isCharAlphabetic((char)var1);
		case 3:
			return class384.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class384.isDigit(var2)) {
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

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)Ltd;",
		garbageValue = "1550358867"
	)
	class505 method6443() {
		int var1 = this.field3704.method7549(this.field3719);
		int var2 = this.field3704.method7542(this.field3717);
		return new class505(var1, var2);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1629885069"
	)
	static int method6642(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class172.Client_plane;
			int var15 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7);
			int var8 = DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7);
			MouseRecorder.getWorldMap().method8719(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				String var16 = "";
				var9 = MouseRecorder.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				MouseRecorder.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				MouseRecorder.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
					MouseRecorder.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
					MouseRecorder.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
					MouseRecorder.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
					MouseRecorder.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var11 = MouseRecorder.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var11 = MouseRecorder.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var11 = MouseRecorder.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var11 = MouseRecorder.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = MouseRecorder.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
						var11 = MouseRecorder.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
							var11 = MouseRecorder.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
								FileSystem.method3537(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
								FileSystem.method3537(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
								var9 = MouseRecorder.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
								var11 = MouseRecorder.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								MouseRecorder.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								MouseRecorder.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								MouseRecorder.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								MouseRecorder.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
									MouseRecorder.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
									MouseRecorder.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
									MouseRecorder.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									MouseRecorder.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
									MouseRecorder.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										HttpRequestTask.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1] == 1;
										MouseRecorder.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										HttpRequestTask.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1] == 1;
										MouseRecorder.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										HttpRequestTask.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
										var5 = MouseRecorder.getWorldMap().method8764(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = MouseRecorder.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = MouseRecorder.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
												var4 = WidgetDefinition.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
												var4 = WidgetDefinition.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
												var4 = WidgetDefinition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
												var4 = WidgetDefinition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord2.packed();
												return 1;
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
			}
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1405156583"
	)
	public static boolean method6641() {
		return Client.staffModLevel >= 2;
	}
}
