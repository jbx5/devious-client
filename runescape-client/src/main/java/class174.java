import java.io.UnsupportedEncodingException;
import java.lang.management.GarbageCollectorMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("gh")
public class class174 {
	@ObfuscatedName("bj")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	class183 field1855;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	class185 field1853;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1395176915
	)
	int field1858;
	@ObfuscatedName("aq")
	String field1861;
	@ObfuscatedName("ap")
	String field1859;
	@ObfuscatedName("ae")
	String field1860;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	UrlRequest field1854;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 75678425
	)
	int field1862;

	public class174() {
		this.field1858 = -1;
		this.field1862 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lhi;",
		garbageValue = "1689596364"
	)
	public class183 method3508() {
		return this.field1855;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Leb;S)Z",
		garbageValue = "21485"
	)
	public boolean method3509(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method3570();

				try {
					this.field1861 = var1;
					this.field1854 = var3.request(new URL(this.field1861));
					this.field1858 = 0;
				} catch (MalformedURLException var5) {
					this.method3570();
					this.field1858 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field1860 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1413062185"
	)
	public void method3510(String var1, String var2, String var3) {
		this.field1855 = MilliClock.method3646();
		this.field1859 = var1;
		this.field1855.method3689(this.field1859, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "-62"
	)
	public void method3511(UrlRequester var1) {
		switch(this.field1858) {
		case 0:
			this.method3522(var1);
			break;
		case 1:
			this.method3523();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-393449022"
	)
	public int method3512() {
		return this.field1858;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "141632414"
	)
	public int method3574(String var1) {
		return this.field1853.field1946.containsKey(var1) ? (Integer)this.field1853.field1946.get(var1) : -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-25"
	)
	public String method3557(String var1) {
		return (String)((String)(this.field1853.field1945.containsKey(var1) ? this.field1853.field1945.get(var1) : null));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "26"
	)
	public ArrayList method3515() {
		return this.field1853.field1940;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "716900641"
	)
	public ArrayList method3565() {
		return this.field1853.field1943;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1251051720"
	)
	public ArrayList method3517() {
		return this.field1853.field1939;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1609818918"
	)
	public String method3518() {
		return this.field1853.field1942;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "109"
	)
	public float[] method3561() {
		return this.field1853.field1941;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2078451603"
	)
	public String method3520() {
		return this.field1853.method3706();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	void method3570() {
		this.field1854 = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "1206058738"
	)
	void method3522(UrlRequester var1) {
		if (this.field1854 != null && this.field1854.isDone()) {
			byte[] var2 = this.field1854.getResponse();
			if (var2 == null) {
				this.method3570();
				this.field1858 = 4;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field1862 = var4.getInt("version");
					} catch (Exception var6) {
						this.method3570();
						this.field1858 = 6;
						return;
					}

					if (this.field1862 < 2) {
						if (!this.field1853.method3698(var4, this.field1862, var1)) {
							this.field1858 = 6;
						}
					} else if (this.field1862 == 2) {
						class187 var5 = ModeWhere.method7490();
						var5.method3738(var4, this.field1862, var1);
						this.field1853 = var5.method3748(this.field1860);
						if (this.field1853 != null) {
							this.method3523();
							this.field1858 = 1;
						} else {
							this.field1858 = 7;
						}
					}
				} catch (UnsupportedEncodingException var7) {
					this.method3570();
					this.field1858 = 6;
					return;
				}

				if (this.field1853 != null) {
					this.field1858 = this.field1853.field1940.size() > 0 ? 1 : 2;
				}

				this.field1854 = null;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1219928552"
	)
	void method3523() {
		Iterator var1 = this.field1853.field1940.iterator();

		class175 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1853.field1940.iterator();

				while (var1.hasNext()) {
					var2 = (class175)var1.next();
					if (var2.field1867 != null) {
						byte[] var3 = var2.field1867.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field1858 = 2;
							return;
						}
					}
				}

				this.method3570();
				this.field1858 = 5;
				return;
			}

			var2 = (class175)var1.next();
		} while(var2.field1867 == null || var2.field1867.isDone());

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leb;I)Z",
		garbageValue = "2134662579"
	)
	public boolean method3550(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field1862 = var3.getInt("version");
			} catch (Exception var5) {
				this.method3570();
				this.field1858 = 6;
				return false;
			}

			if (!this.field1853.method3698(var3, this.field1862, var2)) {
				this.field1858 = 6;
			}

			this.field1858 = this.field1853.field1940.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.field1858 = 6;
		}

		return this.field1858 < 3;
	}
}
