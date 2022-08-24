import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.InputStream;
import net.runelite.mapping.Implements;
import java.io.OutputStreamWriter;
import java.net.URLConnection;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("di")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("pa")
	@ObfuscatedGetter(intValue = -1947823007)
	static int field1374;

	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lnt;Lnt;I)I", garbageValue = "1935298638")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(B)Ljava/util/Date;", garbageValue = "-33")
	static Date method2563() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1360388184")
	static void method2558() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			ItemComposition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(ModeWhere.method6005("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);
				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
					if (var8 == -1) {
						var7.offset = 0;
						long var10 = var7.readLong();
						var1 = var10;
						break;
					}
					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				} 
			} catch (Exception var14) {
				var1 = 0L;
			}
			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = WorldMapSection0.method4852(var1, Login.Login_username);
			}
			switch (var0) {
				case 2 :
					ItemComposition.setLoginResponseString(Strings.field3894, Strings.field3687, Strings.field3762);
					class116.method2683(6);
					break;
				case 3 :
					ItemComposition.setLoginResponseString("", "Error connecting to server.", "");
					break;
				case 4 :
					ItemComposition.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
					break;
				case 5 :
					ItemComposition.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
					break;
				case 6 :
					ItemComposition.setLoginResponseString("", "Error connecting to server.", "");
					break;
				case 7 :
					ItemComposition.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(descriptor = "(Lkn;III)V", garbageValue = "-1583696044")
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}
		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
		}
	}
}