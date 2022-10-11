import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ft")
public class class162 {
   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      descriptor = "[Lri;"
   )
   @Export("headIconHintSprites")
   static SpritePixels[] headIconHintSprites;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 575930881
   )
   int field1769 = -1;
   @ObfuscatedName("r")
   String field1777;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lde;"
   )
   UrlRequest field1771;
   @ObfuscatedName("s")
   String field1773 = null;
   @ObfuscatedName("p")
   float[] field1776 = new float[4];
   @ObfuscatedName("b")
   ArrayList field1774 = new ArrayList();
   @ObfuscatedName("o")
   ArrayList field1775 = new ArrayList();
   @ObfuscatedName("u")
   ArrayList field1770 = new ArrayList();
   @ObfuscatedName("z")
   Map field1772 = new HashMap();
   @ObfuscatedName("t")
   Map field1766 = new HashMap();

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ldk;I)Z",
      garbageValue = "1735189222"
   )
   public boolean method3271(String var1, UrlRequester var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.method3307();

            try {
               this.field1777 = var1;
               this.field1771 = var2.request(new URL(this.field1777));
               this.field1769 = 0;
               return true;
            } catch (MalformedURLException var4) {
               this.method3307();
               this.field1769 = 100;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ldk;I)V",
      garbageValue = "-1731463892"
   )
   public void method3272(UrlRequester var1) {
      switch (this.field1769) {
         case 0:
            this.method3270(var1);
            break;
         case 1:
            this.method3281();
            break;
         default:
            return;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "2"
   )
   public int method3310() {
      return this.field1769;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "-16"
   )
   public int method3274(String var1) {
      return this.field1772.containsKey(var1) ? (Integer)this.field1772.get(var1) : -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "42"
   )
   public String method3275(String var1) {
      return (String)((String)(this.field1766.containsKey(var1) ? this.field1766.get(var1) : null));
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/ArrayList;",
      garbageValue = "-153446942"
   )
   public ArrayList method3276() {
      return this.field1775;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/ArrayList;",
      garbageValue = "104"
   )
   public ArrayList method3325() {
      return this.field1770;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1744575005"
   )
   public String method3278() {
      return this.field1773;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/ArrayList;",
      garbageValue = "1957600459"
   )
   public ArrayList method3279() {
      return this.field1774;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2001144966"
   )
   void method3307() {
      this.field1771 = null;
      this.field1773 = null;
      this.field1776[0] = 0.0F;
      this.field1776[1] = 0.0F;
      this.field1776[2] = 1.0F;
      this.field1776[3] = 1.0F;
      this.field1774.clear();
      this.field1775.clear();
      this.field1770.clear();
      this.field1772.clear();
      this.field1766.clear();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Ldk;I)V",
      garbageValue = "-1850950888"
   )
   void method3270(UrlRequester var1) {
      if (this.field1771 != null && this.field1771.isDone()) {
         byte[] var2 = this.field1771.getResponse();
         if (var2 == null) {
            this.method3307();
            this.field1769 = 100;
         } else {
            JSONObject var3;
            try {
               class419 var4 = new class419(var2);
               var3 = var4.method7786();
               var3 = var3.getJSONObject("message");
            } catch (Exception var9) {
               this.method3307();
               this.field1769 = 102;
               return;
            }

            try {
               this.method3282(var3.getJSONArray("images"), var1);
            } catch (Exception var8) {
               this.field1775.clear();
            }

            try {
               this.method3294(var3.getJSONArray("labels"));
            } catch (Exception var7) {
               this.field1770.clear();
            }

            try {
               this.method3273(var3.getJSONObject("behaviour"));
            } catch (Exception var6) {
               this.field1773 = null;
               this.field1776[0] = 0.0F;
               this.field1776[1] = 0.0F;
               this.field1776[2] = 1.0F;
               this.field1776[3] = 1.0F;
               this.field1774.clear();
            }

            try {
               this.method3280(var3.getJSONObject("meta"));
            } catch (Exception var5) {
               this.field1772.clear();
               this.field1766.clear();
            }

            this.field1769 = this.field1775.size() > 0 ? 1 : 2;
            this.field1771 = null;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2061464376"
   )
   void method3281() {
      Iterator var1 = this.field1775.iterator();

      class167 var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.field1775.iterator();

            while(var1.hasNext()) {
               var2 = (class167)var1.next();
               if (var2.field1815 != null) {
                  byte[] var3 = var2.field1815.getResponse();
                  if (var3 != null && var3.length > 0) {
                     this.field1769 = 2;
                     return;
                  }
               }
            }

            this.method3307();
            this.field1769 = 101;
            return;
         }

         var2 = (class167)var1.next();
      } while(var2.field1815 == null || var2.field1815.isDone());

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;Ldk;B)V",
      garbageValue = "-89"
   )
   void method3282(JSONArray var1, UrlRequester var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class167 var5 = new class167(this);
               var5.field1815 = var2.request(new URL(var4.getString("src")));
               var5.field1814 = class127.method2919(var4, "placement");
               this.field1775.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;I)V",
      garbageValue = "-889720204"
   )
   void method3294(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            class168 var4 = new class168(this);
            var4.field1818 = var3.getString("text");
            String var7 = var3.getString("align_x");
            byte var6;
            if (var7.equals("centre")) {
               var6 = 1;
            } else if (!var7.equals("bottom") && !var7.equals("right")) {
               var6 = 0;
            } else {
               var6 = 2;
            }

            var4.field1820 = var6;
            String var10 = var3.getString("align_y");
            byte var9;
            if (var10.equals("centre")) {
               var9 = 1;
            } else if (!var10.equals("bottom") && !var10.equals("right")) {
               var9 = 0;
            } else {
               var9 = 2;
            }

            var4.field1821 = var9;
            var4.field1822 = var3.getInt("font");
            var4.field1816 = class127.method2919(var3, "placement");
            this.field1770.add(var4);
         }

      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;B)V",
      garbageValue = "2"
   )
   void method3273(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.field1776 = class127.method2919(var1, "clickbounds");
         this.field1773 = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.field1774.add(new class169(this, var2[var3], var4));
               } catch (Exception var8) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.field1774.add(new class169(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.field1774.add(new class169(this, var2[var3], 0));
                     } else {
                        this.field1774.add(new class161(this, var2[var3], var5));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;I)V",
      garbageValue = "-1027086610"
   )
   void method3280(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.getInt(var2[var3]);
            this.field1772.put(var2[var3], var4);
         } catch (Exception var8) {
            try {
               String var5 = var1.getString(var2[var3]);
               if (var5.equals("true")) {
                  this.field1772.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.field1772.put(var2[var3], 0);
               } else {
                  this.field1766.put(var2[var3], var5);
               }
            } catch (Exception var7) {
            }
         }
      }

   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-381583551"
   )
   @Export("updateItemPile")
   static final void updateItemPile(int var0, int var1) {
      NodeDeque var2 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var0][var1];
      if (var2 == null) {
         class139.scene.removeGroundItemPile(ApproximateRouteStrategy.Client_plane, var0, var1);
      } else {
         long var3 = -99999999L;
         TileItem var5 = null;

         TileItem var6;
         for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
            ItemComposition var7 = MidiPcmStream.ItemDefinition_get(var6.id);
            long var11 = (long)var7.price;
            if (var7.isStackable == 1) {
               var11 *= (long)(var6.quantity + 1);
            }

            if (var11 > var3) {
               var3 = var11;
               var5 = var6;
            }
         }

         if (var5 == null) {
            class139.scene.removeGroundItemPile(ApproximateRouteStrategy.Client_plane, var0, var1);
         } else {
            var2.addLast(var5);
            TileItem var13 = null;
            TileItem var8 = null;

            for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
               if (var5.id != var6.id) {
                  if (var13 == null) {
                     var13 = var6;
                  }

                  if (var6.id != var13.id && var8 == null) {
                     var8 = var6;
                  }
               }
            }

            long var9 = SpotAnimationDefinition.calculateTag(var0, var1, 3, false, 0);
            class139.scene.newGroundItemPile(ApproximateRouteStrategy.Client_plane, var0, var1, class132.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, ApproximateRouteStrategy.Client_plane), var5, var9, var13, var8);
         }
      }
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "529958261"
   )
   static final String method3326(int var0) {
      return var0 < 999999999 ? Integer.toString(var0) : "*";
   }
}
