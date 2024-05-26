import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("ak")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("al")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method250(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1423475742"
	)
	void method250(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "374540017"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "137471638"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-10056"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lad;",
		garbageValue = "412355004"
	)
	@Export("await")
	public final HttpResponse await() {
		if (this.hasError()) {
			return new HttpResponse(this.errorMessage);
		} else if (!this.hasFinished()) {
			return null;
		} else {
			try {
				return (HttpResponse)this.responseFuture.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method250(var2);
				return new HttpResponse(var2);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lij;",
		garbageValue = "32"
	)
	public static HitSplatDefinition method260(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1857648377"
	)
	@Export("updateToRememberedUsername")
	static void updateToRememberedUsername() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class459.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class459.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "635952730"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
