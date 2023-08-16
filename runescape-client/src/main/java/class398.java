import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public class class398 {
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 1494034165
	)
	static int field4505;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class394 field4502;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 751881255
	)
	int field4503;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1020129413
	)
	int field4504;

	@ObfuscatedSignature(
		descriptor = "(Lpj;II)V"
	)
	class398(class394 var1, int var2, int var3) {
		this.field4503 = 0;
		this.field4504 = 0;
		this.field4502 = var1;
		this.field4503 = var2;
		this.field4504 = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String method7542() {
		if (this.method7544()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7545());

			for (int var2 = this.field4503; var2 < this.field4504; ++var2) {
				class396 var3 = this.field4502.method7303(var2);
				var1.append(var3.field4476);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method7555(int var1) {
		return this.field4502.method7308() == 2 || this.field4502.method7308() == 1 && (!this.field4502.field4466 || this.field4504 - 1 != var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "181871891"
	)
	public boolean method7544() {
		return this.field4503 == this.field4504;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1557600445"
	)
	public int method7545() {
		return this.field4504 - this.field4503;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpz;I)Z",
		garbageValue = "-663348628"
	)
	boolean method7546(class396 var1) {
		if (this.field4502.field4468 == 2) {
			return true;
		} else if (this.field4502.field4468 == 0) {
			return false;
		} else {
			return this.field4502.method7276() != var1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-808768391"
	)
	int method7550() {
		if (this.method7544()) {
			return 0;
		} else {
			class396 var1 = this.field4502.method7303(this.field4504 - 1);
			if (var1.field4476 == '\n') {
				return 0;
			} else if (this.method7546(var1)) {
				return this.field4502.field4465.advances[42];
			} else {
				int var2 = this.field4502.field4465.advances[var1.field4476];
				if (var2 == 0) {
					return var1.field4476 == '\t' ? this.field4502.field4465.advances[32] * 3 : this.field4502.field4465.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lss;",
		garbageValue = "-873357566"
	)
	public class485 method7553() {
		if (this.method7544()) {
			return new class485(0, 0);
		} else {
			class396 var1 = this.field4502.method7303(this.field4504 - 1);
			return new class485(var1.field4475 + this.method7550(), var1.field4478);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "602399469"
	)
	public class396 method7549(int var1) {
		return var1 >= 0 && var1 < this.method7545() ? this.field4502.method7303(this.field4503 + var1) : null;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-46"
	)
	static boolean method7558(int var0) {
		for (int var1 = 0; var1 < Client.field766; ++var1) {
			if (Client.field768[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
