import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public class class329 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class394 field3599;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class394 field3588;
	@ObfuscatedName("ah")
	boolean field3612;
	@ObfuscatedName("as")
	boolean field3600;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -431478779
	)
	int field3597;
	@ObfuscatedName("aj")
	boolean field3602;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -351339173
	)
	int field3603;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 204432917
	)
	int field3617;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1633191951
	)
	int field3605;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -972960841
	)
	int field3607;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -961539401
	)
	int field3606;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1144432645
	)
	int field3608;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1912313197
	)
	int field3609;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -363578579
	)
	int field3598;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -878896123
	)
	int field3615;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1556928317
	)
	int field3604;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1288731127
	)
	int field3613;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 687942875
	)
	int field3614;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1187411399
	)
	int field3601;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	class323 field3616;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	class323 field3611;

	class329() {
		this.field3599 = new class394();
		this.field3588 = new class394();
		this.field3612 = false;
		this.field3600 = true;
		this.field3597 = 0;
		this.field3602 = false;
		this.field3603 = 0;
		this.field3617 = 0;
		this.field3605 = 0;
		this.field3607 = 0;
		this.field3606 = 0;
		this.field3608 = 0;
		this.field3609 = 0;
		this.field3598 = Integer.MAX_VALUE;
		this.field3615 = Integer.MAX_VALUE;
		this.field3604 = 0;
		this.field3613 = 0;
		this.field3614 = 0;
		this.field3601 = 0;
		this.field3599.method7350(1);
		this.field3588.method7350(1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	void method6105() {
		this.field3597 = (this.field3597 + 1) % 60;
		if (this.field3609 > 0) {
			--this.field3609;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1080189228"
	)
	public boolean method6106(boolean var1) {
		var1 = var1 && this.field3600;
		boolean var2 = this.field3612 != var1;
		this.field3612 = var1;
		if (!this.field3612) {
			this.method6130(this.field3607, this.field3607);
		}

		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "220495780"
	)
	public void method6143(boolean var1) {
		this.field3600 = var1;
		this.field3612 = var1 && this.field3612;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-764154033"
	)
	boolean method6290(String var1) {
		String var2 = this.field3599.method7282();
		if (!var2.equals(var1)) {
			var1 = this.method6165(var1);
			this.field3599.method7358(var1);
			this.method6115(this.field3614, this.field3601);
			this.method6178();
			this.method6183();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "0"
	)
	boolean method6109(String var1) {
		this.field3588.method7358(var1);
		return true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lpk;B)Z",
		garbageValue = "2"
	)
	boolean method6110(AbstractFont var1) {
		boolean var2 = !this.field3602;
		this.field3599.method7286(var1);
		this.field3588.method7286(var1);
		this.field3602 = true;
		var2 |= this.method6115(this.field3614, this.field3601);
		var2 |= this.method6130(this.field3606, this.field3607);
		if (this.method6178()) {
			this.method6183();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-41"
	)
	public boolean method6111(int var1, int var2) {
		boolean var3 = this.field3604 != var1 || var2 != this.field3613;
		this.field3604 = var1;
		this.field3613 = var2;
		var3 |= this.method6115(this.field3614, this.field3601);
		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1183077231"
	)
	public boolean method6112(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3599.method7403();
		this.field3599.method7328(var1);
		this.field3588.method7328(var1);
		if (this.method6178()) {
			this.method6183();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-790356702"
	)
	public boolean method6113(int var1) {
		this.field3599.method7280(var1);
		if (this.method6178()) {
			this.method6183();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-34"
	)
	public boolean method6322(int var1) {
		this.field3615 = var1;
		if (this.method6178()) {
			this.method6183();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1916065285"
	)
	public boolean method6115(int var1, int var2) {
		if (!this.method6162()) {
			this.field3614 = var1;
			this.field3601 = var2;
			return false;
		} else {
			int var3 = this.field3614;
			int var4 = this.field3601;
			int var5 = Math.max(0, this.field3599.method7300() - this.field3604 + 2);
			int var6 = Math.max(0, this.field3599.method7301() - this.field3613 + 1);
			this.field3614 = Math.max(0, Math.min(var5, var1));
			this.field3601 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3614 || var4 != this.field3601;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-28947"
	)
	public boolean method6267(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3599.method7288(var1, var2) : false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "105"
	)
	public void method6117(int var1) {
		this.field3599.method7289(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "318624055"
	)
	public void method6118(int var1) {
		this.field3603 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-745884306"
	)
	public void method6378(int var1) {
		this.field3599.method7350(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "73"
	)
	public void method6376(int var1) {
		this.field3599.method7285(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1266422233"
	)
	public boolean method6201(int var1) {
		this.field3605 = var1;
		String var2 = this.field3599.method7282();
		int var3 = var2.length();
		var2 = this.method6165(var2);
		if (var2.length() != var3) {
			this.field3599.method7358(var2);
			this.method6115(this.field3614, this.field3601);
			this.method6178();
			this.method6183();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-313169923"
	)
	public void method6122() {
		this.field3602 = false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-88"
	)
	public boolean method6199(int var1) {
		if (this.method6172(var1)) {
			this.method6128();
			class395 var2 = this.field3599.method7346((char)var1, this.field3607, this.field3598);
			this.method6130(var2.method7419(), var2.method7419());
			this.method6178();
			this.method6183();
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1833500314"
	)
	public void method6124() {
		if (!this.method6128() && this.field3607 > 0) {
			int var1 = this.field3599.method7296(this.field3607 - 1);
			this.method6183();
			this.method6130(var1, var1);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	public void method6125() {
		if (!this.method6128() && this.field3607 < this.field3599.method7281()) {
			int var1 = this.field3599.method7296(this.field3607);
			this.method6183();
			this.method6130(var1, var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	public void method6126() {
		if (!this.method6128() && this.field3607 > 0) {
			class485 var1 = this.method6176(this.field3607 - 1);
			int var2 = this.field3599.method7297((Integer)var1.field4966, this.field3607);
			this.method6183();
			this.method6130(var2, var2);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	public void method6156() {
		if (!this.method6128() && this.field3607 < this.field3599.method7281()) {
			class485 var1 = this.method6176(this.field3607);
			int var2 = this.field3599.method7297(this.field3607, (Integer)var1.field4965);
			this.method6183();
			this.method6130(var2, var2);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1216764682"
	)
	boolean method6128() {
		if (!this.method6173()) {
			return false;
		} else {
			int var1 = this.field3599.method7297(this.field3606, this.field3607);
			this.method6183();
			this.method6130(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	public void method6370() {
		this.method6130(0, this.field3599.method7281());
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "28215574"
	)
	public boolean method6130(int var1, int var2) {
		if (!this.method6162()) {
			this.field3606 = var1;
			this.field3607 = var2;
			return false;
		} else {
			if (var1 > this.field3599.method7281()) {
				var1 = this.field3599.method7281();
			}

			if (var2 > this.field3599.method7281()) {
				var2 = this.field3599.method7281();
			}

			boolean var3 = this.field3606 != var1 || var2 != this.field3607;
			this.field3606 = var1;
			if (var2 != this.field3607) {
				this.field3607 = var2;
				this.field3597 = 0;
				this.method6181();
			}

			if (var3 && this.field3611 != null) {
				this.field3611.vmethod6045();
			}

			return var3;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "67"
	)
	public void method6131(boolean var1) {
		class485 var2 = this.method6177(this.field3607);
		this.method6179((Integer)var2.field4966, var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-86"
	)
	public void method6132(boolean var1) {
		class485 var2 = this.method6177(this.field3607);
		this.method6179((Integer)var2.field4965, var1);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "103"
	)
	public void method6133(boolean var1) {
		this.method6179(0, var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1079000340"
	)
	public void method6134(boolean var1) {
		this.method6179(this.field3599.method7281(), var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1431814125"
	)
	public void method6304(boolean var1) {
		if (this.method6173() && !var1) {
			this.method6179(Math.min(this.field3606, this.field3607), var1);
		} else if (this.field3607 > 0) {
			this.method6179(this.field3607 - 1, var1);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1263469110"
	)
	public void method6136(boolean var1) {
		if (this.method6173() && !var1) {
			this.method6179(Math.max(this.field3606, this.field3607), var1);
		} else if (this.field3607 < this.field3599.method7281()) {
			this.method6179(this.field3607 + 1, var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-12006"
	)
	public void method6137(boolean var1) {
		if (this.field3607 > 0) {
			class485 var2 = this.method6176(this.field3607 - 1);
			this.method6179((Integer)var2.field4966, var1);
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1452508344"
	)
	public void method6138(boolean var1) {
		if (this.field3607 < this.field3599.method7281()) {
			class485 var2 = this.method6176(this.field3607 + 1);
			this.method6179((Integer)var2.field4965, var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1855815967"
	)
	public void method6139(boolean var1) {
		if (this.field3607 > 0) {
			this.method6179(this.field3599.method7299(this.field3607, -1), var1);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1322004372"
	)
	public void method6140(boolean var1) {
		if (this.field3607 < this.field3599.method7281()) {
			this.method6179(this.field3599.method7299(this.field3607, 1), var1);
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "6"
	)
	public void method6141(boolean var1) {
		if (this.field3607 > 0) {
			int var2 = this.method6180();
			this.method6179(this.field3599.method7299(this.field3607, -var2), var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-203552347"
	)
	public void method6127(boolean var1) {
		if (this.field3607 < this.field3599.method7281()) {
			int var2 = this.method6180();
			this.method6179(this.field3599.method7299(this.field3607, var2), var1);
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "2595"
	)
	public void method6280(boolean var1) {
		class398 var2 = this.field3599.method7290(0, this.field3607);
		class485 var3 = var2.method7553();
		this.method6179(this.field3599.method7327((Integer)var3.field4966, this.field3601), var1);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1036465571"
	)
	public void method6278(boolean var1) {
		class398 var2 = this.field3599.method7290(0, this.field3607);
		class485 var3 = var2.method7553();
		this.method6179(this.field3599.method7327((Integer)var3.field4966, this.field3613 + this.field3601), var1);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1002335608"
	)
	public void method6347(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class485 var6;
		int var8;
		if (!this.field3602) {
			var8 = 0;
		} else {
			var1 += this.field3614;
			var2 += this.field3601;
			var6 = this.method6185();
			var8 = this.field3599.method7327(var1 - (Integer)var6.field4966, var2 - (Integer)var6.field4965);
		}

		if (var3 && var4) {
			this.field3617 = 1;
			var6 = this.method6176(var8);
			class485 var7 = this.method6176(this.field3608);
			this.method6175(var7, var6);
		} else if (var3) {
			this.field3617 = 1;
			var6 = this.method6176(var8);
			this.method6130((Integer)var6.field4966, (Integer)var6.field4965);
			this.field3608 = (Integer)var6.field4966;
		} else if (var4) {
			this.method6130(this.field3608, var8);
		} else {
			if (this.field3609 > 0 && var8 == this.field3608) {
				if (this.field3607 == this.field3606) {
					this.field3617 = 1;
					var6 = this.method6176(var8);
					this.method6130((Integer)var6.field4966, (Integer)var6.field4965);
				} else {
					this.field3617 = 2;
					var6 = this.method6177(var8);
					this.method6130((Integer)var6.field4966, (Integer)var6.field4965);
				}
			} else {
				this.field3617 = 0;
				this.method6130(var8, var8);
				this.field3608 = var8;
			}

			this.field3609 = 25;
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-30"
	)
	public void method6190(int var1, int var2) {
		if (this.field3602 && this.method6157()) {
			var1 += this.field3614;
			var2 += this.field3601;
			class485 var3 = this.method6185();
			int var4 = this.field3599.method7327(var1 - (Integer)var3.field4966, var2 - (Integer)var3.field4965);
			class485 var5;
			class485 var6;
			switch(this.field3617) {
			case 0:
				this.method6130(this.field3606, var4);
				break;
			case 1:
				var5 = this.method6176(this.field3608);
				var6 = this.method6176(var4);
				this.method6175(var5, var6);
				break;
			case 2:
				var5 = this.method6177(this.field3608);
				var6 = this.method6177(var4);
				this.method6175(var5, var6);
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1723140286"
	)
	public void method6147(Clipboard var1) {
		class398 var2 = this.field3599.method7290(this.field3606, this.field3607);
		if (!var2.method7544()) {
			String var3 = var2.method7542();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "2111715206"
	)
	public void method6108(Clipboard var1) {
		if (this.method6173()) {
			this.method6147(var1);
			this.method6128();
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-992379728"
	)
	public void method6149(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6165((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6128();
				class395 var4 = this.field3599.method7292(var3, this.field3607, this.field3598);
				this.method6130(var4.method7419(), var4.method7419());
				this.method6178();
				this.method6183();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "127"
	)
	public void method6308() {
		this.field3601 = Math.max(0, this.field3601 - this.field3599.method7302());
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	public void method6151() {
		int var1 = Math.max(0, this.field3599.method7301() - this.field3613);
		this.field3601 = Math.min(var1, this.field3601 + this.field3599.method7302());
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmf;I)V",
		garbageValue = "1877137858"
	)
	public void method6152(class323 var1) {
		this.field3616 = var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lmf;I)V",
		garbageValue = "1739536664"
	)
	public void method6153(class323 var1) {
		this.field3611 = var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lpj;",
		garbageValue = "-2121359079"
	)
	public class394 method6230() {
		return this.field3599;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lpj;",
		garbageValue = "1026932642"
	)
	public class394 method6155() {
		return this.field3588;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "-927140025"
	)
	public class398 method6120() {
		return this.field3599.method7290(this.field3606, this.field3607);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "10263708"
	)
	public boolean method6157() {
		return this.field3612;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2120535737"
	)
	public boolean method6158() {
		return this.field3600;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean method6210() {
		return this.method6157() && this.field3597 % 60 < 30;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method6160() {
		return this.field3607;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "9"
	)
	public int method6161() {
		return this.field3606;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "73"
	)
	public boolean method6162() {
		return this.field3602;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1004374049"
	)
	public int method6163() {
		return this.field3614;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-737818988"
	)
	public int method6286() {
		return this.field3601;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "770052367"
	)
	public int method6326() {
		return this.field3599.method7403();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-339785891"
	)
	public int method6298() {
		return this.field3599.method7306();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-105"
	)
	public int method6362() {
		return this.field3615;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "10872"
	)
	public int method6168() {
		return this.field3603;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-333954295"
	)
	public int method6123() {
		return this.field3599.method7325();
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method6261() {
		return this.field3605;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2053175833"
	)
	public int method6114() {
		return this.field3599.method7308();
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-20"
	)
	public boolean method6243() {
		return this.method6298() > 1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-350056548"
	)
	boolean method6173() {
		return this.field3607 != this.field3606;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "83"
	)
	String method6165(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6172(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lss;Lss;B)V",
		garbageValue = "5"
	)
	void method6175(class485 var1, class485 var2) {
		if ((Integer)var2.field4966 < (Integer)var1.field4966) {
			this.method6130((Integer)var1.field4965, (Integer)var2.field4966);
		} else {
			this.method6130((Integer)var1.field4966, (Integer)var2.field4965);
		}

	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IB)Lss;",
		garbageValue = "-107"
	)
	class485 method6176(int var1) {
		int var2 = this.field3599.method7281();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6182(this.field3599.method7303(var5 - 1).field4476)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6182(this.field3599.method7303(var5).field4476)) {
				var4 = var5;
				break;
			}
		}

		return new class485(var3, var4);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)Lss;",
		garbageValue = "-982019338"
	)
	class485 method6177(int var1) {
		int var2 = this.field3599.method7281();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3599.method7303(var5 - 1).field4476 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3599.method7303(var5).field4476 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class485(var3, var4);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2078239234"
	)
	boolean method6178() {
		if (!this.method6162()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3599.method7281() > this.field3615) {
				this.field3599.method7297(this.field3615, this.field3599.method7281());
				var1 = true;
			}

			int var2 = this.method6298();
			int var3;
			if (this.field3599.method7341() > var2) {
				var3 = this.field3599.method7299(0, var2) - 1;
				this.field3599.method7297(var3, this.field3599.method7281());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3607;
				int var4 = this.field3606;
				int var5 = this.field3599.method7281();
				if (this.field3607 > var5) {
					var3 = var5;
				}

				if (this.field3606 > var5) {
					var4 = var5;
				}

				this.method6130(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1750876747"
	)
	void method6179(int var1, boolean var2) {
		if (var2) {
			this.method6130(this.field3606, var1);
		} else {
			this.method6130(var1, var1);
		}

	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	int method6180() {
		return this.field3613 / this.field3599.method7302();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-676768049"
	)
	void method6181() {
		class398 var1 = this.field3599.method7290(0, this.field3607);
		class485 var2 = var1.method7553();
		int var3 = this.field3599.method7302();
		int var4 = (Integer)var2.field4966 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field4965 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3614;
		int var9 = var8 + this.field3604;
		int var10 = this.field3601;
		int var11 = var10 + this.field3613;
		int var12 = this.field3614;
		int var13 = this.field3601;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3604;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3613;
		}

		this.method6115(var12, var13);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-369704395"
	)
	boolean method6182(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2067288907"
	)
	void method6183() {
		if (this.field3616 != null) {
			this.field3616.vmethod6045();
		}

	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-268502133"
	)
	boolean method6172(int var1) {
		switch(this.field3605) {
		case 1:
			return WorldMapLabel.isAlphaNumeric((char)var1);
		case 2:
			return class200.isCharAlphabetic((char)var1);
		case 3:
			return class330.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class330.isDigit(var2)) {
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

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)Lss;",
		garbageValue = "-1390264109"
	)
	class485 method6185() {
		int var1 = this.field3599.method7309(this.field3604);
		int var2 = this.field3599.method7310(this.field3613);
		return new class485(var1, var2);
	}
}
