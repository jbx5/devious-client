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

@ObfuscatedName("fk")
public class class163 {
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -2091468897
   )
   int field1831 = -1;
   @ObfuscatedName("b")
   String field1832;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ldm;"
   )
   UrlRequest field1834;
   @ObfuscatedName("g")
   String field1827 = null;
   @ObfuscatedName("i")
   float[] field1828 = new float[4];
   @ObfuscatedName("o")
   ArrayList field1836 = new ArrayList();
   @ObfuscatedName("n")
   ArrayList field1837 = new ArrayList();
   @ObfuscatedName("k")
   ArrayList field1833 = new ArrayList();
   @ObfuscatedName("a")
   Map field1839 = new HashMap();
   @ObfuscatedName("s")
   Map field1840 = new HashMap();

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ldl;I)Z",
      garbageValue = "-1909822883"
   )
   public boolean method3370(String var1, UrlRequester var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.method3385();

            try {
               this.field1832 = var1;
               this.field1834 = var2.request(new URL(this.field1832));
               this.field1831 = 0;
               return true;
            } catch (MalformedURLException var4) {
               this.method3385();
               this.field1831 = 100;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ldl;S)V",
      garbageValue = "19356"
   )
   public void method3371(UrlRequester var1) {
      switch (this.field1831) {
         case 0:
            this.method3380(var1);
            break;
         case 1:
            this.method3381();
            break;
         default:
            return;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-917073960"
   )
   public int method3372() {
      return this.field1831;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-1951981064"
   )
   public int method3373(String var1) {
      return this.field1839.containsKey(var1) ? (Integer)this.field1839.get(var1) : -1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1849655025"
   )
   public String method3374(String var1) {
      return (String)((String)(this.field1840.containsKey(var1) ? this.field1840.get(var1) : null));
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/ArrayList;",
      garbageValue = "24"
   )
   public ArrayList method3383() {
      return this.field1837;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/ArrayList;",
      garbageValue = "22"
   )
   public ArrayList method3376() {
      return this.field1833;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "0"
   )
   public String method3377() {
      return this.field1827;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/ArrayList;",
      garbageValue = "1542942466"
   )
   public ArrayList method3378() {
      return this.field1836;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2085605669"
   )
   void method3385() {
      this.field1834 = null;
      this.field1827 = null;
      this.field1828[0] = 0.0F;
      this.field1828[1] = 0.0F;
      this.field1828[2] = 1.0F;
      this.field1828[3] = 1.0F;
      this.field1836.clear();
      this.field1837.clear();
      this.field1833.clear();
      this.field1839.clear();
      this.field1840.clear();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Ldl;B)V",
      garbageValue = "-109"
   )
   void method3380(UrlRequester var1) {
      if (this.field1834 != null && this.field1834.isDone()) {
         byte[] var2 = this.field1834.getResponse();
         if (var2 == null) {
            this.method3385();
            this.field1831 = 100;
         } else {
            JSONObject var3;
            try {
               class422 var4 = new class422(var2);
               var3 = var4.method7917();
               var3 = var3.getJSONObject("message");
            } catch (Exception var9) {
               this.method3385();
               this.field1831 = 102;
               return;
            }

            try {
               this.method3382(var3.getJSONArray("images"), var1);
            } catch (Exception var8) {
               this.field1837.clear();
            }

            try {
               this.method3413(var3.getJSONArray("labels"));
            } catch (Exception var7) {
               this.field1833.clear();
            }

            try {
               this.method3414(var3.getJSONObject("behaviour"));
            } catch (Exception var6) {
               this.field1827 = null;
               this.field1828[0] = 0.0F;
               this.field1828[1] = 0.0F;
               this.field1828[2] = 1.0F;
               this.field1828[3] = 1.0F;
               this.field1836.clear();
            }

            try {
               this.method3396(var3.getJSONObject("meta"));
            } catch (Exception var5) {
               this.field1839.clear();
               this.field1840.clear();
            }

            this.field1831 = this.field1837.size() > 0 ? 1 : 2;
            this.field1834 = null;
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "24"
   )
   void method3381() {
      Iterator var1 = this.field1837.iterator();

      class168 var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.field1837.iterator();

            while(var1.hasNext()) {
               var2 = (class168)var1.next();
               if (var2.field1867 != null) {
                  byte[] var3 = var2.field1867.getResponse();
                  if (var3 != null && var3.length > 0) {
                     this.field1831 = 2;
                     return;
                  }
               }
            }

            this.method3385();
            this.field1831 = 101;
            return;
         }

         var2 = (class168)var1.next();
      } while(var2.field1867 == null || var2.field1867.isDone());

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;Ldl;I)V",
      garbageValue = "-1559555099"
   )
   void method3382(JSONArray var1, UrlRequester var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class168 var5 = new class168(this);
               var5.field1867 = var2.request(new URL(var4.getString("src")));
               var5.field1868 = Login.method2094(var4, "placement");
               this.field1837.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;B)V",
      garbageValue = "68"
   )
   void method3413(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            class169 var4 = new class169(this);
            var4.field1872 = var3.getString("text");
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
            var4.field1877 = class144.method3145(var3.getString("align_y"));
            var4.field1875 = var3.getInt("font");
            var4.field1873 = Login.method2094(var3, "placement");
            this.field1833.add(var4);
         }

      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;B)V",
      garbageValue = "-7"
   )
   void method3414(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.field1828 = Login.method2094(var1, "clickbounds");
         this.field1827 = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.field1836.add(new class170(this, var2[var3], var4));
               } catch (Exception var8) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.field1836.add(new class170(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.field1836.add(new class170(this, var2[var3], 0));
                     } else {
                        this.field1836.add(new class162(this, var2[var3], var5));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;S)V",
      garbageValue = "16256"
   )
   void method3396(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.getInt(var2[var3]);
            this.field1839.put(var2[var3], var4);
         } catch (Exception var8) {
            try {
               String var5 = var1.getString(var2[var3]);
               if (var5.equals("true")) {
                  this.field1839.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.field1839.put(var2[var3], 0);
               } else {
                  this.field1840.put(var2[var3], var5);
               }
            } catch (Exception var7) {
            }
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Lcp;",
      garbageValue = "1657766333"
   )
   static class87[] method3425() {
      return new class87[]{class87.field1110, class87.field1112, class87.field1113, class87.field1114, class87.field1118, class87.field1120};
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-175884700"
   )
   public static int method3416(int var0) {
      return class424.field4664[var0 & 16383];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1919350476"
   )
   public static int method3422(int var0) {
      return (var0 & class462.field4896) - 1;
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   static final int method3424() {
      if (StructComposition.clientPreferences.method2412()) {
         return class383.Client_plane;
      } else {
         int var0 = 3;
         if (class97.cameraPitch < 310) {
            int var1;
            int var2;
            if (Client.oculusOrbState == 1) {
               var1 = class29.oculusOrbFocalPointX >> 7;
               var2 = class14.oculusOrbFocalPointY >> 7;
            } else {
               var1 = class155.localPlayer.x >> 7;
               var2 = class155.localPlayer.y >> 7;
            }

            int var3 = class145.cameraX >> 7;
            int var4 = ClanChannel.cameraZ >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
               return class383.Client_plane;
            }

            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
               return class383.Client_plane;
            }

            if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) {
               var0 = class383.Client_plane;
            }

            int var5;
            if (var1 > var3) {
               var5 = var1 - var3;
            } else {
               var5 = var3 - var1;
            }

            int var6;
            if (var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            int var8;
            if (var5 > var6) {
               var7 = var6 * 65536 / var5;
               var8 = 32768;

               while(var1 != var3) {
                  if (var3 < var1) {
                     ++var3;
                  } else if (var3 > var1) {
                     --var3;
                  }

                  if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) {
                     var0 = class383.Client_plane;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) {
                        var0 = class383.Client_plane;
                     }
                  }
               }
            } else if (var6 > 0) {
               var7 = var5 * 65536 / var6;
               var8 = 32768;

               while(var4 != var2) {
                  if (var4 < var2) {
                     ++var4;
                  } else if (var4 > var2) {
                     --var4;
                  }

                  if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) {
                     var0 = class383.Client_plane;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var3 < var1) {
                        ++var3;
                     } else if (var3 > var1) {
                        --var3;
                     }

                     if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) {
                        var0 = class383.Client_plane;
                     }
                  }
               }
            }
         }

         if (class155.localPlayer.x >= 0 && class155.localPlayer.y >= 0 && class155.localPlayer.x < 13312 && class155.localPlayer.y < 13312) {
            if ((Tiles.Tiles_renderFlags[class383.Client_plane][class155.localPlayer.x >> 7][class155.localPlayer.y >> 7] & 4) != 0) {
               var0 = class383.Client_plane;
            }

            return var0;
         } else {
            return class383.Client_plane;
         }
      }
   }
}
