import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class291 {
	@ObfuscatedName("et")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lcw;")

	UrlRequest field3295;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lqi;")

	SpritePixels field3293;

	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Lck;)V")

	class291(String var1, UrlRequester var2) {
		try {
			this.field3295 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3295 = null;
		}

	}

	@ObfuscatedSignature(descriptor = 
	"(Lcw;)V")

	class291(UrlRequest var1) {
		this.field3295 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Lqi;", garbageValue = 
	"-159877432")

	SpritePixels method5563() {
		if (((this.field3293 == null) && (this.field3295 != null)) && this.field3295.isDone()) {
			if (this.field3295.getResponse() != null) {
				this.field3293 = Interpreter.method1889(this.field3295.getResponse());
			}

			this.field3295 = null;
		}

		return this.field3293;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(CLlo;B)C", garbageValue = 
	"20")

	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if ((var0 >= 192) && (var0 <= 255)) {
			if ((var0 >= 192) && (var0 <= 198)) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if ((var0 >= 200) && (var0 <= 203)) {
				return 'E';
			}

			if ((var0 >= 204) && (var0 <= 207)) {
				return 'I';
			}

			if ((var0 == 209) && (var1 != Language.Language_ES)) {
				return 'N';
			}

			if ((var0 >= 210) && (var0 <= 214)) {
				return 'O';
			}

			if ((var0 >= 217) && (var0 <= 220)) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if ((var0 >= 224) && (var0 <= 230)) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if ((var0 >= 232) && (var0 <= 235)) {
				return 'e';
			}

			if ((var0 >= 236) && (var0 <= 239)) {
				return 'i';
			}

			if ((var0 == 241) && (var1 != Language.Language_ES)) {
				return 'n';
			}

			if ((var0 >= 242) && (var0 <= 246)) {
				return 'o';
			}

			if ((var0 >= 249) && (var0 <= 252)) {
				return 'u';
			}

			if ((var0 == 253) || (var0 == 255)) {
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IIS)Lbe;", garbageValue = 
	"-15672")

	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
		return var2.getMessage(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lqe;", garbageValue = 
	"-868128197")

	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{ FillMode.field4694, FillMode.field4695, FillMode.SOLID };
	}
}