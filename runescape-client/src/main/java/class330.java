import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class330 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	class395 field3576;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	class395 field3594;
	@ObfuscatedName("ao")
	boolean field3583;
	@ObfuscatedName("ac")
	boolean field3584;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 793053853
	)
	int field3585;
	@ObfuscatedName("an")
	boolean field3598;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 728692293
	)
	int field3581;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -911762755
	)
	int field3588;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1484511711
	)
	int field3587;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -678929799
	)
	int field3590;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 415453075
	)
	int field3591;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1141785699
	)
	int field3592;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -738147983
	)
	int field3593;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1313664571
	)
	int field3574;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1099494877
	)
	int field3595;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1603379109
	)
	int field3596;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 984808681
	)
	int field3597;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1393718881
	)
	int field3589;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 654926663
	)
	int field3599;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	class324 field3600;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	class324 field3601;

	class330() {
		this.field3576 = new class395();
		this.field3594 = new class395();
		this.field3583 = false;
		this.field3584 = true;
		this.field3585 = 0;
		this.field3598 = false;
		this.field3581 = 0;
		this.field3588 = 0;
		this.field3587 = 0;
		this.field3590 = 0;
		this.field3591 = 0;
		this.field3592 = 0;
		this.field3593 = 0;
		this.field3574 = Integer.MAX_VALUE;
		this.field3595 = Integer.MAX_VALUE;
		this.field3596 = 0;
		this.field3597 = 0;
		this.field3589 = 0;
		this.field3599 = 0;
		this.field3576.method7322(1);
		this.field3594.method7322(1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-459181496"
	)
	void method6162() {
		this.field3585 = (this.field3585 + 1) % 60;
		if (this.field3593 > 0) {
			--this.field3593;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "7"
	)
	public boolean method6160(boolean var1) {
		var1 = var1 && this.field3584;
		boolean var2 = this.field3583 != var1;
		this.field3583 = var1;
		if (!this.field3583) {
			this.method6184(this.field3590, this.field3590);
		}

		return var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1718362437"
	)
	public void method6161(boolean var1) {
		this.field3584 = var1;
		this.field3583 = var1 && this.field3583;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-14"
	)
	boolean method6296(String var1) {
		String var2 = this.field3576.method7368();
		if (!var2.equals(var1)) {
			var1 = this.method6228(var1);
			this.field3576.method7329(var1);
			this.method6208(this.field3589, this.field3599);
			this.method6232();
			this.method6237();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "8373002"
	)
	boolean method6163(String var1) {
		this.field3594.method7329(var1);
		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)Z",
		garbageValue = "-1919649797"
	)
	boolean method6244(AbstractFont var1) {
		boolean var2 = !this.field3598;
		this.field3576.method7449(var1);
		this.field3594.method7449(var1);
		this.field3598 = true;
		var2 |= this.method6208(this.field3589, this.field3599);
		var2 |= this.method6184(this.field3591, this.field3590);
		if (this.method6232()) {
			this.method6237();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1432554130"
	)
	public boolean method6165(int var1, int var2) {
		boolean var3 = this.field3596 != var1 || var2 != this.field3597;
		this.field3596 = var1;
		this.field3597 = var2;
		var3 |= this.method6208(this.field3589, this.field3599);
		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-40"
	)
	public boolean method6331(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3576.method7340();
		this.field3576.method7384(var1);
		this.field3594.method7384(var1);
		if (this.method6232()) {
			this.method6237();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public boolean method6167(int var1) {
		this.field3576.method7319(var1);
		if (this.method6232()) {
			this.method6237();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "569863727"
	)
	public boolean method6168(int var1) {
		this.field3595 = var1;
		if (this.method6232()) {
			this.method6237();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "217776537"
	)
	public boolean method6208(int var1, int var2) {
		if (!this.method6216()) {
			this.field3589 = var1;
			this.field3599 = var2;
			return false;
		} else {
			int var3 = this.field3589;
			int var4 = this.field3599;
			int var5 = Math.max(0, this.field3576.method7335() - this.field3596 + 2);
			int var6 = Math.max(0, this.field3576.method7318() - this.field3597 + 1);
			this.field3589 = Math.max(0, Math.min(var5, var1));
			this.field3599 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3589 || var4 != this.field3599;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-1284"
	)
	public boolean method6170(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3576.method7323(var1, var2) : false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1785897338"
	)
	public void method6310(int var1) {
		this.field3576.method7317(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-39"
	)
	public void method6350(int var1) {
		this.field3581 = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "591098801"
	)
	public void method6173(int var1) {
		this.field3576.method7322(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1778164479"
	)
	public void method6277(int var1) {
		this.field3576.method7392(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2124230223"
	)
	public boolean method6175(int var1) {
		this.field3587 = var1;
		String var2 = this.field3576.method7368();
		int var3 = var2.length();
		var2 = this.method6228(var2);
		if (var2.length() != var3) {
			this.field3576.method7329(var2);
			this.method6208(this.field3589, this.field3599);
			this.method6232();
			this.method6237();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1676900457"
	)
	public void method6176() {
		this.field3598 = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2097619146"
	)
	public boolean method6422(int var1) {
		if (this.method6217(var1)) {
			this.method6182();
			class396 var2 = this.field3576.method7326((char)var1, this.field3590, this.field3574);
			this.method6184(var2.method7458(), var2.method7458());
			this.method6232();
			this.method6237();
		}

		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "639045291"
	)
	public void method6235() {
		if (!this.method6182() && this.field3590 > 0) {
			int var1 = this.field3576.method7437(this.field3590 - 1);
			this.method6237();
			this.method6184(var1, var1);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1560455499"
	)
	public void method6179() {
		if (!this.method6182() && this.field3590 < this.field3576.method7316()) {
			int var1 = this.field3576.method7437(this.field3590);
			this.method6237();
			this.method6184(var1, var1);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1632298723"
	)
	public void method6180() {
		if (!this.method6182() && this.field3590 > 0) {
			class486 var1 = this.method6177(this.field3590 - 1);
			int var2 = this.field3576.method7332((Integer)var1.field4964, this.field3590);
			this.method6237();
			this.method6184(var2, var2);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	public void method6181() {
		if (!this.method6182() && this.field3590 < this.field3576.method7316()) {
			class486 var1 = this.method6177(this.field3590);
			int var2 = this.field3576.method7332(this.field3590, (Integer)var1.field4962);
			this.method6237();
			this.method6184(var2, var2);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "809245355"
	)
	boolean method6182() {
		if (!this.method6166()) {
			return false;
		} else {
			int var1 = this.field3576.method7332(this.field3591, this.field3590);
			this.method6237();
			this.method6184(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-636827836"
	)
	public void method6234() {
		this.method6184(0, this.field3576.method7316());
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-47"
	)
	public boolean method6184(int var1, int var2) {
		if (!this.method6216()) {
			this.field3591 = var1;
			this.field3590 = var2;
			return false;
		} else {
			if (var1 > this.field3576.method7316()) {
				var1 = this.field3576.method7316();
			}

			if (var2 > this.field3576.method7316()) {
				var2 = this.field3576.method7316();
			}

			boolean var3 = this.field3591 != var1 || var2 != this.field3590;
			this.field3591 = var1;
			if (var2 != this.field3590) {
				this.field3590 = var2;
				this.field3585 = 0;
				this.method6395();
			}

			if (var3 && this.field3601 != null) {
				this.field3601.vmethod6102();
			}

			return var3;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "112"
	)
	public void method6321(boolean var1) {
		class486 var2 = this.method6174(this.field3590);
		this.method6233((Integer)var2.field4964, var1);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "647132311"
	)
	public void method6186(boolean var1) {
		class486 var2 = this.method6174(this.field3590);
		this.method6233((Integer)var2.field4962, var1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "26"
	)
	public void method6187(boolean var1) {
		this.method6233(0, var1);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "109"
	)
	public void method6317(boolean var1) {
		this.method6233(this.field3576.method7316(), var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "483744415"
	)
	public void method6189(boolean var1) {
		if (this.method6166() && !var1) {
			this.method6233(Math.min(this.field3591, this.field3590), var1);
		} else if (this.field3590 > 0) {
			this.method6233(this.field3590 - 1, var1);
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "424331931"
	)
	public void method6190(boolean var1) {
		if (this.method6166() && !var1) {
			this.method6233(Math.max(this.field3591, this.field3590), var1);
		} else if (this.field3590 < this.field3576.method7316()) {
			this.method6233(this.field3590 + 1, var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1838680706"
	)
	public void method6191(boolean var1) {
		if (this.field3590 > 0) {
			class486 var2 = this.method6177(this.field3590 - 1);
			this.method6233((Integer)var2.field4964, var1);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-127"
	)
	public void method6192(boolean var1) {
		if (this.field3590 < this.field3576.method7316()) {
			class486 var2 = this.method6177(this.field3590 + 1);
			this.method6233((Integer)var2.field4962, var1);
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-31746529"
	)
	public void method6358(boolean var1) {
		if (this.field3590 > 0) {
			this.method6233(this.field3576.method7334(this.field3590, -1), var1);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "593239666"
	)
	public void method6194(boolean var1) {
		if (this.field3590 < this.field3576.method7316()) {
			this.method6233(this.field3576.method7334(this.field3590, 1), var1);
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-35"
	)
	public void method6195(boolean var1) {
		if (this.field3590 > 0) {
			int var2 = this.method6330();
			this.method6233(this.field3576.method7334(this.field3590, -var2), var1);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "46"
	)
	public void method6158(boolean var1) {
		if (this.field3590 < this.field3576.method7316()) {
			int var2 = this.method6330();
			this.method6233(this.field3576.method7334(this.field3590, var2), var1);
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6353(boolean var1) {
		class399 var2 = this.field3576.method7422(0, this.field3590);
		class486 var3 = var2.method7588();
		this.method6233(this.field3576.method7333((Integer)var3.field4964, this.field3599), var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1784409030"
	)
	public void method6198(boolean var1) {
		class399 var2 = this.field3576.method7422(0, this.field3590);
		class486 var3 = var2.method7588();
		this.method6233(this.field3576.method7333((Integer)var3.field4964, this.field3599 + this.field3597), var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1784719026"
	)
	public void method6427(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class486 var6;
		int var8;
		if (!this.field3598) {
			var8 = 0;
		} else {
			var1 += this.field3589;
			var2 += this.field3599;
			var6 = this.method6238();
			var8 = this.field3576.method7333(var1 - (Integer)var6.field4964, var2 - (Integer)var6.field4962);
		}

		if (var3 && var4) {
			this.field3588 = 1;
			var6 = this.method6177(var8);
			class486 var7 = this.method6177(this.field3592);
			this.method6229(var7, var6);
		} else if (var3) {
			this.field3588 = 1;
			var6 = this.method6177(var8);
			this.method6184((Integer)var6.field4964, (Integer)var6.field4962);
			this.field3592 = (Integer)var6.field4964;
		} else if (var4) {
			this.method6184(this.field3592, var8);
		} else {
			if (this.field3593 > 0 && var8 == this.field3592) {
				if (this.field3590 == this.field3591) {
					this.field3588 = 1;
					var6 = this.method6177(var8);
					this.method6184((Integer)var6.field4964, (Integer)var6.field4962);
				} else {
					this.field3588 = 2;
					var6 = this.method6174(var8);
					this.method6184((Integer)var6.field4964, (Integer)var6.field4962);
				}
			} else {
				this.field3588 = 0;
				this.method6184(var8, var8);
				this.field3592 = var8;
			}

			this.field3593 = 25;
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1833413853"
	)
	public void method6200(int var1, int var2) {
		if (this.field3598 && this.method6211()) {
			var1 += this.field3589;
			var2 += this.field3599;
			class486 var3 = this.method6238();
			int var4 = this.field3576.method7333(var1 - (Integer)var3.field4964, var2 - (Integer)var3.field4962);
			class486 var5;
			class486 var6;
			switch(this.field3588) {
			case 0:
				this.method6184(this.field3591, var4);
				break;
			case 1:
				var5 = this.method6177(this.field3592);
				var6 = this.method6177(var4);
				this.method6229(var5, var6);
				break;
			case 2:
				var5 = this.method6174(this.field3592);
				var6 = this.method6174(var4);
				this.method6229(var5, var6);
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "47"
	)
	public void method6201(Clipboard var1) {
		class399 var2 = this.field3576.method7422(this.field3591, this.field3590);
		if (!var2.method7584()) {
			String var3 = var2.method7582();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "189356475"
	)
	public void method6202(Clipboard var1) {
		if (this.method6166()) {
			this.method6201(var1);
			this.method6182();
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "284807230"
	)
	public void method6203(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6228((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6182();
				class396 var4 = this.field3576.method7327(var3, this.field3590, this.field3574);
				this.method6184(var4.method7458(), var4.method7458());
				this.method6232();
				this.method6237();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-121"
	)
	public void method6230() {
		this.field3599 = Math.max(0, this.field3599 - this.field3576.method7351());
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	public void method6185() {
		int var1 = Math.max(0, this.field3576.method7318() - this.field3597);
		this.field3599 = Math.min(var1, this.field3599 + this.field3576.method7351());
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lmv;B)V",
		garbageValue = "26"
	)
	public void method6227(class324 var1) {
		this.field3600 = var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)V",
		garbageValue = "-2108435148"
	)
	public void method6207(class324 var1) {
		this.field3601 = var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lpt;",
		garbageValue = "-1669614004"
	)
	public class395 method6264() {
		return this.field3576;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Lpt;",
		garbageValue = "25"
	)
	public class395 method6415() {
		return this.field3594;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)Lpo;",
		garbageValue = "2"
	)
	public class399 method6210() {
		return this.field3576.method7422(this.field3591, this.field3590);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1934970333"
	)
	public boolean method6211() {
		return this.field3583;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1635187775"
	)
	public boolean method6212() {
		return this.field3584;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-3"
	)
	public boolean method6288() {
		return this.method6211() && this.field3585 % 60 < 30;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1735474606"
	)
	public int method6214() {
		return this.field3590;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-912146623"
	)
	public int method6215() {
		return this.field3591;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-72"
	)
	public boolean method6216() {
		return this.field3598;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1863338129"
	)
	public int method6316() {
		return this.field3589;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	public int method6218() {
		return this.field3599;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1605906220"
	)
	public int method6219() {
		return this.field3576.method7340();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1275690994"
	)
	public int method6220() {
		return this.field3576.method7341();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "27"
	)
	public int method6221() {
		return this.field3595;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2058718198"
	)
	public int method6204() {
		return this.field3581;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	public int method6223() {
		return this.field3576.method7380();
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "85673603"
	)
	public int method6311() {
		return this.field3587;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method6300() {
		return this.field3576.method7343();
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-26300"
	)
	public boolean method6226() {
		return this.method6220() > 1;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1024988634"
	)
	boolean method6166() {
		return this.field3590 != this.field3591;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "755561266"
	)
	String method6228(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6217(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lsf;Lsf;I)V",
		garbageValue = "1987987448"
	)
	void method6229(class486 var1, class486 var2) {
		if ((Integer)var2.field4964 < (Integer)var1.field4964) {
			this.method6184((Integer)var1.field4962, (Integer)var2.field4964);
		} else {
			this.method6184((Integer)var1.field4964, (Integer)var2.field4962);
		}

	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsf;",
		garbageValue = "42"
	)
	class486 method6177(int var1) {
		int var2 = this.field3576.method7316();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6292(this.field3576.method7312(var5 - 1).field4480)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6292(this.field3576.method7312(var5).field4480)) {
				var4 = var5;
				break;
			}
		}

		return new class486(var3, var4);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)Lsf;",
		garbageValue = "1047123828"
	)
	class486 method6174(int var1) {
		int var2 = this.field3576.method7316();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3576.method7312(var5 - 1).field4480 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3576.method7312(var5).field4480 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class486(var3, var4);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1532809681"
	)
	boolean method6232() {
		if (!this.method6216()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3576.method7316() > this.field3595) {
				this.field3576.method7332(this.field3595, this.field3576.method7316());
				var1 = true;
			}

			int var2 = this.method6220();
			int var3;
			if (this.field3576.method7338() > var2) {
				var3 = this.field3576.method7334(0, var2) - 1;
				this.field3576.method7332(var3, this.field3576.method7316());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3590;
				int var4 = this.field3591;
				int var5 = this.field3576.method7316();
				if (this.field3590 > var5) {
					var3 = var5;
				}

				if (this.field3591 > var5) {
					var4 = var5;
				}

				this.method6184(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1065241721"
	)
	void method6233(int var1, boolean var2) {
		if (var2) {
			this.method6184(this.field3591, var1);
		} else {
			this.method6184(var1, var1);
		}

	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1134475135"
	)
	int method6330() {
		return this.field3597 / this.field3576.method7351();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-886757584"
	)
	void method6395() {
		class399 var1 = this.field3576.method7422(0, this.field3590);
		class486 var2 = var1.method7588();
		int var3 = this.field3576.method7351();
		int var4 = (Integer)var2.field4964 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field4962 - 3;
		int var7 = var3 + var6 + 6;
		int var8 = this.field3589;
		int var9 = var8 + this.field3596;
		int var10 = this.field3599;
		int var11 = var10 + this.field3597;
		int var12 = this.field3589;
		int var13 = this.field3599;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3596;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3597;
		}

		this.method6208(var12, var13);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2093013908"
	)
	boolean method6292(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "203184236"
	)
	void method6237() {
		if (this.field3600 != null) {
			this.field3600.vmethod6102();
		}

	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "98"
	)
	boolean method6217(int var1) {
		switch(this.field3587) {
		case 1:
			return class126.isAlphaNumeric((char)var1);
		case 2:
			return Canvas.isCharAlphabetic((char)var1);
		case 3:
			return class164.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class164.isDigit(var2)) {
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
		descriptor = "(B)Lsf;",
		garbageValue = "0"
	)
	class486 method6238() {
		int var1 = this.field3576.method7344(this.field3596);
		int var2 = this.field3576.method7345(this.field3597);
		return new class486(var1, var2);
	}

	@ObfuscatedName("ar")
	static int method6436(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}
}
