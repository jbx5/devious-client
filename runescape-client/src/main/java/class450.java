import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
public final class class450 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lrj;"
	)
	static class450[] field4734;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 283410239
	)
	static int field4738;
	@ObfuscatedName("am")
	float field4736;
	@ObfuscatedName("as")
	float field4733;
	@ObfuscatedName("aj")
	float field4737;
	@ObfuscatedName("ag")
	float field4735;

	static {
		field4734 = new class450[0];
		WorldMapRenderer.method5354(100);
		new class450();
	}

	class450() {
		this.method8223();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "720031596"
	)
	public void method8224() {
		synchronized(field4734) {
			if (class344.field3852 < field4738 - 1) {
				field4734[++class344.field3852 - 1] = this;
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "646629181"
	)
	void method8221(float var1, float var2, float var3, float var4) {
		this.field4736 = var1;
		this.field4733 = var2;
		this.field4737 = var3;
		this.field4735 = var4;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-806476274"
	)
	public void method8222(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F));
		float var6 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4736 = var5 * var1;
		this.field4733 = var2 * var5;
		this.field4737 = var3 * var5;
		this.field4735 = var6;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "407146638"
	)
	final void method8223() {
		this.field4737 = 0.0F;
		this.field4733 = 0.0F;
		this.field4736 = 0.0F;
		this.field4735 = 1.0F;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrj;S)V",
		garbageValue = "-7868"
	)
	public final void method8228(class450 var1) {
		this.method8221(this.field4736 * var1.field4735 + this.field4735 * var1.field4736 + var1.field4733 * this.field4737 - this.field4733 * var1.field4737, this.field4735 * var1.field4733 + (var1.field4735 * this.field4733 - var1.field4736 * this.field4737) + this.field4736 * var1.field4737, var1.field4736 * this.field4733 + this.field4737 * var1.field4735 - var1.field4733 * this.field4736 + var1.field4737 * this.field4735, var1.field4735 * this.field4735 - this.field4736 * var1.field4736 - this.field4733 * var1.field4733 - this.field4737 * var1.field4737);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class450)) {
			return false;
		} else {
			class450 var2 = (class450)var1;
			return var2.field4736 == this.field4736 && this.field4733 == var2.field4733 && var2.field4737 == this.field4737 && var2.field4735 == this.field4735;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4736 + var2 * 31.0F;
		var2 = this.field4733 + var2 * 31.0F;
		var2 = this.field4737 + 31.0F * var2;
		var2 = var2 * 31.0F + this.field4735;
		return (int)var2;
	}

	public String toString() {
		return this.field4736 + "," + this.field4733 + "," + this.field4737 + "," + this.field4735;
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "568233292"
	)
	static void method8229(String var0) {
		class36.field263 = var0;

		try {
			String var1 = TileItem.client.getParameter(Integer.toString(18));
			String var2 = TileItem.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = class113.method2835() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}

			class26.method381(TileItem.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var15) {
		}

	}
}
