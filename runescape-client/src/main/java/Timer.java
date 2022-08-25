import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("mt")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("eo")
	@ObfuscatedSignature(descriptor = "Lln;")
	static Archive field4232;

	@ObfuscatedName("s")
	@ObfuscatedGetter(longValue = -8735945118853386879L)
	long field4228 = -1L;

	@ObfuscatedName("h")
	@ObfuscatedGetter(longValue = -6918330546120993273L)
	long field4229 = -1L;

	@ObfuscatedName("w")
	public boolean field4223 = false;

	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = -1503783176874321879L)
	long field4225 = 0L;

	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = -8793047518533873903L)
	long field4230 = 0L;

	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = -5274063944958508639L)
	long field4227 = 0L;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1005291763)
	int field4224 = 0;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1630081649)
	int field4226 = 0;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1043172727)
	int field4222 = 0;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -690606115)
	int field4231 = 0;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-312486675")
	public void method6457() {
		this.field4228 = class181.method3483();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1669178431")
	public void method6468() {
		if (-1L != this.field4228) {
			this.field4230 = class181.method3483() - this.field4228;
			this.field4228 = -1L;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "100")
	public void method6458(int var1) {
		this.field4229 = class181.method3483();
		this.field4224 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "3")
	public void method6459() {
		if (-1L != this.field4229) {
			this.field4225 = class181.method3483() - this.field4229;
			this.field4229 = -1L;
		}
		++this.field4222;
		this.field4223 = true;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2084155545")
	public void method6461() {
		this.field4223 = false;
		this.field4226 = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-494089145")
	public void method6478() {
		this.method6459();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "37914891")
	@Export("write")
	public void write(Buffer var1) {
		TextureProvider.method4269(var1, this.field4230);
		TextureProvider.method4269(var1, this.field4225);
		TextureProvider.method4269(var1, this.field4227);
		var1.writeShort(this.field4224);
		var1.writeShort(this.field4226);
		var1.writeShort(this.field4222);
		var1.writeShort(this.field4231);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(CLlv;B)C", garbageValue = "0")
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}
			if (var0 == 199) {
				return 'C';
			}
			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}
			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}
			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}
			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}
			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}
			if (var0 == 221) {
				return 'Y';
			}
			if (var0 == 223) {
				return 's';
			}
			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}
			if (var0 == 231) {
				return 'c';
			}
			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}
			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}
			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}
			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}
			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}
			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}
		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}
}