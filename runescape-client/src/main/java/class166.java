import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fs")
public class class166 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1251567839
   )
   int field1819 = -1;
   @ObfuscatedName("k")
   String field1820;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ldg;"
   )
   UrlRequest field1826;
   @ObfuscatedName("r")
   String field1827 = null;
   @ObfuscatedName("b")
   float[] field1828 = new float[4];
   @ObfuscatedName("m")
   ArrayList field1829 = new ArrayList();
   @ObfuscatedName("t")
   ArrayList field1830 = new ArrayList();
   @ObfuscatedName("h")
   ArrayList field1831 = new ArrayList();
   @ObfuscatedName("p")
   Map field1824 = new HashMap();
   @ObfuscatedName("o")
   Map field1833 = new HashMap();

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ldi;I)Z",
      garbageValue = "-1906969818"
   )
   public boolean method3418(String var1, UrlRequester var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.method3426();

            try {
               this.field1820 = var1;
               this.field1826 = var2.request(new URL(this.field1820));
               this.field1819 = 0;
               return true;
            } catch (MalformedURLException var4) {
               this.method3426();
               this.field1819 = 100;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Ldi;I)V",
      garbageValue = "-441833752"
   )
   public void method3419(UrlRequester var1) {
      switch (this.field1819) {
         case 0:
            this.method3427(var1);
            break;
         case 1:
            this.method3428();
            break;
         default:
            return;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1468199543"
   )
   public int method3420() {
      return this.field1819;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "342662863"
   )
   public int method3433(String var1) {
      return this.field1824.containsKey(var1) ? (Integer)this.field1824.get(var1) : -1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-183486423"
   )
   public String method3422(String var1) {
      return (String)((String)(this.field1833.containsKey(var1) ? this.field1833.get(var1) : null));
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/ArrayList;",
      garbageValue = "-745265160"
   )
   public ArrayList method3459() {
      return this.field1830;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/ArrayList;",
      garbageValue = "-1813839199"
   )
   public ArrayList method3424() {
      return this.field1831;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "532962276"
   )
   public String method3425() {
      return this.field1827;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/ArrayList;",
      garbageValue = "61"
   )
   public ArrayList method3448() {
      return this.field1829;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "435595886"
   )
   void method3426() {
      this.field1826 = null;
      this.field1827 = null;
      this.field1828[0] = 0.0F;
      this.field1828[1] = 0.0F;
      this.field1828[2] = 1.0F;
      this.field1828[3] = 1.0F;
      this.field1829.clear();
      this.field1830.clear();
      this.field1831.clear();
      this.field1824.clear();
      this.field1833.clear();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ldi;I)V",
      garbageValue = "1102983702"
   )
   void method3427(UrlRequester var1) {
      if (this.field1826 != null && this.field1826.isDone()) {
         byte[] var2 = this.field1826.getResponse();
         if (var2 == null) {
            this.method3426();
            this.field1819 = 100;
         } else {
            JSONObject var3;
            try {
               class429 var4 = new class429(var2);
               var3 = var4.method8045();
               var3 = var3.getJSONObject("message");
            } catch (Exception var9) {
               this.method3426();
               this.field1819 = 102;
               return;
            }

            try {
               this.method3429(var3.getJSONArray("images"), var1);
            } catch (Exception var8) {
               this.field1830.clear();
            }

            try {
               this.method3430(var3.getJSONArray("labels"));
            } catch (Exception var7) {
               this.field1831.clear();
            }

            try {
               this.method3463(var3.getJSONObject("behaviour"));
            } catch (Exception var6) {
               this.field1827 = null;
               this.field1828[0] = 0.0F;
               this.field1828[1] = 0.0F;
               this.field1828[2] = 1.0F;
               this.field1828[3] = 1.0F;
               this.field1829.clear();
            }

            try {
               this.method3467(var3.getJSONObject("meta"));
            } catch (Exception var5) {
               this.field1824.clear();
               this.field1833.clear();
            }

            this.field1819 = this.field1830.size() > 0 ? 1 : 2;
            this.field1826 = null;
         }
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1531480410"
   )
   void method3428() {
      Iterator var1 = this.field1830.iterator();

      class172 var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.field1830.iterator();

            while(var1.hasNext()) {
               var2 = (class172)var1.next();
               if (var2.field1870 != null) {
                  byte[] var3 = var2.field1870.getResponse();
                  if (var3 != null && var3.length > 0) {
                     this.field1819 = 2;
                     return;
                  }
               }
            }

            this.method3426();
            this.field1819 = 101;
            return;
         }

         var2 = (class172)var1.next();
      } while(var2.field1870 == null || var2.field1870.isDone());

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;Ldi;I)V",
      garbageValue = "-1028826421"
   )
   void method3429(JSONArray var1, UrlRequester var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class172 var5 = new class172(this);
               var5.field1870 = var2.request(new URL(var4.getString("src")));
               var5.field1864 = class88.method2408(var4, "placement");
               this.field1830.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;I)V",
      garbageValue = "1741895465"
   )
   void method3430(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            class173 var4 = new class173(this);
            var4.field1875 = var3.getString("text");
            String var7 = var3.getString("align_x");
            byte var6;
            if (var7.equals("centre")) {
               var6 = 1;
            } else if (!var7.equals("bottom") && !var7.equals("right")) {
               var6 = 0;
            } else {
               var6 = 2;
            }

            var4.field1876 = var6;
            String var10 = var3.getString("align_y");
            byte var9;
            if (var10.equals("centre")) {
               var9 = 1;
            } else if (!var10.equals("bottom") && !var10.equals("right")) {
               var9 = 0;
            } else {
               var9 = 2;
            }

            var4.field1878 = var9;
            var4.field1879 = var3.getInt("font");
            var4.field1880 = class88.method2408(var3, "placement");
            this.field1831.add(var4);
         }

      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;I)V",
      garbageValue = "-2097797182"
   )
   void method3463(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.field1828 = class88.method2408(var1, "clickbounds");
         this.field1827 = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.field1829.add(new class174(this, var2[var3], var4));
               } catch (Exception var8) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.field1829.add(new class174(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.field1829.add(new class174(this, var2[var3], 0));
                     } else {
                        this.field1829.add(new class165(this, var2[var3], var5));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;I)V",
      garbageValue = "1293504682"
   )
   void method3467(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.getInt(var2[var3]);
            this.field1824.put(var2[var3], var4);
         } catch (Exception var8) {
            try {
               String var5 = var1.getString(var2[var3]);
               if (var5.equals("true")) {
                  this.field1824.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.field1824.put(var2[var3], 0);
               } else {
                  this.field1833.put(var2[var3], var5);
               }
            } catch (Exception var7) {
            }
         }
      }

   }
}
