import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("gh")
public class class171 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	class180 field1843;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	class182 field1845;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1500730581
	)
	int field1849;
	@ObfuscatedName("ai")
	String field1850;
	@ObfuscatedName("ax")
	String field1851;
	@ObfuscatedName("ar")
	String field1852;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	UrlRequest field1853;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1495997613
	)
	int field1847;

	public class171() {
		this.field1849 = -1;
		this.field1847 = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lgp;",
		garbageValue = "-24"
	)
	public class180 method3440() {
		return this.field1843;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lea;B)Z",
		garbageValue = "-3"
	)
	public boolean method3441(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method3453();

				try {
					this.field1850 = var1;
					this.field1853 = var3.request(new URL(this.field1850));
					this.field1849 = 0;
				} catch (MalformedURLException var5) {
					this.method3453();
					this.field1849 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field1852 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "39"
	)
	public void method3442(String var1, String var2, String var3) {
		this.field1843 = AttackOption.method2678();
		this.field1851 = var1;
		this.field1843.method3582(this.field1851, var2, var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "712461185"
	)
	public void method3481(UrlRequester var1) {
		switch(this.field1849) {
		case 0:
			this.method3451(var1);
			break;
		case 1:
			this.method3489();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-763487788"
	)
	public int method3444() {
		return this.field1849;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-494265876"
	)
	public int method3455(String var1) {
		return this.field1845.field1935.containsKey(var1) ? (Integer)this.field1845.field1935.get(var1) : -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1108927544"
	)
	public String method3446(String var1) {
		return (String)((String)(this.field1845.field1936.containsKey(var1) ? this.field1845.field1936.get(var1) : null));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1380340116"
	)
	public ArrayList method3490() {
		return this.field1845.field1931;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1925848784"
	)
	public ArrayList method3448() {
		return this.field1845.field1930;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "9"
	)
	public ArrayList method3449() {
		return this.field1845.field1934;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1516677521"
	)
	public String method3450() {
		return this.field1845.field1932;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "102"
	)
	public float[] method3484() {
		return this.field1845.field1927;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1941310009"
	)
	public String method3452() {
		return this.field1845.method3597();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	void method3453() {
		this.field1853 = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lea;B)V",
		garbageValue = "80"
	)
	void method3451(UrlRequester var1) {
		if (this.field1853 != null && this.field1853.isDone()) {
			byte[] var2 = this.field1853.getResponse();
			if (var2 == null) {
				this.method3453();
				this.field1849 = 4;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field1847 = var4.getInt("version");
					} catch (Exception var6) {
						this.method3453();
						this.field1849 = 6;
						return;
					}

					if (this.field1847 < 2) {
						if (!this.field1845.method3632(var4, this.field1847, var1)) {
							this.field1849 = 6;
						}
					} else if (this.field1847 == 2) {
						class184 var5 = class392.method7180();
						var5.method3642(var4, this.field1847, var1);
						this.field1845 = var5.method3645(this.field1852);
						if (this.field1845 != null) {
							this.method3489();
							this.field1849 = 1;
						} else {
							this.field1849 = 7;
						}
					}
				} catch (UnsupportedEncodingException var7) {
					this.method3453();
					this.field1849 = 6;
					return;
				}

				if (this.field1845 != null) {
					this.field1849 = this.field1845.field1931.size() > 0 ? 1 : 2;
				}

				this.field1853 = null;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	void method3489() {
		Iterator var1 = this.field1845.field1931.iterator();

		class172 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1845.field1931.iterator();

				while (var1.hasNext()) {
					var2 = (class172)var1.next();
					if (var2.field1859 != null) {
						byte[] var3 = var2.field1859.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field1849 = 2;
							return;
						}
					}
				}

				this.method3453();
				this.field1849 = 5;
				return;
			}

			var2 = (class172)var1.next();
		} while(var2.field1859 == null || var2.field1859.isDone());

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;I)Z",
		garbageValue = "-910615631"
	)
	public boolean method3459(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field1847 = var3.getInt("version");
			} catch (Exception var5) {
				this.method3453();
				this.field1849 = 6;
				return false;
			}

			if (!this.field1845.method3632(var3, this.field1847, var2)) {
				this.field1849 = 6;
			}

			this.field1849 = this.field1845.field1931.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.field1849 = 6;
		}

		return this.field1849 < 3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lmh;",
		garbageValue = "-657098350"
	)
	public static PacketBufferNode method3447() {
		PacketBufferNode var0 = WorldMapSection0.method5639();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	static final int method3467() {
		float var0 = 200.0F * ((float)NPC.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
