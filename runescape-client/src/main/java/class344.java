import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public class class344 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	class410 field3661;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	class410 field3662;
	@ObfuscatedName("as")
	boolean field3663;
	@ObfuscatedName("ab")
	boolean field3664;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -927562215
	)
	int field3654;
	@ObfuscatedName("ai")
	boolean field3677;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 723808703
	)
	int field3658;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -518060953
	)
	int field3668;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1660195199
	)
	int field3669;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1322171211
	)
	int field3670;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1422970877
	)
	int field3671;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1252841213
	)
	int field3672;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1189192165
	)
	int field3673;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -2088724375
	)
	int field3674;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1517047265
	)
	int field3675;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 281895221
	)
	int field3666;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 227423931
	)
	int field3678;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1170236757
	)
	int field3665;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1803766269
	)
	int field3667;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	class337 field3680;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	class337 field3681;

	class344() {
		this.field3661 = new class410();
		this.field3662 = new class410();
		this.field3663 = false;
		this.field3664 = true;
		this.field3654 = 0;
		this.field3677 = false;
		this.field3658 = 0;
		this.field3668 = 0;
		this.field3669 = 0;
		this.field3670 = 0;
		this.field3671 = 0;
		this.field3672 = 0;
		this.field3673 = 0;
		this.field3674 = Integer.MAX_VALUE;
		this.field3675 = Integer.MAX_VALUE;
		this.field3666 = 0;
		this.field3678 = 0;
		this.field3665 = 0;
		this.field3667 = 0;
		this.field3661.method7674(1);
		this.field3662.method7674(1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-84965937"
	)
	void method6416() {
		this.field3654 = (this.field3654 + 1) % 60;
		if (this.field3673 > 0) {
			--this.field3673;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1739563427"
	)
	public boolean method6475(boolean var1) {
		var1 = var1 && this.field3664;
		boolean var2 = this.field3663 != var1;
		this.field3663 = var1;
		if (!this.field3663) {
			this.method6441(this.field3670, this.field3670);
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "90"
	)
	public void method6418(boolean var1) {
		this.field3664 = var1;
		this.field3663 = var1 && this.field3663;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "27"
	)
	public boolean method6639(String var1) {
		String var2 = this.field3661.method7608();
		if (!var2.equals(var1)) {
			var1 = this.method6484(var1);
			this.field3661.method7635(var1);
			this.method6441(this.field3671, this.field3670);
			this.method6426(this.field3665, this.field3667);
			this.method6439();
			this.method6493();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "12"
	)
	boolean method6420(String var1) {
		this.field3662.method7635(var1);
		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)Z",
		garbageValue = "-76054362"
	)
	boolean method6637(AbstractFont var1) {
		boolean var2 = !this.field3677;
		this.field3661.method7610(var1);
		this.field3662.method7610(var1);
		this.field3677 = true;
		var2 |= this.method6426(this.field3665, this.field3667);
		var2 |= this.method6441(this.field3671, this.field3670);
		if (this.method6439()) {
			this.method6493();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-827732084"
	)
	public boolean method6422(int var1, int var2) {
		boolean var3 = this.field3666 != var1 || var2 != this.field3678;
		this.field3666 = var1;
		this.field3678 = var2;
		var3 |= this.method6426(this.field3665, this.field3667);
		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1199776693"
	)
	public boolean method6423(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3661.method7631();
		this.field3661.method7609(var1);
		this.field3662.method7609(var1);
		if (this.method6439()) {
			this.method6493();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-923313975"
	)
	public boolean method6424(int var1) {
		this.field3661.method7606(var1);
		if (this.method6439()) {
			this.method6493();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2138901136"
	)
	public boolean method6425(int var1) {
		this.field3675 = var1;
		if (this.method6439()) {
			this.method6493();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2040478791"
	)
	public boolean method6426(int var1, int var2) {
		if (!this.method6472()) {
			this.field3665 = var1;
			this.field3667 = var2;
			return false;
		} else {
			int var3 = this.field3665;
			int var4 = this.field3667;
			int var5 = Math.max(0, this.field3661.method7626() - this.field3666 + 2);
			int var6 = Math.max(0, this.field3661.method7725() - this.field3678 + 1);
			this.field3665 = Math.max(0, Math.min(var5, var1));
			this.field3667 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3665 || var4 != this.field3667;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-677251205"
	)
	public boolean method6435(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3661.method7634(var1, var2) : false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-395216684"
	)
	public void method6428(int var1) {
		this.field3661.method7735(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	public void method6429(int var1) {
		this.field3658 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "84"
	)
	public void method6446(int var1) {
		this.field3661.method7674(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1805115412"
	)
	public void method6431(int var1) {
		this.field3661.method7611(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method6432(int var1) {
		this.field3669 = var1;
		String var2 = this.field3661.method7608();
		int var3 = var2.length();
		var2 = this.method6484(var2);
		if (var2.length() != var3) {
			this.field3661.method7635(var2);
			this.method6426(this.field3665, this.field3667);
			this.method6439();
			this.method6493();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1347183701"
	)
	public void method6433() {
		this.field3677 = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-11903"
	)
	public boolean method6434(int var1) {
		if (this.method6494(var1)) {
			this.method6631();
			class411 var2 = this.field3661.method7620((char)var1, this.field3670, this.field3674);
			this.method6441(var2.method7743(), var2.method7743());
			this.method6439();
			this.method6493();
		}

		return true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "28884836"
	)
	public void method6545() {
		if (!this.method6631() && this.field3670 > 0) {
			int var1 = this.field3661.method7622(this.field3670 - 1);
			this.method6493();
			this.method6441(var1, var1);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	public void method6662() {
		if (!this.method6631() && this.field3670 < this.field3661.method7701()) {
			int var1 = this.field3661.method7622(this.field3670);
			this.method6493();
			this.method6441(var1, var1);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1048565678"
	)
	public void method6618() {
		if (!this.method6631() && this.field3670 > 0) {
			class501 var1 = this.method6539(this.field3670 - 1);
			int var2 = this.field3661.method7646((Integer)var1.field5041, this.field3670);
			this.method6493();
			this.method6441(var2, var2);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	public void method6438() {
		if (!this.method6631() && this.field3670 < this.field3661.method7701()) {
			class501 var1 = this.method6539(this.field3670);
			int var2 = this.field3661.method7646(this.field3670, (Integer)var1.field5042);
			this.method6493();
			this.method6441(var2, var2);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1878211035"
	)
	boolean method6631() {
		if (!this.method6483()) {
			return false;
		} else {
			int var1 = this.field3661.method7646(this.field3671, this.field3670);
			this.method6493();
			this.method6441(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1073491575"
	)
	public void method6440() {
		this.method6441(0, this.field3661.method7701());
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "600882972"
	)
	public boolean method6441(int var1, int var2) {
		if (!this.method6472()) {
			this.field3671 = var1;
			this.field3670 = var2;
			return false;
		} else {
			if (var1 > this.field3661.method7701()) {
				var1 = this.field3661.method7701();
			}

			if (var2 > this.field3661.method7701()) {
				var2 = this.field3661.method7701();
			}

			boolean var3 = this.field3671 != var1 || var2 != this.field3670;
			this.field3671 = var1;
			if (var2 != this.field3670) {
				this.field3670 = var2;
				this.field3654 = 0;
				this.method6491();
			}

			if (var3 && this.field3681 != null) {
				this.field3681.vmethod6342();
			}

			return var3;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "19"
	)
	public void method6682(boolean var1) {
		class501 var2 = this.method6487(this.field3670);
		this.method6489((Integer)var2.field5041, var1);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-832245630"
	)
	public void method6443(boolean var1) {
		class501 var2 = this.method6487(this.field3670);
		this.method6489((Integer)var2.field5042, var1);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-75"
	)
	public void method6444(boolean var1) {
		this.method6489(0, var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1523194643"
	)
	public void method6523(boolean var1) {
		this.method6489(this.field3661.method7701(), var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1810464131"
	)
	public void method6653(boolean var1) {
		if (this.method6483() && !var1) {
			this.method6489(Math.min(this.field3671, this.field3670), var1);
		} else if (this.field3670 > 0) {
			this.method6489(this.field3670 - 1, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-951550480"
	)
	public void method6447(boolean var1) {
		if (this.method6483() && !var1) {
			this.method6489(Math.max(this.field3671, this.field3670), var1);
		} else if (this.field3670 < this.field3661.method7701()) {
			this.method6489(this.field3670 + 1, var1);
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "81"
	)
	public void method6615(boolean var1) {
		if (this.field3670 > 0) {
			class501 var2 = this.method6539(this.field3670 - 1);
			this.method6489((Integer)var2.field5041, var1);
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6575(boolean var1) {
		if (this.field3670 < this.field3661.method7701()) {
			class501 var2 = this.method6539(this.field3670 + 1);
			this.method6489((Integer)var2.field5042, var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-403282535"
	)
	public void method6450(boolean var1) {
		if (this.field3670 > 0) {
			this.method6489(this.field3661.method7734(this.field3670, -1), var1);
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "40"
	)
	public void method6451(boolean var1) {
		if (this.field3670 < this.field3661.method7701()) {
			this.method6489(this.field3661.method7734(this.field3670, 1), var1);
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2087852013"
	)
	public void method6526(boolean var1) {
		if (this.field3670 > 0) {
			int var2 = this.method6563();
			this.method6489(this.field3661.method7734(this.field3670, -var2), var1);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-218253011"
	)
	public void method6599(boolean var1) {
		if (this.field3670 < this.field3661.method7701()) {
			int var2 = this.method6563();
			this.method6489(this.field3661.method7734(this.field3670, var2), var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1904095126"
	)
	public void method6454(boolean var1) {
		class414 var2 = this.field3661.method7616(0, this.field3670);
		class501 var3 = var2.method7886();
		this.method6489(this.field3661.method7624((Integer)var3.field5041, this.field3667), var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "716006051"
	)
	public void method6455(boolean var1) {
		class414 var2 = this.field3661.method7616(0, this.field3670);
		class501 var3 = var2.method7886();
		this.method6489(this.field3661.method7624((Integer)var3.field5041, this.field3667 + this.field3678), var1);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "1"
	)
	public void method6465(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class501 var6;
		int var8;
		if (!this.field3677) {
			var8 = 0;
		} else {
			var1 += this.field3665;
			var2 += this.field3667;
			var6 = this.method6495();
			var8 = this.field3661.method7624(var1 - (Integer)var6.field5041, var2 - (Integer)var6.field5042);
		}

		if (var3 && var4) {
			this.field3668 = 1;
			var6 = this.method6539(var8);
			class501 var7 = this.method6539(this.field3672);
			this.method6485(var7, var6);
		} else if (var3) {
			this.field3668 = 1;
			var6 = this.method6539(var8);
			this.method6441((Integer)var6.field5041, (Integer)var6.field5042);
			this.field3672 = (Integer)var6.field5041;
		} else if (var4) {
			this.method6441(this.field3672, var8);
		} else {
			if (this.field3673 > 0 && var8 == this.field3672) {
				if (this.field3671 == this.field3670) {
					this.field3668 = 1;
					var6 = this.method6539(var8);
					this.method6441((Integer)var6.field5041, (Integer)var6.field5042);
				} else {
					this.field3668 = 2;
					var6 = this.method6487(var8);
					this.method6441((Integer)var6.field5041, (Integer)var6.field5042);
				}
			} else {
				this.field3668 = 0;
				this.method6441(var8, var8);
				this.field3672 = var8;
			}

			this.field3673 = 25;
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1238890691"
	)
	public void method6518(int var1, int var2) {
		if (this.field3677 && this.method6468()) {
			var1 += this.field3665;
			var2 += this.field3667;
			class501 var3 = this.method6495();
			int var4 = this.field3661.method7624(var1 - (Integer)var3.field5041, var2 - (Integer)var3.field5042);
			class501 var5;
			class501 var6;
			switch(this.field3668) {
			case 0:
				this.method6441(this.field3671, var4);
				break;
			case 1:
				var5 = this.method6539(this.field3672);
				var6 = this.method6539(var4);
				this.method6485(var5, var6);
				break;
			case 2:
				var5 = this.method6487(this.field3672);
				var6 = this.method6487(var4);
				this.method6485(var5, var6);
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-2007795370"
	)
	public void method6458(Clipboard var1) {
		class414 var2 = this.field3661.method7616(this.field3671, this.field3670);
		if (!var2.method7882()) {
			String var3 = var2.method7883();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "6"
	)
	public void method6459(Clipboard var1) {
		if (this.method6483()) {
			this.method6458(var1);
			this.method6631();
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-448030902"
	)
	public void method6460(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6484((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6631();
				class411 var4 = this.field3661.method7618(var3, this.field3670, this.field3674);
				this.method6441(var4.method7743(), var4.method7743());
				this.method6439();
				this.method6493();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-536063803"
	)
	public void method6558() {
		this.field3667 = Math.max(0, this.field3667 - this.field3661.method7628());
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1640514736"
	)
	public void method6544() {
		int var1 = Math.max(0, this.field3661.method7725() - this.field3678);
		this.field3667 = Math.min(var1, this.field3667 + this.field3661.method7628());
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lmn;I)V",
		garbageValue = "-649011962"
	)
	public void method6463(class337 var1) {
		this.field3680 = var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lmn;I)V",
		garbageValue = "1906988469"
	)
	public void method6464(class337 var1) {
		this.field3681 = var1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;",
		garbageValue = "-1481638233"
	)
	public class410 method6442() {
		return this.field3661;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;",
		garbageValue = "-1712409033"
	)
	public class410 method6564() {
		return this.field3662;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)Lpo;",
		garbageValue = "41"
	)
	public class414 method6467() {
		return this.field3661.method7616(this.field3671, this.field3670);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method6468() {
		return this.field3663;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "86"
	)
	public boolean method6672() {
		return this.field3664;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "34"
	)
	public boolean method6548() {
		return this.method6468() && this.field3654 % 60 < 30;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2094283485"
	)
	public int method6471() {
		return this.field3670;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "68"
	)
	public int method6531() {
		return this.field3671;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "701930769"
	)
	public boolean method6472() {
		return this.field3677;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	public int method6504() {
		return this.field3665;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1416952932"
	)
	public int method6474() {
		return this.field3667;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "84"
	)
	public int method6452() {
		return this.field3661.method7631();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1054433888"
	)
	public int method6476() {
		return this.field3661.method7632();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-778621174"
	)
	public int method6477() {
		return this.field3675;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-17"
	)
	public int method6663() {
		return this.field3658;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-65"
	)
	public int method6479() {
		return this.field3661.method7633();
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	public int method6480() {
		return this.field3669;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public int method6593() {
		return this.field3661.method7699();
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1835257177"
	)
	public boolean method6482() {
		return this.method6476() > 1;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1601411461"
	)
	boolean method6483() {
		return this.field3670 != this.field3671;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "122"
	)
	String method6484(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6494(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ltg;Ltg;I)V",
		garbageValue = "-688476977"
	)
	void method6485(class501 var1, class501 var2) {
		if ((Integer)var2.field5041 < (Integer)var1.field5041) {
			this.method6441((Integer)var1.field5042, (Integer)var2.field5041);
		} else {
			this.method6441((Integer)var1.field5041, (Integer)var2.field5042);
		}

	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)Ltg;",
		garbageValue = "1290124594"
	)
	class501 method6539(int var1) {
		int var2 = this.field3661.method7701();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6492(this.field3661.method7603(var5 - 1).field4545)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6492(this.field3661.method7603(var5).field4545)) {
				var4 = var5;
				break;
			}
		}

		return new class501(var3, var4);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltg;",
		garbageValue = "100"
	)
	class501 method6487(int var1) {
		int var2 = this.field3661.method7701();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3661.method7603(var5 - 1).field4545 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3661.method7603(var5).field4545 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class501(var3, var4);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2047199645"
	)
	boolean method6439() {
		if (!this.method6472()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3661.method7701() > this.field3675) {
				this.field3661.method7646(this.field3675, this.field3661.method7701());
				var1 = true;
			}

			int var2 = this.method6476();
			int var3;
			if (this.field3661.method7629() > var2) {
				var3 = this.field3661.method7734(0, var2) - 1;
				this.field3661.method7646(var3, this.field3661.method7701());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3670;
				int var4 = this.field3671;
				int var5 = this.field3661.method7701();
				if (this.field3670 > var5) {
					var3 = var5;
				}

				if (this.field3671 > var5) {
					var4 = var5;
				}

				this.method6441(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "59"
	)
	void method6489(int var1, boolean var2) {
		if (var2) {
			this.method6441(this.field3671, var1);
		} else {
			this.method6441(var1, var1);
		}

	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-111535006"
	)
	int method6563() {
		return this.field3678 / this.field3661.method7628();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1588298523"
	)
	void method6491() {
		class414 var1 = this.field3661.method7616(0, this.field3670);
		class501 var2 = var1.method7886();
		int var3 = this.field3661.method7628();
		int var4 = (Integer)var2.field5041 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5042 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3665;
		int var9 = var8 + this.field3666;
		int var10 = this.field3667;
		int var11 = var10 + this.field3678;
		int var12 = this.field3665;
		int var13 = this.field3667;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3666;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3678;
		}

		this.method6426(var12, var13);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-90"
	)
	boolean method6492(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	void method6493() {
		if (this.field3680 != null) {
			this.field3680.vmethod6342();
		}

	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-985592109"
	)
	boolean method6494(int var1) {
		switch(this.field3669) {
		case 1:
			return WorldMapIcon_0.isAlphaNumeric((char)var1);
		case 2:
			return PlayerType.isCharAlphabetic((char)var1);
		case 3:
			return ScriptFrame.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (ScriptFrame.isDigit(var2)) {
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
		descriptor = "(I)Ltg;",
		garbageValue = "-1550125844"
	)
	class501 method6495() {
		int var1 = this.field3661.method7623(this.field3666);
		int var2 = this.field3661.method7636(this.field3678);
		return new class501(var1, var2);
	}
}
