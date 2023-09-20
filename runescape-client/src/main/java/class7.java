import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class7 {
	@ObfuscatedName("ac")
	ExecutorService field25;
	@ObfuscatedName("al")
	Future field23;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	final Buffer field24;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class3 field22;

	@ObfuscatedSignature(
		descriptor = "(Lul;Lax;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field25 = Executors.newSingleThreadExecutor();
		this.field24 = var1;
		this.field22 = var2;
		this.method47();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public boolean method44() {
		return this.field23.isDone();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	public void method45() {
		this.field25.shutdown();
		this.field25 = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lul;",
		garbageValue = "1362565755"
	)
	public Buffer method46() {
		try {
			return (Buffer)this.field23.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-693034688"
	)
	void method47() {
		this.field23 = this.field25.submit(new class1(this, this.field24, this.field22));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-20434766"
	)
	static long method43() {
		try {
			URL var0 = new URL(ScriptEvent.method2315("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1063387188"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		CollisionMap.logOut();
		switch(var0) {
		case 1:
			GameEngine.method647(24);
			AbstractWorldMapIcon.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			class339.method6258();
		}

	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(I)Lpf;",
		garbageValue = "2097624965"
	)
	public static NodeDeque method58() {
		return Client.scriptEvents;
	}
}
