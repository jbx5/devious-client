import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("az")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("ah")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method261(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2142627404"
	)
	void method261(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "559620010"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-741032955"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "61"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Laa;",
		garbageValue = "644655777"
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
				this.method261(var2);
				return new HttpResponse(var2);
			}
		}
	}
}
