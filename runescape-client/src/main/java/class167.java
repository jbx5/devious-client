import java.io.UnsupportedEncodingException;
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

@ObfuscatedName("gs")
public class class167 {
   @ObfuscatedName("uw")
   @ObfuscatedGetter(
      intValue = -403952000
   )
   static int field1800;
   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive12")
   static Archive archive12;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1879184161
   )
   int field1788 = -1;
   @ObfuscatedName("ar")
   String field1789;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Leo;"
   )
   UrlRequest field1790;
   @ObfuscatedName("ax")
   String field1791 = null;
   @ObfuscatedName("as")
   float[] field1792 = new float[4];
   @ObfuscatedName("ay")
   ArrayList field1785 = new ArrayList();
   @ObfuscatedName("am")
   ArrayList field1794 = new ArrayList();
   @ObfuscatedName("az")
   ArrayList field1795 = new ArrayList();
   @ObfuscatedName("ae")
   Map field1786 = new HashMap();
   @ObfuscatedName("au")
   Map field1797 = new HashMap();

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Leb;I)Z",
      garbageValue = "-817069381"
   )
   public boolean method3386(String var1, UrlRequester var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.method3395();

            try {
               this.field1789 = var1;
               this.field1790 = var2.request(new URL(this.field1789));
               this.field1788 = 0;
               return true;
            } catch (MalformedURLException var4) {
               this.method3395();
               this.field1788 = 100;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Leb;S)V",
      garbageValue = "-30326"
   )
   public void method3387(UrlRequester var1) {
      switch (this.field1788) {
         case 0:
            this.method3428(var1);
            break;
         case 1:
            this.method3419();
            break;
         default:
            return;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "56"
   )
   public int method3398() {
      return this.field1788;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1932678065"
   )
   public int method3411(String var1) {
      return this.field1786.containsKey(var1) ? (Integer)this.field1786.get(var1) : -1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1530090364"
   )
   public String method3397(String var1) {
      return (String)((String)(this.field1797.containsKey(var1) ? this.field1797.get(var1) : null));
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/ArrayList;",
      garbageValue = "-3349953"
   )
   public ArrayList method3399() {
      return this.field1794;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/ArrayList;",
      garbageValue = "-19"
   )
   public ArrayList method3392() {
      return this.field1795;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1167109503"
   )
   public String method3393() {
      return this.field1791;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "-2042824"
   )
   public float[] method3402() {
      return this.field1792;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/ArrayList;",
      garbageValue = "7"
   )
   public ArrayList method3390() {
      return this.field1785;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "55"
   )
   void method3395() {
      this.field1790 = null;
      this.field1791 = null;
      this.field1792[0] = 0.0F;
      this.field1792[1] = 0.0F;
      this.field1792[2] = 1.0F;
      this.field1792[3] = 1.0F;
      this.field1785.clear();
      this.field1794.clear();
      this.field1795.clear();
      this.field1786.clear();
      this.field1797.clear();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Leb;I)V",
      garbageValue = "295942057"
   )
   void method3428(UrlRequester var1) {
      if (this.field1790 != null && this.field1790.isDone()) {
         byte[] var2 = this.field1790.getResponse();
         if (var2 == null) {
            this.method3395();
            this.field1788 = 100;
         } else {
            try {
               this.method3394(new class433(var2), var1);
            } catch (UnsupportedEncodingException var4) {
               this.method3395();
               this.field1788 = 102;
               return;
            }

            this.field1788 = this.field1794.size() > 0 ? 1 : 2;
            this.field1790 = null;
         }
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "29"
   )
   void method3419() {
      Iterator var1 = this.field1794.iterator();

      class173 var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.field1794.iterator();

            while(var1.hasNext()) {
               var2 = (class173)var1.next();
               if (var2.field1830 != null) {
                  byte[] var3 = var2.field1830.getResponse();
                  if (var3 != null && var3.length > 0) {
                     this.field1788 = 2;
                     return;
                  }
               }
            }

            this.method3395();
            this.field1788 = 101;
            return;
         }

         var2 = (class173)var1.next();
      } while(var2.field1830 == null || var2.field1830.isDone());

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;Leb;I)V",
      garbageValue = "1778841749"
   )
   void method3413(JSONArray var1, UrlRequester var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class173 var5 = new class173(this);
               var5.field1830 = var2.request(new URL(var4.getString("src")));
               var5.field1829 = class260.method5238(var4, "placement");
               this.field1794.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;I)V",
      garbageValue = "-1527876041"
   )
   void method3401(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            class174 var4 = new class174(this);
            var4.field1836 = var3.getString("text");
            String var7 = var3.getString("align_x");
            byte var6;
            if (var7.equals("centre")) {
               var6 = 1;
            } else if (!var7.equals("bottom") && !var7.equals("right")) {
               var6 = 0;
            } else {
               var6 = 2;
            }

            var4.field1837 = var6;
            String var10 = var3.getString("align_y");
            byte var9;
            if (var10.equals("centre")) {
               var9 = 1;
            } else if (!var10.equals("bottom") && !var10.equals("right")) {
               var9 = 0;
            } else {
               var9 = 2;
            }

            var4.field1834 = var9;
            var4.field1839 = var3.getInt("font");
            var4.field1840 = class260.method5238(var3, "placement");
            this.field1795.add(var4);
         }

      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;I)V",
      garbageValue = "-1169579643"
   )
   void method3403(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.field1792 = class260.method5238(var1, "clickbounds");
         this.field1791 = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.field1785.add(new class175(this, var2[var3], var4));
               } catch (Exception var8) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.field1785.add(new class175(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.field1785.add(new class175(this, var2[var3], 0));
                     } else {
                        this.field1785.add(new class166(this, var2[var3], var5));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;B)V",
      garbageValue = "7"
   )
   void method3410(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.getInt(var2[var3]);
            this.field1786.put(var2[var3], var4);
         } catch (Exception var8) {
            try {
               String var5 = var1.getString(var2[var3]);
               if (var5.equals("true")) {
                  this.field1786.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.field1786.put(var2[var3], 0);
               } else {
                  this.field1797.put(var2[var3], var5);
               }
            } catch (Exception var7) {
            }
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lqg;Leb;B)V",
      garbageValue = "120"
   )
   void method3394(class433 var1, UrlRequester var2) {
      JSONObject var3;
      try {
         var3 = var1.method7980();
         var3 = var3.getJSONObject("message");
      } catch (Exception var9) {
         this.method3395();
         this.field1788 = 102;
         return;
      }

      try {
         this.method3413(var3.getJSONArray("images"), var2);
      } catch (Exception var8) {
         this.field1794.clear();
      }

      try {
         this.method3401(var3.getJSONArray("labels"));
      } catch (Exception var7) {
         this.field1795.clear();
      }

      try {
         this.method3403(var3.getJSONObject("behaviour"));
      } catch (Exception var6) {
         this.field1791 = null;
         this.field1792[0] = 0.0F;
         this.field1792[1] = 0.0F;
         this.field1792[2] = 1.0F;
         this.field1792[3] = 1.0F;
         this.field1785.clear();
      }

      try {
         this.method3410(var3.getJSONObject("meta"));
      } catch (Exception var5) {
         this.field1786.clear();
         this.field1797.clear();
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Leb;B)Z",
      garbageValue = "3"
   )
   public boolean method3423(String var1, UrlRequester var2) {
      try {
         this.method3394(new class433(var1.getBytes()), var2);
         this.field1788 = this.field1794.size() > 0 ? 1 : 2;
      } catch (UnsupportedEncodingException var4) {
         this.field1788 = 102;
      }

      return this.field1788 < 100;
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "560158880"
   )
   static final void method3445(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
         if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
            Client.field722[var4] = true;
         }
      }

   }
}
