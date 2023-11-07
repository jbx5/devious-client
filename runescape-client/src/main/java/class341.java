import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class341 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class406 field3620;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class406 field3619;
	@ObfuscatedName("ai")
	boolean field3628;
	@ObfuscatedName("aw")
	boolean field3621;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 851630373
	)
	int field3618;
	@ObfuscatedName("an")
	boolean field3623;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1942411497
	)
	int field3624;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1687939343
	)
	int field3625;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1973395103
	)
	int field3626;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1057586769
	)
	int field3638;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 2069229323
	)
	int field3614;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -992449321
	)
	int field3615;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 256491843
	)
	int field3630;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1326953207
	)
	int field3631;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 461569489
	)
	int field3632;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 498690491
	)
	int field3633;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1961242281
	)
	int field3627;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -921124497
	)
	int field3635;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -609564537
	)
	int field3639;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	class334 field3637;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	class334 field3636;

	class341() {
		this.field3620 = new class406();
		this.field3619 = new class406();
		this.field3628 = false;
		this.field3621 = true;
		this.field3618 = 0;
		this.field3623 = false;
		this.field3624 = 0;
		this.field3625 = 0;
		this.field3626 = 0;
		this.field3638 = 0;
		this.field3614 = 0;
		this.field3615 = 0;
		this.field3630 = 0;
		this.field3631 = Integer.MAX_VALUE;
		this.field3632 = Integer.MAX_VALUE;
		this.field3633 = 0;
		this.field3627 = 0;
		this.field3635 = 0;
		this.field3639 = 0;
		this.field3620.method7625(1);
		this.field3619.method7625(1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6360() {
		this.field3618 = (this.field3618 + 1) % 60;
		if (this.field3630 > 0) {
			--this.field3630;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1199149744"
	)
	public boolean method6361(boolean var1) {
		var1 = var1 && this.field3621;
		boolean var2 = this.field3628 != var1;
		this.field3628 = var1;
		if (!this.field3628) {
			this.method6385(this.field3638, this.field3638);
		}

		return var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "18331512"
	)
	public void method6614(boolean var1) {
		this.field3621 = var1;
		this.field3628 = var1 && this.field3628;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "1"
	)
	public boolean method6363(String var1) {
		String var2 = this.field3620.method7523();
		if (!var2.equals(var1)) {
			var1 = this.method6429(var1);
			this.field3620.method7535(var1);
			this.method6385(this.field3614, this.field3638);
			this.method6370(this.field3635, this.field3639);
			this.method6451();
			this.method6574();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-65"
	)
	boolean method6364(String var1) {
		this.field3619.method7535(var1);
		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpa;B)Z",
		garbageValue = "116"
	)
	boolean method6431(AbstractFont var1) {
		boolean var2 = !this.field3623;
		this.field3620.method7527(var1);
		this.field3619.method7527(var1);
		this.field3623 = true;
		var2 |= this.method6370(this.field3635, this.field3639);
		var2 |= this.method6385(this.field3614, this.field3638);
		if (this.method6451()) {
			this.method6574();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "101"
	)
	public boolean method6366(int var1, int var2) {
		boolean var3 = this.field3633 != var1 || var2 != this.field3627;
		this.field3633 = var1;
		this.field3627 = var2;
		var3 |= this.method6370(this.field3635, this.field3639);
		return var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-229674282"
	)
	public boolean method6367(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3620.method7546();
		this.field3620.method7524(var1);
		this.field3619.method7524(var1);
		if (this.method6451()) {
			this.method6574();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "8"
	)
	public boolean method6553(int var1) {
		this.field3620.method7525(var1);
		if (this.method6451()) {
			this.method6574();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "117249639"
	)
	public boolean method6369(int var1) {
		this.field3632 = var1;
		if (this.method6451()) {
			this.method6574();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-285626466"
	)
	public boolean method6370(int var1, int var2) {
		if (!this.method6394()) {
			this.field3635 = var1;
			this.field3639 = var2;
			return false;
		} else {
			int var3 = this.field3635;
			int var4 = this.field3639;
			int var5 = Math.max(0, this.field3620.method7653() - this.field3633 + 2);
			int var6 = Math.max(0, this.field3620.method7618() - this.field3627 + 1);
			this.field3635 = Math.max(0, Math.min(var5, var1));
			this.field3639 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3635 || var4 != this.field3639;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "18"
	)
	public boolean method6371(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3620.method7529(var1, var2) : false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-56"
	)
	public void method6372(int var1) {
		this.field3620.method7530(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	public void method6373(int var1) {
		this.field3624 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "312320630"
	)
	public void method6413(int var1) {
		this.field3620.method7625(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1049067680"
	)
	public void method6375(int var1) {
		this.field3620.method7526(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1504264243"
	)
	public boolean method6376(int var1) {
		this.field3626 = var1;
		String var2 = this.field3620.method7523();
		int var3 = var2.length();
		var2 = this.method6429(var2);
		if (var2.length() != var3) {
			this.field3620.method7535(var2);
			this.method6370(this.field3635, this.field3639);
			this.method6451();
			this.method6574();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "611320825"
	)
	public void method6386() {
		this.field3623 = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1918004716"
	)
	public boolean method6378(int var1) {
		if (this.method6439(var1)) {
			this.method6461();
			class407 var2 = this.field3620.method7631((char)var1, this.field3638, this.field3631);
			this.method6385(var2.method7655(), var2.method7655());
			this.method6451();
			this.method6574();
		}

		return true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "125"
	)
	public void method6368() {
		if (!this.method6461() && this.field3638 > 0) {
			int var1 = this.field3620.method7569(this.field3638 - 1);
			this.method6574();
			this.method6385(var1, var1);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1496895197"
	)
	public void method6380() {
		if (!this.method6461() && this.field3638 < this.field3620.method7522()) {
			int var1 = this.field3620.method7569(this.field3638);
			this.method6574();
			this.method6385(var1, var1);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method6428() {
		if (!this.method6461() && this.field3638 > 0) {
			class497 var1 = this.method6478(this.field3638 - 1);
			int var2 = this.field3620.method7538((Integer)var1.field4996, this.field3638);
			this.method6574();
			this.method6385(var2, var2);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "576864564"
	)
	public void method6382() {
		if (!this.method6461() && this.field3638 < this.field3620.method7522()) {
			class497 var1 = this.method6478(this.field3638);
			int var2 = this.field3620.method7538(this.field3638, (Integer)var1.field4997);
			this.method6574();
			this.method6385(var2, var2);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1514418987"
	)
	boolean method6461() {
		if (!this.method6362()) {
			return false;
		} else {
			int var1 = this.field3620.method7538(this.field3614, this.field3638);
			this.method6574();
			this.method6385(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "154519165"
	)
	public void method6434() {
		this.method6385(0, this.field3620.method7522());
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1917418195"
	)
	public boolean method6385(int var1, int var2) {
		if (!this.method6394()) {
			this.field3614 = var1;
			this.field3638 = var2;
			return false;
		} else {
			if (var1 > this.field3620.method7522()) {
				var1 = this.field3620.method7522();
			}

			if (var2 > this.field3620.method7522()) {
				var2 = this.field3620.method7522();
			}

			boolean var3 = this.field3614 != var1 || var2 != this.field3638;
			this.field3614 = var1;
			if (var2 != this.field3638) {
				this.field3638 = var2;
				this.field3618 = 0;
				this.method6436();
			}

			if (var3 && this.field3636 != null) {
				this.field3636.vmethod6278();
			}

			return var3;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "64"
	)
	public void method6440(boolean var1) {
		class497 var2 = this.method6459(this.field3638);
		this.method6505((Integer)var2.field4996, var1);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-114"
	)
	public void method6387(boolean var1) {
		class497 var2 = this.method6459(this.field3638);
		this.method6505((Integer)var2.field4997, var1);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "941946265"
	)
	public void method6565(boolean var1) {
		this.method6505(0, var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2021236230"
	)
	public void method6389(boolean var1) {
		this.method6505(this.field3620.method7522(), var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1171552759"
	)
	public void method6390(boolean var1) {
		if (this.method6362() && !var1) {
			this.method6505(Math.min(this.field3614, this.field3638), var1);
		} else if (this.field3638 > 0) {
			this.method6505(this.field3638 - 1, var1);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-81"
	)
	public void method6391(boolean var1) {
		if (this.method6362() && !var1) {
			this.method6505(Math.max(this.field3614, this.field3638), var1);
		} else if (this.field3638 < this.field3620.method7522()) {
			this.method6505(this.field3638 + 1, var1);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1880064758"
	)
	public void method6392(boolean var1) {
		if (this.field3638 > 0) {
			class497 var2 = this.method6478(this.field3638 - 1);
			this.method6505((Integer)var2.field4996, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-214351650"
	)
	public void method6393(boolean var1) {
		if (this.field3638 < this.field3620.method7522()) {
			class497 var2 = this.method6478(this.field3638 + 1);
			this.method6505((Integer)var2.field4997, var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2098854575"
	)
	public void method6602(boolean var1) {
		if (this.field3638 > 0) {
			this.method6505(this.field3620.method7540(this.field3638, -1), var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "115"
	)
	public void method6395(boolean var1) {
		if (this.field3638 < this.field3620.method7522()) {
			this.method6505(this.field3620.method7540(this.field3638, 1), var1);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1022985895"
	)
	public void method6396(boolean var1) {
		if (this.field3638 > 0) {
			int var2 = this.method6576();
			this.method6505(this.field3620.method7540(this.field3638, -var2), var1);
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-828148265"
	)
	public void method6397(boolean var1) {
		if (this.field3638 < this.field3620.method7522()) {
			int var2 = this.method6576();
			this.method6505(this.field3620.method7540(this.field3638, var2), var1);
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-618248059"
	)
	public void method6596(boolean var1) {
		class410 var2 = this.field3620.method7531(0, this.field3638);
		class497 var3 = var2.method7793();
		this.method6505(this.field3620.method7539((Integer)var3.field4996, this.field3639), var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-993585503"
	)
	public void method6506(boolean var1) {
		class410 var2 = this.field3620.method7531(0, this.field3638);
		class497 var3 = var2.method7793();
		this.method6505(this.field3620.method7539((Integer)var3.field4996, this.field3627 + this.field3639), var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "470461038"
	)
	public void method6400(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class497 var6;
		int var8;
		if (!this.field3623) {
			var8 = 0;
		} else {
			var1 += this.field3635;
			var2 += this.field3639;
			var6 = this.method6541();
			var8 = this.field3620.method7539(var1 - (Integer)var6.field4996, var2 - (Integer)var6.field4997);
		}

		if (var3 && var4) {
			this.field3625 = 1;
			var6 = this.method6478(var8);
			class497 var7 = this.method6478(this.field3615);
			this.method6430(var7, var6);
		} else if (var3) {
			this.field3625 = 1;
			var6 = this.method6478(var8);
			this.method6385((Integer)var6.field4996, (Integer)var6.field4997);
			this.field3615 = (Integer)var6.field4996;
		} else if (var4) {
			this.method6385(this.field3615, var8);
		} else {
			if (this.field3630 > 0 && var8 == this.field3615) {
				if (this.field3614 == this.field3638) {
					this.field3625 = 1;
					var6 = this.method6478(var8);
					this.method6385((Integer)var6.field4996, (Integer)var6.field4997);
				} else {
					this.field3625 = 2;
					var6 = this.method6459(var8);
					this.method6385((Integer)var6.field4996, (Integer)var6.field4997);
				}
			} else {
				this.field3625 = 0;
				this.method6385(var8, var8);
				this.field3615 = var8;
			}

			this.field3630 = 25;
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-292946076"
	)
	public void method6401(int var1, int var2) {
		if (this.field3623 && this.method6640()) {
			var1 += this.field3635;
			var2 += this.field3639;
			class497 var3 = this.method6541();
			int var4 = this.field3620.method7539(var1 - (Integer)var3.field4996, var2 - (Integer)var3.field4997);
			class497 var5;
			class497 var6;
			switch(this.field3625) {
			case 0:
				this.method6385(this.field3614, var4);
				break;
			case 1:
				var5 = this.method6478(this.field3615);
				var6 = this.method6478(var4);
				this.method6430(var5, var6);
				break;
			case 2:
				var5 = this.method6459(this.field3615);
				var6 = this.method6459(var4);
				this.method6430(var5, var6);
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-307910360"
	)
	public void method6402(Clipboard var1) {
		class410 var2 = this.field3620.method7531(this.field3614, this.field3638);
		if (!var2.method7777()) {
			String var3 = var2.method7775();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "2135903606"
	)
	public void method6403(Clipboard var1) {
		if (this.method6362()) {
			this.method6402(var1);
			this.method6461();
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1435827067"
	)
	public void method6546(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method6429((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method6461();
				class407 var4 = this.field3620.method7533(var3, this.field3638, this.field3631);
				this.method6385(var4.method7655(), var4.method7655());
				this.method6451();
				this.method6574();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-288828294"
	)
	public void method6405() {
		this.field3639 = Math.max(0, this.field3639 - this.field3620.method7614());
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	public void method6406() {
		int var1 = Math.max(0, this.field3620.method7618() - this.field3627);
		this.field3639 = Math.min(var1, this.field3639 + this.field3620.method7614());
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmc;I)V",
		garbageValue = "-1869847655"
	)
	public void method6407(class334 var1) {
		this.field3637 = var1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lmc;I)V",
		garbageValue = "-1051047872"
	)
	public void method6441(class334 var1) {
		this.field3636 = var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "2075539041"
	)
	public class406 method6616() {
		return this.field3620;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "1030146297"
	)
	public class406 method6644() {
		return this.field3619;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Lpd;",
		garbageValue = "126"
	)
	public class410 method6609() {
		return this.field3620.method7531(this.field3614, this.field3638);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2065405253"
	)
	public boolean method6640() {
		return this.field3628;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	public boolean method6409() {
		return this.field3621;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method6414() {
		return this.method6640() && this.field3618 % 60 < 30;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method6415() {
		return this.field3638;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-93"
	)
	public int method6416() {
		return this.field3614;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1339355429"
	)
	public boolean method6394() {
		return this.field3623;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-914270657"
	)
	public int method6418() {
		return this.field3635;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-59337247"
	)
	public int method6419() {
		return this.field3639;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "183448923"
	)
	public int method6420() {
		return this.field3620.method7546();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1901590514"
	)
	public int method6628() {
		return this.field3620.method7547();
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "433958524"
	)
	public int method6630() {
		return this.field3632;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "27"
	)
	public int method6423() {
		return this.field3624;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1220088206"
	)
	public int method6424() {
		return this.field3620.method7548();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public int method6425() {
		return this.field3626;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1771864931"
	)
	public int method6550() {
		return this.field3620.method7549();
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	public boolean method6426() {
		return this.method6628() > 1;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-760216869"
	)
	boolean method6362() {
		return this.field3638 != this.field3614;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-79"
	)
	String method6429(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method6439(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lti;Lti;I)V",
		garbageValue = "-1148711859"
	)
	void method6430(class497 var1, class497 var2) {
		if ((Integer)var2.field4996 < (Integer)var1.field4996) {
			this.method6385((Integer)var1.field4997, (Integer)var2.field4996);
		} else {
			this.method6385((Integer)var1.field4996, (Integer)var2.field4997);
		}

	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)Lti;",
		garbageValue = "377951962"
	)
	class497 method6478(int var1) {
		int var2 = this.field3620.method7522();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method6437(this.field3620.method7552(var5 - 1).field4509)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method6437(this.field3620.method7552(var5).field4509)) {
				var4 = var5;
				break;
			}
		}

		return new class497(var3, var4);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Lti;",
		garbageValue = "-1182045499"
	)
	class497 method6459(int var1) {
		int var2 = this.field3620.method7522();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3620.method7552(var5 - 1).field4509 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3620.method7552(var5).field4509 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class497(var3, var4);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1603465990"
	)
	boolean method6451() {
		if (!this.method6394()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3620.method7522() > this.field3632) {
				this.field3620.method7538(this.field3632, this.field3620.method7522());
				var1 = true;
			}

			int var2 = this.method6628();
			int var3;
			if (this.field3620.method7544() > var2) {
				var3 = this.field3620.method7540(0, var2) - 1;
				this.field3620.method7538(var3, this.field3620.method7522());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3638;
				int var4 = this.field3614;
				int var5 = this.field3620.method7522();
				if (this.field3638 > var5) {
					var3 = var5;
				}

				if (this.field3614 > var5) {
					var4 = var5;
				}

				this.method6385(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "2086601547"
	)
	void method6505(int var1, boolean var2) {
		if (var2) {
			this.method6385(this.field3614, var1);
		} else {
			this.method6385(var1, var1);
		}

	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	int method6576() {
		return this.field3627 / this.field3620.method7614();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1786950999"
	)
	void method6436() {
		class410 var1 = this.field3620.method7531(0, this.field3638);
		class497 var2 = var1.method7793();
		int var3 = this.field3620.method7614();
		int var4 = (Integer)var2.field4996 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field4997 - 3;
		int var7 = var3 + var6 + 6;
		int var8 = this.field3635;
		int var9 = var8 + this.field3633;
		int var10 = this.field3639;
		int var11 = var10 + this.field3627;
		int var12 = this.field3635;
		int var13 = this.field3639;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3633;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3627;
		}

		this.method6370(var12, var13);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	boolean method6437(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "336"
	)
	void method6574() {
		if (this.field3637 != null) {
			this.field3637.vmethod6278();
		}

	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1431244165"
	)
	boolean method6439(int var1) {
		switch(this.field3626) {
		case 1:
			return KeyHandler.isAlphaNumeric((char)var1);
		case 2:
			return class10.isCharAlphabetic((char)var1);
		case 3:
			return Player.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (Player.isDigit(var2)) {
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

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(I)Lti;",
		garbageValue = "-306061048"
	)
	class497 method6541() {
		int var1 = this.field3620.method7560(this.field3633);
		int var2 = this.field3620.method7551(this.field3627);
		return new class497(var1, var2);
	}
}
