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

@ObfuscatedName("gy")
public class class166 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 371416339
   )
   int field1806 = -1;
   @ObfuscatedName("aa")
   String field1807;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lez;"
   )
   UrlRequest field1802;
   @ObfuscatedName("ao")
   String field1809 = null;
   @ObfuscatedName("ax")
   float[] field1810 = new float[4];
   @ObfuscatedName("ai")
   ArrayList field1811 = new ArrayList();
   @ObfuscatedName("ag")
   ArrayList field1812 = new ArrayList();
   @ObfuscatedName("ah")
   ArrayList field1813 = new ArrayList();
   @ObfuscatedName("av")
   Map field1814 = new HashMap();
   @ObfuscatedName("ar")
   Map field1799 = new HashMap();

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Let;I)Z",
      garbageValue = "493996582"
   )
   public boolean method3482(String var1, UrlRequester var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.method3492();

            try {
               this.field1807 = var1;
               this.field1802 = var2.request(new URL(this.field1807));
               this.field1806 = 0;
               return true;
            } catch (MalformedURLException var4) {
               this.method3492();
               this.field1806 = 100;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Let;B)V",
      garbageValue = "-18"
   )
   public void method3483(UrlRequester var1) {
      switch (this.field1806) {
         case 0:
            this.method3543(var1);
            break;
         case 1:
            this.method3487();
            break;
         default:
            return;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-28"
   )
   public int method3484() {
      return this.field1806;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "92"
   )
   public int method3494(String var1) {
      return this.field1814.containsKey(var1) ? (Integer)this.field1814.get(var1) : -1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "16"
   )
   public String method3486(String var1) {
      return (String)((String)(this.field1799.containsKey(var1) ? this.field1799.get(var1) : null));
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/ArrayList;",
      garbageValue = "434177359"
   )
   public ArrayList method3489() {
      return this.field1812;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/ArrayList;",
      garbageValue = "1"
   )
   public ArrayList method3542() {
      return this.field1813;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "79"
   )
   public String method3525() {
      return this.field1809;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "2102888659"
   )
   public float[] method3490() {
      return this.field1810;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/ArrayList;",
      garbageValue = "1491892431"
   )
   public ArrayList method3491() {
      return this.field1811;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "865668444"
   )
   void method3492() {
      this.field1802 = null;
      this.field1809 = null;
      this.field1810[0] = 0.0F;
      this.field1810[1] = 0.0F;
      this.field1810[2] = 1.0F;
      this.field1810[3] = 1.0F;
      this.field1811.clear();
      this.field1812.clear();
      this.field1813.clear();
      this.field1814.clear();
      this.field1799.clear();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Let;I)V",
      garbageValue = "-724612758"
   )
   void method3543(UrlRequester var1) {
      if (this.field1802 != null && this.field1802.isDone()) {
         byte[] var2 = this.field1802.getResponse();
         if (var2 == null) {
            this.method3492();
            this.field1806 = 100;
         } else {
            try {
               this.method3499(new class437(var2), var1);
            } catch (UnsupportedEncodingException var4) {
               this.method3492();
               this.field1806 = 102;
               return;
            }

            this.field1806 = this.field1812.size() > 0 ? 1 : 2;
            this.field1802 = null;
         }
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "155422894"
   )
   void method3487() {
      Iterator var1 = this.field1812.iterator();

      class172 var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.field1812.iterator();

            while(var1.hasNext()) {
               var2 = (class172)var1.next();
               if (var2.field1849 != null) {
                  byte[] var3 = var2.field1849.getResponse();
                  if (var3 != null && var3.length > 0) {
                     this.field1806 = 2;
                     return;
                  }
               }
            }

            this.method3492();
            this.field1806 = 101;
            return;
         }

         var2 = (class172)var1.next();
      } while(var2.field1849 == null || var2.field1849.isDone());

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;Let;I)V",
      garbageValue = "2041464667"
   )
   void method3495(JSONArray var1, UrlRequester var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class172 var5 = new class172(this);
               var5.field1849 = var2.request(new URL(var4.getString("src")));
               var5.field1848 = UserComparator8.method2886(var4, "placement");
               this.field1812.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;B)V",
      garbageValue = "3"
   )
   void method3496(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            class173 var4 = new class173(this);
            var4.field1855 = var3.getString("text");
            String var7 = var3.getString("align_x");
            byte var6;
            if (var7.equals("centre")) {
               var6 = 1;
            } else if (!var7.equals("bottom") && !var7.equals("right")) {
               var6 = 0;
            } else {
               var6 = 2;
            }

            var4.field1858 = var6;
            String var10 = var3.getString("align_y");
            byte var9;
            if (var10.equals("centre")) {
               var9 = 1;
            } else if (!var10.equals("bottom") && !var10.equals("right")) {
               var9 = 0;
            } else {
               var9 = 2;
            }

            var4.field1859 = var9;
            var4.field1853 = var3.getInt("font");
            var4.field1856 = UserComparator8.method2886(var3, "placement");
            this.field1813.add(var4);
         }

      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;I)V",
      garbageValue = "-28927295"
   )
   void method3497(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.field1810 = UserComparator8.method2886(var1, "clickbounds");
         this.field1809 = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.field1811.add(new class174(this, var2[var3], var4));
               } catch (Exception var8) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.field1811.add(new class174(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.field1811.add(new class174(this, var2[var3], 0));
                     } else {
                        this.field1811.add(new class165(this, var2[var3], var5));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;I)V",
      garbageValue = "891662681"
   )
   void method3526(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.getInt(var2[var3]);
            this.field1814.put(var2[var3], var4);
         } catch (Exception var8) {
            try {
               String var5 = var1.getString(var2[var3]);
               if (var5.equals("true")) {
                  this.field1814.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.field1814.put(var2[var3], 0);
               } else {
                  this.field1799.put(var2[var3], var5);
               }
            } catch (Exception var7) {
            }
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lqv;Let;I)V",
      garbageValue = "1522687051"
   )
   void method3499(class437 var1, UrlRequester var2) {
      JSONObject var3;
      try {
         var3 = var1.method8332();
         var3 = var3.getJSONObject("message");
      } catch (Exception var9) {
         this.method3492();
         this.field1806 = 102;
         return;
      }

      try {
         this.method3495(var3.getJSONArray("images"), var2);
      } catch (Exception var8) {
         this.field1812.clear();
      }

      try {
         this.method3496(var3.getJSONArray("labels"));
      } catch (Exception var7) {
         this.field1813.clear();
      }

      try {
         this.method3497(var3.getJSONObject("behaviour"));
      } catch (Exception var6) {
         this.field1809 = null;
         this.field1810[0] = 0.0F;
         this.field1810[1] = 0.0F;
         this.field1810[2] = 1.0F;
         this.field1810[3] = 1.0F;
         this.field1811.clear();
      }

      try {
         this.method3526(var3.getJSONObject("meta"));
      } catch (Exception var5) {
         this.field1814.clear();
         this.field1799.clear();
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Let;I)Z",
      garbageValue = "-1306660801"
   )
   public boolean method3500(String var1, UrlRequester var2) {
      try {
         this.method3499(new class437(var1.getBytes()), var2);
         this.field1806 = this.field1812.size() > 0 ? 1 : 2;
      } catch (UnsupportedEncodingException var4) {
         this.field1806 = 102;
      }

      return this.field1806 < 100;
   }

   @ObfuscatedName("kp")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "9"
   )
   @Export("Widget_runOnTargetLeave")
   static void Widget_runOnTargetLeave() {
      if (Client.isSpellSelected) {
         Widget var0 = SoundSystem.getWidgetChild(Clips.selectedSpellWidget, Client.selectedSpellChildIndex);
         if (var0 != null && var0.onTargetLeave != null) {
            ScriptEvent var1 = new ScriptEvent();
            var1.widget = var0;
            var1.args = var0.onTargetLeave;
            HealthBarUpdate.runScriptEvent(var1);
         }

         Client.selectedSpellItemId = -1;
         Client.isSpellSelected = false;
         class144.invalidateWidget(var0);
      }
   }

   @ObfuscatedName("ll")
   @ObfuscatedSignature(
      descriptor = "(Lmq;IIIIIIB)V",
      garbageValue = "-101"
   )
   static final void method3547(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Client.field569) {
         Client.alternativeScrollbarWidth = 32;
      } else {
         Client.alternativeScrollbarWidth = 0;
      }

      Client.field569 = false;
      int var7;
      if (MouseHandler.MouseHandler_currentButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.scrollY -= 4;
            class144.invalidateWidget(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.scrollY += 4;
            class144.invalidateWidget(var0);
         } else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if (var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.scrollY = var8 * (var4 - var3) / var9;
            class144.invalidateWidget(var0);
            Client.field569 = true;
         }
      }

      if (Client.mouseWheelRotation != 0) {
         var7 = var0.width;
         if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.scrollY += Client.mouseWheelRotation * 45;
            class144.invalidateWidget(var0);
         }
      }

   }
}
