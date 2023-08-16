import com.jagex.oldscape.pub.OAuthApi;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class311 {
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = -496070959
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = -957988005
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = 1721185941
	)
	public static int field649;
	@ObfuscatedName("xy")
	static int[] field829;
	@ObfuscatedName("uh")
	static boolean field794;
	@ObfuscatedName("xf")
	static int[] field830;
	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	static final ApproximateRouteStrategy field828;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = 2122687767
	)
	static int field632;
	@ObfuscatedName("vw")
	static boolean[] field795;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = -606789725
	)
	static int field815;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("DBTableMasterIndex_cache")
	static EvictingDualNodeHashTable DBTableMasterIndex_cache;
	@ObfuscatedName("wv")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = -170542827
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("archive5")
	static class423 archive5;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static class475 field671;
	@ObfuscatedName("vl")
	static short field800;
	@ObfuscatedName("vp")
	static short field685;
	@ObfuscatedName("vu")
	static short field806;
	@ObfuscatedName("vj")
	static short field807;
	@ObfuscatedName("ve")
	static short field635;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = -544120667
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vf")
	static short field804;
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = -685574095
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("we")
	@ObfuscatedGetter(
		intValue = -1074907455
	)
	static int field827;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -212965565
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vm")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vi")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vq")
	static int[] field748;
	@ObfuscatedName("vh")
	static int[] field588;
	@ObfuscatedName("vk")
	static int[] field658;
	@ObfuscatedName("vz")
	static int[] field744;
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wa")
	@ObfuscatedGetter(
		intValue = -1467424607
	)
	static int field822;
	@ObfuscatedName("wt")
	static List field695;
	@ObfuscatedName("bc")
	static boolean field566;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -831561099
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1264215911
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -472947525
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cx")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cr")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -254020809
	)
	static int field531;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -647533501
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -260341301
	)
	static int field544;
	@ObfuscatedName("cu")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -331110037
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -667400491
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("di")
	static boolean field537;
	@ObfuscatedName("ed")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 522278027
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		longValue = -3989900610207861207L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 874241351
	)
	static int field542;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 139028677
	)
	static int field543;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		longValue = -152133301902653265L
	)
	static long field669;
	@ObfuscatedName("er")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 275758355
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 1514019037
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -709660557
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -1792372927
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1664778039
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 714789379
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -966889900
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -485020789
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 342995904
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("eu")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static class92 field558;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 1824417205
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -285158529
	)
	static int field560;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -961634761
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1808720373
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -772517067
	)
	static int field541;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -830204195
	)
	static int field592;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -441683383
	)
	static int field664;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static class139 field776;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static class519 field571;
	@ObfuscatedName("hl")
	static final String field778;
	@ObfuscatedName("hg")
	static final String field662;
	@ObfuscatedName("hm")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ie")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 641541081
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ih")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("it")
	static String field692;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 543863055
	)
	static int field640;
	@ObfuscatedName("ic")
	static int[] field737;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 895819663
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("id")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("jn")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 1461936041
	)
	static int field596;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 2065503827
	)
	static int field630;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 1509888147
	)
	static int field598;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -8326345
	)
	static int field599;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -1422375547
	)
	static int field600;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "[Lis;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jp")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jf")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jm")
	static final int[] field711;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1566404371
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 302083915
	)
	static int field607;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 205680803
	)
	static int field718;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 312756687
	)
	static int field609;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1345195633
	)
	static int field798;
	@ObfuscatedName("kw")
	static boolean field611;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -1757343563
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 348196035
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -817936455
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 603979869
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -1883228053
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1169837641
	)
	static int field538;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1544467501
	)
	static int mouseCamClickedY;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 453449917
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 1252802435
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -295239457
	)
	static int field621;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 575673155
	)
	static int field622;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 5882375
	)
	static int field623;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 623963831
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -557098467
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -1700661189
	)
	static int field626;
	@ObfuscatedName("lt")
	static boolean field627;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -1087269561
	)
	static int field628;
	@ObfuscatedName("lz")
	static boolean field629;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 393692699
	)
	static int field668;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1918268123
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 563286433
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("li")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ll")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("lb")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("md")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("mh")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("mv")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mg")
	static int[][] field535;
	@ObfuscatedName("mq")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mu")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mk")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -1271442429
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -829592937
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1703548153
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1726753241
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 15985943
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 798221835
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 1950062223
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mw")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 1454203771
	)
	static int field651;
	@ObfuscatedName("mb")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "[Ldf;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 530420265
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = 1997408031
	)
	static int field655;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		longValue = -367930453646370059L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("ms")
	static boolean field764;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 2086333427
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 218131503
	)
	static int field796;
	@ObfuscatedName("nt")
	static int[] field552;
	@ObfuscatedName("nb")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ns")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nz")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ne")
	static int[] defaultRotations;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = 1574957247
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "[[[Low;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("ny")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nk")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nj")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nu")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("nf")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 1676985473
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("oz")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("oh")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("oy")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("od")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("og")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("ob")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ok")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("on")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("oe")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("os")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ow")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -473784219
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 369924789
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -1357245691
	)
	static int field689;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 2098316339
	)
	static int field690;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 61632949
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("or")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 757890481
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 1365611331
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("pa")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("pi")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1642683045
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -1685145543
	)
	static int field540;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = 2109391005
	)
	static int field701;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 246939975
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 2106479597
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 679999119
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 697939723
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -1773996711
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pp")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1550111259
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -866831459
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pw")
	static boolean field715;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 1055651323
	)
	static int field716;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 16018961
	)
	static int field717;
	@ObfuscatedName("qn")
	static boolean field762;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 2053842635
	)
	static int field564;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -391941313
	)
	static int field636;
	@ObfuscatedName("qm")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -1028226557
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qo")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -1139085369
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qx")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 311981329
	)
	static int field726;
	@ObfuscatedName("qz")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -85127843
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qu")
	static int[] field793;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 220177805
	)
	static int field657;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -898905347
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -1991914345
	)
	static int field732;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 307590481
	)
	static int field733;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -926799759
	)
	static int field734;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1052818097
	)
	static int field735;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -637792155
	)
	static int field736;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = 1955656231
	)
	static int field597;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -1436575603
	)
	static int field578;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 1827467907
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static class532 field740;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static NodeDeque field727;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static NodeDeque field743;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static NodeDeque field780;
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 525652161
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -2058470363
	)
	static int field747;
	@ObfuscatedName("re")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("rf")
	static boolean[] field749;
	@ObfuscatedName("rl")
	static boolean[] field750;
	@ObfuscatedName("rt")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rx")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rw")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rn")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 874164869
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		longValue = 7924104649919695757L
	)
	static long field756;
	@ObfuscatedName("sd")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("se")
	static int[] field758;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = 1986660135
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -2127681993
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sc")
	static String field554;
	@ObfuscatedName("si")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -765244531
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static class212 field674;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static class210 field765;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1915135663
	)
	static int field766;
	@ObfuscatedName("so")
	static int[] field767;
	@ObfuscatedName("su")
	static int[] field768;
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		longValue = 7846728172107190483L
	)
	static long field769;
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "[Lfi;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tn")
	@ObfuscatedSignature(
		descriptor = "[Lgo;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 713564975
	)
	static int field772;
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = 741539585
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tq")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tg")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 850793817
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -214324647
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 35990849
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tp")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1939358919
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tf")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tv")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("ua")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("uj")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "[Lbp;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ut")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ur")
	static boolean field788;
	@ObfuscatedName("ux")
	static boolean field789;
	@ObfuscatedName("uo")
	static boolean field790;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	static class479 field791;
	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	static class478 field582;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	static class478 field608;
	@ObfuscatedName("gz")
	String field568;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	class14 field569;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class18 field648;
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester field678;
	@ObfuscatedName("hj")
	Future field572;
	@ObfuscatedName("hh")
	boolean field573;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 255508409
	)
	int field574;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class18 field575;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field576;
	@ObfuscatedName("hz")
	Future field577;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	Buffer field613;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	class7 field583;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		longValue = 7631410939937701965L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field566 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field531 = -1;
		clientType = -1;
		field544 = -1;
		onMobile = false;
		revision = 216;
		gameState = 0;
		field537 = false;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field542 = -1;
		field543 = -1;
		field669 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		renderSelf = false;
		field558 = class92.field1169;
		js5ConnectState = 0;
		field560 = 0;
		js5Errors = 0;
		loginState = 0;
		field541 = 0;
		field592 = 0;
		field664 = 0;
		field776 = class139.field1653;
		field571 = class519.field5165;
		int var2 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var3 = new byte[var2];

		int var4;
		char var5;
		for (var4 = 0; var4 < var2; ++var4) {
			var5 = "com_jagex_auth_desktop_osrs:public".charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		String var0 = class11.method97(var3, 0, var3.length);
		field778 = var0;
		var2 = "com_jagex_auth_desktop_runelite:public".length();
		var3 = new byte[var2];

		for (var4 = 0; var4 < var2; ++var4) {
			var5 = "com_jagex_auth_desktop_runelite:public".charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		var0 = class11.method97(var3, 0, var3.length);
		field662 = var0;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536];
		field640 = 0;
		field737 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field596 = 0;
		field630 = 1;
		field598 = 0;
		field599 = 1;
		field600 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field711 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		graphicsCycle = 0;
		field607 = 2301979;
		field718 = 5063219;
		field609 = 3353893;
		field798 = 7759444;
		field611 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		field538 = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field621 = 0;
		field622 = 0;
		field623 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field626 = 0;
		field627 = false;
		field628 = 0;
		field629 = false;
		field668 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field535 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field651 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field655 = 0;
		userId = -1L;
		field764 = true;
		drawPlayerNames = 0;
		field796 = 0;
		field552 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuItemIds = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field689 = 0;
		field690 = 50;
		isItemSelected = 0;
		field692 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field540 = 0;
		field701 = -1;
		chatEffects = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field715 = false;
		field716 = -1;
		field717 = -1;
		field762 = false;
		field564 = -1;
		field636 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field726 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field793 = new int[32];
		field657 = 0;
		chatCycle = 0;
		field732 = 0;
		field733 = 0;
		field734 = 0;
		field735 = 0;
		field736 = 0;
		field597 = 0;
		field578 = 0;
		mouseWheelRotation = 0;
		field740 = new class532();
		scriptEvents = new NodeDeque();
		field727 = new NodeDeque();
		field743 = new NodeDeque();
		field780 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field747 = -2;
		validRootWidgets = new boolean[100];
		field749 = new boolean[100];
		field750 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field756 = 0L;
		isResizable = true;
		field758 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field554 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field674 = new class212();
		field765 = new class210();
		field766 = 0;
		field767 = new int[128];
		field768 = new int[128];
		field769 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field772 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field788 = false;
		field789 = false;
		field790 = false;
		field791 = null;
		field582 = null;
		field608 = null;
		field794 = false;
		field795 = new boolean[5];
		field588 = new int[5];
		field748 = new int[5];
		field658 = new int[5];
		field744 = new int[5];
		field800 = 256;
		field685 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field804 = 1;
		field635 = 32767;
		field806 = 1;
		field807 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field632 = -1;
		field815 = -1;
		field671 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		archive5 = new class423(8, class421.field4606);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64);
		field822 = -1;
		field649 = -1;
		field695 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field827 = 0;
		field828 = new ApproximateRouteStrategy();
		field829 = new int[50];
		field830 = new int[50];
	}

	public Client() {
		this.field573 = false;
		this.field574 = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field756 = GameEngine.method661() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "208117174"
	)
	@Export("setUp")
	protected final void setUp() {
		PacketBufferNode.method5707(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		class480.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class129.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class4.currentPort = class480.worldPort;
		UrlRequest.field1458 = class330.field3619;
		class140.field1659 = class330.field3623;
		PlayerComposition.field3578 = class330.field3621;
		PlayerComposition.field3586 = class330.field3622;
		FriendsChat.urlRequester = new class113(this.field573, 216);
		this.setUpKeyboard();
		this.method503();
		class12.mouseWheel = this.mouseWheel();
		this.method652(field765, 0);
		this.method652(field674, 1);
		class6.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = Decimator.getPreferencesFile("", WorldMapSectionType.field2997.name, false);
			byte[] var4 = new byte[(int)var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		class449.clientPreferences = var3;
		this.setUpClipboard();
		KeyHandler.method375(this, class18.field89);
		class270.setWindowedMode(class449.clientPreferences.method2470());
		class299.friendSystem = new FriendSystem(Language.loginType);
		this.field569 = new class14("tokenRequest", 1, 1);
		if (!class305.field3407.contains(this)) {
			class305.field3407.add(this);
		}

		class218.field2412 = new class216[1];
		class214 var9 = class214.field2381;
		class218.field2412[0] = new class216(var9.field2383, var9.field2388);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1753601126"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				boolean var5 = WorldMapArea.method5162();
				if (var5 && playingJingle && AddRequestTask.pcmPlayer1 != null) {
					AddRequestTask.pcmPlayer1.tryDiscard();
				}

				class301.method5721();
				field674.method4108();
				this.method501();
				synchronized(MouseHandler.MouseHandler_instance) {
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
					MouseHandler.MouseHandler_lastButtonVolatile = 0;
				}

				if (class12.mouseWheel != null) {
					int var6 = class12.mouseWheel.useRotation();
					mouseWheelRotation = var6;
				}

				if (gameState == 0) {
					ParamComposition.method3821();
					PacketWriter.method2798();
				} else if (gameState == 5) {
					GrandExchangeOfferWorldComparator.loginScreen(this, HealthBarUpdate.fontPlain11, SecureRandomCallable.fontPlain12);
					ParamComposition.method3821();
					PacketWriter.method2798();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						GrandExchangeOfferWorldComparator.loginScreen(this, HealthBarUpdate.fontPlain11, SecureRandomCallable.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						GrandExchangeOfferWorldComparator.loginScreen(this, HealthBarUpdate.fontPlain11, SecureRandomCallable.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						class370.method6926();
					}
				} else {
					GrandExchangeOfferWorldComparator.loginScreen(this, HealthBarUpdate.fontPlain11, SecureRandomCallable.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1944984067"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field756 && GameEngine.method661() > field756) {
			class270.setWindowedMode(class218.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class105.drawTitle(class59.fontBold12, HealthBarUpdate.fontPlain11, SecureRandomCallable.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class105.drawTitle(class59.fontBold12, HealthBarUpdate.fontPlain11, SecureRandomCallable.fontPlain12);
			} else if (gameState == 50) {
				class105.drawTitle(class59.fontBold12, HealthBarUpdate.fontPlain11, SecureRandomCallable.fontPlain12);
			} else if (gameState == 25) {
				if (field600 == 1) {
					if (field596 > field630) {
						field630 = field596;
					}

					var2 = (field630 * 50 - field596 * 50) / field630;
					FadeInTask.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field600 == 2) {
					if (field598 > field599) {
						field599 = field598;
					}

					var2 = (field599 * 50 - field598 * 50) / field599 + 50;
					FadeInTask.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					FadeInTask.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				FadeInTask.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				FadeInTask.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class105.drawTitle(class59.fontBold12, HealthBarUpdate.fontPlain11, SecureRandomCallable.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field749[var2]) {
					AttackOption.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field749[var2] = false;
				}
			}
		} else if (gameState > 0) {
			AttackOption.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field749[var2] = false;
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1298916795"
	)
	@Export("kill0")
	protected final void kill0() {
		if (KeyHandler.varcs.hasUnwrittenChanges()) {
			KeyHandler.varcs.write();
		}

		if (class126.mouseRecorder != null) {
			class126.mouseRecorder.isRunning = false;
		}

		class126.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		class12.mouseWheel = null;
		if (AddRequestTask.pcmPlayer1 != null) {
			AddRequestTask.pcmPlayer1.shutdown();
		}

		class308.field3462.method6800();
		class214.method4180();
		if (FriendsChat.urlRequester != null) {
			FriendsChat.urlRequester.close();
			FriendsChat.urlRequester = null;
		}

		class510.method8993();
		this.field569.method173();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1929688897"
	)
	protected final void vmethod1241() {
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "920896355"
	)
	boolean method1558() {
		return this.field574 == 1;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1597201922"
	)
	boolean method1246() {
		return class27.field144 != null && !class27.field144.trim().isEmpty() && class9.field40 != null && !class9.field40.trim().isEmpty();
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "106"
	)
	boolean method1428() {
		return class157.field1762 != null && !class157.field1762.trim().isEmpty() && Varcs.field1416 != null && !Varcs.field1416.trim().isEmpty();
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	boolean method1248() {
		return this.field678 != null;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1881627729"
	)
	void method1482(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class510.field5094 + "shield/oauth/token" + (new class463(var2)).method8343());
		class419 var4 = new class419();
		if (this.method1558()) {
			var4.method7720(field662);
		} else {
			var4.method7720(field778);
		}

		var4.method7717("Host", (new URL(class510.field5094)).getHost());
		var4.method7724(class460.field4772);
		class9 var5 = class9.field32;
		RefreshAccessTokenRequester var6 = this.field576;
		if (var6 != null) {
			this.field577 = var6.request(var5.method62(), var3, var4.method7716(), "");
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field573);
			this.field575 = this.field569.method165(var7);
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	void method1250(String var1) throws IOException {
		URL var2 = new URL(class510.field5094 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class419 var3 = new class419();
		var3.method7756(var1);
		class9 var4 = class9.field31;
		OtlTokenRequester var5 = this.field678;
		if (var5 != null) {
			this.field572 = var5.request(var4.method62(), var2, var3.method7716(), "");
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field573);
			this.field648 = this.field569.method165(var6);
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1347426796"
	)
	void method1416(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class510.field5094 + "game-session/v1/tokens");
		class10 var4 = new class10(var3, class9.field32, this.field573);
		var4.method85().method7756(var1);
		var4.method85().method7724(class460.field4772);
		JSONObject var5 = new JSONObject();
		var5.method8392("accountId", var2);
		var4.method78(new class462(var5));
		this.field648 = this.field569.method165(var4);
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "286321361"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = class308.field3462.method6797();
			if (!var1) {
				this.method1410();
			}

		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "375037576"
	)
	void method1410() {
		if (class308.field3462.field4300 >= 4) {
			this.error("js5crc");
			MusicSong.updateGameState(1000);
		} else {
			if (class308.field3462.field4323 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					MusicSong.updateGameState(1000);
					return;
				}

				field560 = 3000;
				class308.field3462.field4323 = 3;
			}

			if (--field560 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class126.js5SocketTask = GameEngine.taskHandler.newSocketTask(class292.worldHost, class4.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class126.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class126.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						Socket var2 = (Socket)class126.js5SocketTask.result;
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
						class59.js5Socket = var1;
						Buffer var3 = new Buffer(5);
						var3.writeByte(15);
						var3.writeInt(216);
						class59.js5Socket.write(var3.array, 0, 5);
						++js5ConnectState;
						class270.field3042 = GameEngine.method661();
					}

					if (js5ConnectState == 3) {
						if (class59.js5Socket.available() > 0) {
							int var4 = class59.js5Socket.readUnsignedByte();
							if (var4 != 0) {
								this.js5Error(var4);
								return;
							}

							++js5ConnectState;
						} else if (GameEngine.method661() - class270.field3042 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						class308.field3462.method6792(class59.js5Socket, gameState > 20);
						class126.js5SocketTask = null;
						class59.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var5) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "17"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class126.js5SocketTask = null;
		class59.js5Socket = null;
		js5ConnectState = 0;
		if (class4.currentPort == class480.worldPort) {
			class4.currentPort = class129.js5Port;
		} else {
			class4.currentPort = class480.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				MusicSong.updateGameState(1000);
			} else {
				field560 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			MusicSong.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				MusicSong.updateGameState(1000);
			} else {
				field560 = 3000;
			}
		}

	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (GraphicsObject.field905 == null && (secureRandomFuture.isDone() || field541 > 250)) {
					GraphicsObject.field905 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (GraphicsObject.field905 != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					VarcInt.field1976 = null;
					hadNetworkError = false;
					field541 = 0;
					if (field571.method9339()) {
						if (this.method1246()) {
							try {
								this.method1482(class9.field40);
								class316.method6012(21);
							} catch (Throwable var25) {
								Messages.RunException_sendStackTrace((String)null, var25);
								class387.getLoginError(65);
								return;
							}
						} else {
							if (!this.method1428()) {
								class387.getLoginError(65);
								return;
							}

							try {
								this.method1416(class157.field1762, Varcs.field1416);
								class316.method6012(20);
							} catch (Exception var24) {
								Messages.RunException_sendStackTrace((String)null, var24);
								class387.getLoginError(65);
								return;
							}
						}
					} else {
						class316.method6012(1);
					}
				}
			}

			class20 var27;
			if (loginState == 21) {
				if (this.field577 != null) {
					if (!this.field577.isDone()) {
						return;
					}

					if (this.field577.isCancelled()) {
						class387.getLoginError(65);
						this.field577 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field577.get();
						if (!var3.isSuccess()) {
							class387.getLoginError(65);
							this.field577 = null;
							return;
						}

						class27.field144 = var3.getAccessToken();
						class9.field40 = var3.getRefreshToken();
						this.field577 = null;
					} catch (Exception var23) {
						Messages.RunException_sendStackTrace((String)null, var23);
						class387.getLoginError(65);
						this.field577 = null;
						return;
					}
				} else {
					if (this.field575 == null) {
						class387.getLoginError(65);
						return;
					}

					if (!this.field575.method271()) {
						return;
					}

					if (this.field575.method276()) {
						Messages.RunException_sendStackTrace(this.field575.method286(), (Throwable)null);
						class387.getLoginError(65);
						this.field575 = null;
						return;
					}

					var27 = this.field575.method281();
					if (var27.method296() != 200) {
						class387.getLoginError(65);
						this.field575 = null;
						return;
					}

					field541 = 0;
					class462 var4 = new class462(var27.method299());

					try {
						class27.field144 = var4.method8332().getString("access_token");
						class9.field40 = var4.method8332().getString("refresh_token");
					} catch (Exception var22) {
						Messages.RunException_sendStackTrace("Error parsing tokens", var22);
						class387.getLoginError(65);
						this.field575 = null;
						return;
					}
				}

				this.method1250(class27.field144);
				class316.method6012(20);
			}

			if (loginState == 20) {
				if (this.field572 != null) {
					if (!this.field572.isDone()) {
						return;
					}

					if (this.field572.isCancelled()) {
						class387.getLoginError(65);
						this.field572 = null;
						return;
					}

					try {
						OtlTokenResponse var28 = (OtlTokenResponse)this.field572.get();
						if (!var28.isSuccess()) {
							class387.getLoginError(65);
							this.field572 = null;
							return;
						}

						this.field568 = var28.getToken();
						this.field572 = null;
					} catch (Exception var21) {
						Messages.RunException_sendStackTrace((String)null, var21);
						class387.getLoginError(65);
						this.field572 = null;
						return;
					}
				} else {
					if (this.field648 == null) {
						class387.getLoginError(65);
						return;
					}

					if (!this.field648.method271()) {
						return;
					}

					if (this.field648.method276()) {
						Messages.RunException_sendStackTrace(this.field648.method286(), (Throwable)null);
						class387.getLoginError(65);
						this.field648 = null;
						return;
					}

					var27 = this.field648.method281();
					if (var27.method296() != 200) {
						Messages.RunException_sendStackTrace("Response code: " + var27.method296() + "Response body: " + var27.method299(), (Throwable)null);
						class387.getLoginError(65);
						this.field648 = null;
						return;
					}

					List var30 = (List)var27.method298().get("Content-Type");
					if (var30 != null && var30.contains(class460.field4772.method8321())) {
						try {
							JSONObject var5 = new JSONObject(var27.method299());
							this.field568 = var5.getString("token");
						} catch (JSONException var20) {
							Messages.RunException_sendStackTrace((String)null, var20);
							class387.getLoginError(65);
							this.field648 = null;
							return;
						}
					} else {
						this.field568 = var27.method299();
					}

					this.field648 = null;
				}

				field541 = 0;
				class316.method6012(1);
			}

			if (loginState == 1) {
				if (VarcInt.field1976 == null) {
					VarcInt.field1976 = GameEngine.taskHandler.newSocketTask(class292.worldHost, class4.currentPort);
				}

				if (VarcInt.field1976.status == 2) {
					throw new IOException();
				}

				if (VarcInt.field1976.status == 1) {
					Socket var31 = (Socket)VarcInt.field1976.result;
					BufferedNetSocket var29 = new BufferedNetSocket(var31, 40000, 5000);
					var1 = var29;
					packetWriter.setSocket(var29);
					VarcInt.field1976 = null;
					class316.method6012(2);
				}
			}

			PacketBufferNode var33;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var33 = class146.method3131();
				var33.clientPacket = null;
				var33.clientPacketLength = 0;
				var33.packetBuffer = new PacketBuffer(5000);
				var33.packetBuffer.writeByte(LoginPacket.field3365.id);
				packetWriter.addNode(var33);
				packetWriter.flush();
				var2.offset = 0;
				class316.method6012(3);
			}

			int var13;
			if (loginState == 3) {
				if (AddRequestTask.pcmPlayer1 != null) {
					AddRequestTask.pcmPlayer1.method804();
				}

				if (((AbstractSocket)var1).isAvailable(1)) {
					var13 = ((AbstractSocket)var1).readUnsignedByte();
					if (AddRequestTask.pcmPlayer1 != null) {
						AddRequestTask.pcmPlayer1.method804();
					}

					if (var13 != 0) {
						class387.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					class316.method6012(4);
				}
			}

			if (loginState == 4) {
				if (var2.offset < 8) {
					var13 = ((AbstractSocket)var1).available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					class125.field1501 = var2.readLong();
					class316.method6012(5);
				}
			}

			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var32 = new PacketBuffer(500);
				int[] var35 = new int[]{GraphicsObject.field905.nextInt(), GraphicsObject.field905.nextInt(), GraphicsObject.field905.nextInt(), GraphicsObject.field905.nextInt()};
				var32.offset = 0;
				var32.writeByte(1);
				var32.writeInt(var35[0]);
				var32.writeInt(var35[1]);
				var32.writeInt(var35[2]);
				var32.writeInt(var35[3]);
				var32.writeLong(class125.field1501);
				if (gameState == 40) {
					var32.writeInt(NpcOverrides.field2029[0]);
					var32.writeInt(NpcOverrides.field2029[1]);
					var32.writeInt(NpcOverrides.field2029[2]);
					var32.writeInt(NpcOverrides.field2029[3]);
				} else {
					if (gameState == 50) {
						var32.writeByte(class139.field1648.rsOrdinal());
						var32.writeInt(class72.field906);
					} else {
						var32.writeByte(field776.rsOrdinal());
						switch(field776.field1651) {
						case 0:
							var32.writeInt(class449.clientPreferences.method2506(Login.Login_username));
						case 1:
						default:
							break;
						case 2:
						case 4:
							var32.writeMedium(class503.field5039);
							++var32.offset;
							break;
						case 3:
							var32.offset += 4;
						}
					}

					if (field571.method9339()) {
						var32.writeByte(class519.field5164.rsOrdinal());
						var32.writeStringCp1252NullTerminated(this.field568);
					} else {
						var32.writeByte(class519.field5165.rsOrdinal());
						var32.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var32.encryptRsa(class74.field925, class74.field928);
				NpcOverrides.field2029 = var35;
				PacketBufferNode var6 = class146.method3131();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(LoginPacket.field3360.id);
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3359.id);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(216);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field544);
				byte var8 = 0;
				var6.packetBuffer.writeByte(var8);
				var6.packetBuffer.writeBytes(var32.array, 0, var32.offset);
				int var9 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(class113.canvasWidth);
				var6.packetBuffer.writeShort(class177.canvasHeight);
				class177.method3495(var6.packetBuffer);
				var6.packetBuffer.writeStringCp1252NullTerminated(MusicPatchPcmStream.field3478);
				var6.packetBuffer.writeInt(WorldMapSectionType.field2996);
				if (revision > 213) {
					var6.packetBuffer.writeByte(0);
				}

				Buffer var10 = new Buffer(class18.platformInfo.size());
				class18.platformInfo.write(var10);
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.writeIntLE(class499.archive9.hash);
				var6.packetBuffer.writeIntLE(Tiles.field1038.hash);
				var6.packetBuffer.writeIntLE(class106.field1371.hash);
				var6.packetBuffer.writeIntLE(class147.field1691.hash);
				var6.packetBuffer.writeIntLE(class388.field4435.hash);
				var6.packetBuffer.writeIntIME(ObjectSound.archive4.hash);
				var6.packetBuffer.writeInt(class227.field2545.hash);
				var6.packetBuffer.writeIntME(class28.field161.hash);
				var6.packetBuffer.writeInt(AttackOption.field1351.hash);
				var6.packetBuffer.writeIntLE(class10.field46.hash);
				var6.packetBuffer.writeIntLE(0);
				var6.packetBuffer.writeIntIME(ClanChannelMember.field1676.hash);
				var6.packetBuffer.writeIntLE(Player.archive13.hash);
				var6.packetBuffer.writeIntME(class141.archive10.hash);
				var6.packetBuffer.writeIntLE(class1.archive2.hash);
				var6.packetBuffer.writeIntIME(class318.archive7.hash);
				var6.packetBuffer.writeIntME(class385.archive6.hash);
				var6.packetBuffer.writeInt(WorldMapElement.field1964.hash);
				var6.packetBuffer.writeIntME(Message.archive11.hash);
				var6.packetBuffer.writeIntIME(PcmPlayer.archive8.hash);
				var6.packetBuffer.writeInt(GrandExchangeOffer.archive12.hash);
				var6.packetBuffer.xteaEncrypt(var35, var9, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var35);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var35[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				class316.method6012(6);
			}

			int var14;
			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var13 = ((AbstractSocket)var1).readUnsignedByte();
				if (var13 == 61) {
					var14 = ((AbstractSocket)var1).available();
					ModeWhere.field4404 = var14 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
					class316.method6012(5);
				}

				if (var13 == 21 && gameState == 20) {
					class316.method6012(12);
				} else if (var13 == 2) {
					class316.method6012(14);
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class316.method6012(19);
				} else if (var13 == 64) {
					class316.method6012(10);
				} else if (var13 == 23 && field592 < 1) {
					++field592;
					class316.method6012(0);
				} else if (var13 == 29) {
					class316.method6012(17);
				} else {
					if (var13 != 69) {
						class387.getLoginError(var13);
						return;
					}

					class316.method6012(7);
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class12.field58 = var2.readUnsignedShort();
				class316.method6012(8);
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class12.field58) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class12.field58);
				class6 var34 = class303.method5741()[var2.readUnsignedByte()];

				try {
					switch(var34.field18) {
					case 0:
						class0 var38 = new class0();
						this.field583 = new class7(var2, var38);
						class316.method6012(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var19) {
					class387.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field583.method42()) {
				this.field613 = this.field583.method41();
				this.field583.method39();
				this.field583 = null;
				if (this.field613 == null) {
					class387.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var33 = class146.method3131();
				var33.clientPacket = null;
				var33.clientPacketLength = 0;
				var33.packetBuffer = new PacketBuffer(5000);
				var33.packetBuffer.writeByte(LoginPacket.field3361.id);
				var33.packetBuffer.writeShort(this.field613.offset);
				var33.packetBuffer.writeBuffer(this.field613);
				packetWriter.addNode(var33);
				packetWriter.flush();
				this.field613 = null;
				class316.method6012(6);
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				KeyHandler.field123 = ((AbstractSocket)var1).readUnsignedByte();
				class316.method6012(11);
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= KeyHandler.field123) {
				((AbstractSocket)var1).read(var2.array, 0, KeyHandler.field123);
				var2.offset = 0;
				class316.method6012(6);
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field664 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				class316.method6012(13);
			}

			if (loginState == 13) {
				field541 = 0;
				class318.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field664 / 60 + " seconds.");
				if (--field664 <= 0) {
					class316.method6012(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					class398.field4505 = ((AbstractSocket)var1).readUnsignedByte();
					class316.method6012(15);
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= class398.field4505) {
					boolean var44 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var43 = false;
					if (var44) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						class449.clientPreferences.method2471(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						class449.clientPreferences.method2465(Login.Login_username);
					} else {
						class449.clientPreferences.method2465((String)null);
					}

					class338.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field655 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					if (revision >= 214) {
						((AbstractSocket)var1).read(var2.array, 0, 8);
						var2.offset = 0;
						var2.readLong();
					}

					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var36 = class176.ServerPacket_values();
					int var15 = var2.readSmartByteShortIsaac();
					if (var15 < 0 || var15 >= var36.length) {
						throw new IOException(var15 + " " + var2.offset);
					}

					packetWriter.serverPacket = var36[var15];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var16 = class219.client;
						JSObject.getWindow(var16).call("zap", (Object[])null);
					} catch (Throwable var18) {
					}

					class316.method6012(16);
				}

				if (loginState != 16) {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class342.field3862 = var2.readUnsignedShort();
						class316.method6012(18);
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class342.field3862) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class342.field3862);
						var2.offset = 0;
						String var40 = var2.readStringCp1252NullTerminated();
						String var42 = var2.readStringCp1252NullTerminated();
						String var39 = var2.readStringCp1252NullTerminated();
						class318.setLoginResponseString(var40, var42, var39);
						MusicSong.updateGameState(10);
						if (field571.method9339()) {
							PcmPlayer.method838(9);
						}
					}

					if (loginState == 19) {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method7682();
							class105.method2689();
							Actor.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field541;
						if (field541 > 2000) {
							if (field592 < 1) {
								if (class480.worldPort == class4.currentPort) {
									class4.currentPort = class129.js5Port;
								} else {
									class4.currentPort = class480.worldPort;
								}

								++field592;
								class316.method6012(0);
							} else {
								class387.getLoginError(-3);
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method7686();
						mouseLastLastPressedTimeMillis = 1L;
						class126.mouseRecorder.index = 0;
						class370.hasFocus = true;
						hadFocus = true;
						field769 = -1L;
						GrandExchangeOfferTotalQuantityComparator.method6833();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1430 = null;
						packetWriter.field1436 = null;
						packetWriter.field1437 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1435 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						Frames.method4718();
						class20.method301(0);
						ChatChannel.method2199();
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						class390.field4441 = null;
						minimapState = 0;
						field772 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						Players.Players_count = 0;

						for (var13 = 0; var13 < 2048; ++var13) {
							Players.field1388[var13] = null;
							Players.field1377[var13] = class217.field2410;
						}

						for (var13 = 0; var13 < 2048; ++var13) {
							players[var13] = null;
						}

						for (var13 = 0; var13 < 65536; ++var13) {
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var13 = 0; var13 < 4; ++var13) {
							for (var14 = 0; var14 < 104; ++var14) {
								for (int var17 = 0; var17 < 104; ++var17) {
									groundItems[var13][var14][var17] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						class299.friendSystem.clear();

						for (var13 = 0; var13 < VarpDefinition.field1933; ++var13) {
							VarpDefinition var41 = ApproximateRouteStrategy.VarpDefinition_get(var13);
							if (var41 != null) {
								Varps.Varps_temp[var13] = 0;
								Varps.Varps_main[var13] = 0;
							}
						}

						KeyHandler.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							Skeleton.method4523(rootInterface);
						}

						for (InterfaceParent var37 = (InterfaceParent)interfaceParents.first(); var37 != null; var37 = (InterfaceParent)interfaceParents.next()) {
							class92.closeInterface(var37, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						Frames.method4718();
						playerAppearance.method6080((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

						for (var13 = 0; var13 < 8; ++var13) {
							playerMenuActions[var13] = null;
							playerOptionsPriorities[var13] = false;
						}

						LoginPacket.method5710();
						isLoading = true;

						for (var13 = 0; var13 < 100; ++var13) {
							validRootWidgets[var13] = true;
						}

						Message.method1217();
						ReflectionCheck.friendsChat = null;
						Players.guestClanSettings = null;
						Arrays.fill(currentClanSettings, (Object)null);
						VerticalAlignment.guestClanChannel = null;
						Arrays.fill(currentClanChannels, (Object)null);

						for (var13 = 0; var13 < 8; ++var13) {
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						class392.grandExchangeEvents = null;
						field537 = false;
						Actor.updatePlayer(var2);
						Tiles.field1037 = -1;
						WorldMapID.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var26) {
			if (field592 < 1) {
				if (class480.worldPort == class4.currentPort) {
					class4.currentPort = class129.js5Port;
				} else {
					class4.currentPort = class480.worldPort;
				}

				++field592;
				class316.method6012(0);
			} else {
				class387.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1704146678"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			Renderable.method4709();
		} else {
			if (!isMenuOpen) {
				class349.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
					boolean var29;
					if (var2 == null) {
						var29 = false;
					} else {
						var29 = true;
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) {
						PacketBufferNode var14;
						int var15;
						if (timer.field4568) {
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method7687();
						}

						int var4;
						int var5;
						synchronized(class126.mouseRecorder.lock) {
							if (!field566) {
								class126.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class126.mouseRecorder.index >= 40) {
								var30 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								int var6 = 0;

								int var7;
								for (var7 = 0; var7 < class126.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									int var8 = class126.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									int var9 = class126.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field542 || var8 != field543) {
										if (var30 == null) {
											var30 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3179, packetWriter.isaacCipher);
											var30.packetBuffer.writeByte(0);
											var3 = var30.packetBuffer.offset;
											PacketBuffer var10000 = var30.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										int var10;
										int var11;
										int var12;
										if (field669 != -1L) {
											var10 = var9 - field542;
											var11 = var8 - field543;
											var12 = (int)((class126.mouseRecorder.millis[var7] - field669) / 20L);
											var5 = (int)((long)var5 + (class126.mouseRecorder.millis[var7] - field669) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field542 = var9;
										field543 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var30.packetBuffer.writeByte(var12 + 128);
											var30.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var30.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field669 = class126.mouseRecorder.millis[var7];
									}
								}

								if (var30 != null) {
									var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
									var7 = var30.packetBuffer.offset;
									var30.packetBuffer.offset = var3;
									var30.packetBuffer.writeByte(var5 / var6);
									var30.packetBuffer.writeByte(var5 % var6);
									var30.packetBuffer.offset = var7;
									packetWriter.addNode(var30);
								}

								if (var4 >= class126.mouseRecorder.index) {
									class126.mouseRecorder.index = 0;
								} else {
									MouseRecorder var43 = class126.mouseRecorder;
									var43.index -= var4;
									System.arraycopy(class126.mouseRecorder.xs, var4, class126.mouseRecorder.xs, 0, class126.mouseRecorder.index);
									System.arraycopy(class126.mouseRecorder.ys, var4, class126.mouseRecorder.ys, 0, class126.mouseRecorder.index);
									System.arraycopy(class126.mouseRecorder.millis, var4, class126.mouseRecorder.millis, 0, class126.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !PlayerCompositionColorTextureOverride.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > class177.canvasHeight) {
								var3 = class177.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class113.canvasWidth) {
								var4 = class113.canvasWidth;
							}

							var5 = (int)var16;
							var18 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (mouseWheelRotation != 0) {
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3193, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var14);
						}

						if (field674.field2359 > 0) {
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = GameEngine.method661();

							for (var5 = 0; var5 < field674.field2359; ++var5) {
								long var21 = var19 - field769;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field769 = var19;
								var14.packetBuffer.writeByteNeg(field674.field2358[var5]);
								var14.packetBuffer.writeMediumLE((int)var21);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field628 > 0) {
							--field628;
						}

						if (field674.method4120(96) || field674.method4120(97) || field674.method4120(98) || field674.method4120(99)) {
							field629 = true;
						}

						if (field629 && field628 <= 0) {
							field628 = 20;
							field629 = false;
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(camAngleY);
							var14.packetBuffer.writeShortAddLE(camAngleX);
							packetWriter.addNode(var14);
						}

						if (class370.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!class370.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (Canvas.worldMap != null) {
							Canvas.worldMap.method8498();
						}

						if (SpotAnimationDefinition.ClanChat_inClanChat) {
							if (ReflectionCheck.friendsChat != null) {
								ReflectionCheck.friendsChat.sort();
							}

							for (var1 = 0; var1 < Players.Players_count; ++var1) {
								Player var31 = players[Players.Players_indices[var1]];
								var31.clearIsInFriendsChat();
							}

							SpotAnimationDefinition.ClanChat_inClanChat = false;
						}

						AddRequestTask.method7574();
						class164.method3324();
						if (gameState != 30) {
							return;
						}

						Ignored.method7992();
						Canvas.method324();
						++packetWriter.field1435;
						if (packetWriter.field1435 > 750) {
							Renderable.method4709();
							return;
						}

						var1 = Players.Players_count;
						int[] var32 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var23 = players[var32[var3]];
							if (var23 != null) {
								class318.updateActorSequence(var23, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var24 = npcs[var15];
							if (var24 != null) {
								class318.updateActorSequence(var24, var24.definition.size);
							}
						}

						WorldMapRenderer.method5342();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var35 = class146.mousedOverWidgetIf1;
						Widget var33 = class343.field3868;
						class146.mousedOverWidgetIf1 = null;
						class343.field3868 = null;
						draggedOnWidget = null;
						field762 = false;
						field715 = false;
						field766 = 0;

						while (field674.method4124() && field766 < 128) {
							if (staffModLevel >= 2 && field674.method4120(82) && field674.field2369 == 66) {
								StringBuilder var38 = new StringBuilder();

								Message var36;
								for (Iterator var25 = Messages.Messages_hashTable.iterator(); var25.hasNext(); var38.append(var36.text).append('\n')) {
									var36 = (Message)var25.next();
									if (var36.sender != null && !var36.sender.isEmpty()) {
										var38.append(var36.sender).append(':');
									}
								}

								String var40 = var38.toString();
								class219.client.method498(var40);
							} else if (oculusOrbState != 1 || field674.field2356 <= 0) {
								field768[field766] = field674.field2369;
								field767[field766] = field674.field2356;
								++field766;
							}
						}

						boolean var34 = staffModLevel >= 2;
						if (var34 && field674.method4120(82) && field674.method4120(81) && mouseWheelRotation != 0) {
							var4 = VarbitComposition.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != VarbitComposition.localPlayer.plane) {
								NPC.method2637(VarbitComposition.localPlayer.pathX[0] + UrlRequester.baseX * 64, VarbitComposition.localPlayer.pathY[0] + class47.baseY * 64, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (MouseHandler.MouseHandler_lastButton == 1) {
							field765.method4092();
						}

						if (rootInterface != -1) {
							LoginScreenAnimation.updateRootInterface(rootInterface, 0, 0, class113.canvasWidth, class177.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var37;
							ScriptEvent var39;
							Widget var42;
							do {
								var39 = (ScriptEvent)field727.removeLast();
								if (var39 == null) {
									while (true) {
										do {
											var39 = (ScriptEvent)field743.removeLast();
											if (var39 == null) {
												while (true) {
													do {
														var39 = (ScriptEvent)scriptEvents.removeLast();
														if (var39 == null) {
															while (true) {
																class211 var41 = (class211)field780.removeLast();
																if (var41 == null) {
																	this.menu();
																	WorldMapRectangle.method5478();
																	if (clickedWidget != null) {
																		this.method1273();
																	}

																	if (Scene.shouldSendWalk()) {
																		var4 = Scene.Scene_selectedX;
																		var5 = Scene.Scene_selectedY;
																		var18 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																		var18.packetBuffer.writeByte(5);
																		var18.packetBuffer.writeShortAddLE(UrlRequester.baseX * 64 + var4);
																		var18.packetBuffer.writeShortAdd(class47.baseY * 64 + var5);
																		var18.packetBuffer.writeByteSub(field674.method4120(82) ? (field674.method4120(81) ? 2 : 1) : 0);
																		packetWriter.addNode(var18);
																		Scene.method4666();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var4;
																		destinationY = var5;
																	}

																	if (var35 != class146.mousedOverWidgetIf1) {
																		if (var35 != null) {
																			class218.invalidateWidget(var35);
																		}

																		if (class146.mousedOverWidgetIf1 != null) {
																			class218.invalidateWidget(class146.mousedOverWidgetIf1);
																		}
																	}

																	if (var33 != class343.field3868 && field689 == field690) {
																		if (var33 != null) {
																			class218.invalidateWidget(var33);
																		}

																		if (class343.field3868 != null) {
																			class218.invalidateWidget(class343.field3868);
																		}
																	}

																	if (class343.field3868 != null) {
																		if (field689 < field690) {
																			++field689;
																			if (field689 == field690) {
																				class218.invalidateWidget(class343.field3868);
																			}
																		}
																	} else if (field689 > 0) {
																		--field689;
																	}

																	class415.method7709();
																	if (field794) {
																		class126.method2942(FontName.field4962, KeyHandler.field124, class31.field173);
																		class416.method7711(UserComparator4.field1459, VertexNormal.field2800);
																		if (NPCComposition.cameraX == FontName.field4962 && class133.cameraY == KeyHandler.field124 && class139.cameraZ == class31.field173 && class129.cameraPitch == UserComparator4.field1459 && UserComparator10.cameraYaw == VertexNormal.field2800) {
																			field794 = false;
																			isCameraLocked = false;
																			field788 = false;
																			field789 = false;
																			PendingSpawn.field1182 = 0;
																			VarbitComposition.field2127 = 0;
																			MusicPatchNode2.field3397 = 0;
																			class33.field188 = 0;
																			WorldMapElement.field1963 = 0;
																			MouseHandler.field252 = 0;
																			class344.field3874 = 0;
																			Players.field1374 = 0;
																			class33.field180 = 0;
																			VarpDefinition.field1937 = 0;
																			field791 = null;
																			field608 = null;
																			field582 = null;
																		}
																	} else if (isCameraLocked) {
																		class140.method3093();
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		int var10002 = field744[var4]++;
																	}

																	KeyHandler.varcs.tryWrite();
																	var4 = MusicPatchPcmStream.method5994();
																	var5 = GameEngine.keyHandler.method345();
																	PacketBufferNode var26;
																	if (var4 > 15000 && var5 > 15000) {
																		logoutTimer = 250;
																		class20.method301(14500);
																		var26 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var26);
																	}

																	class299.friendSystem.processFriendUpdates();
																	FileSystem.method3491();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var26 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var26);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var27) {
																		Renderable.method4709();
																	}

																	return;
																}

																ClanChannel.method3321(var41);
															}
														}

														var42 = var39.widget;
														if (var42.childIndex < 0) {
															break;
														}

														var37 = class92.getWidget(var42.parentId);
													} while(var37 == null || var37.children == null || var42.childIndex >= var37.children.length || var42 != var37.children[var42.childIndex]);

													WorldMapSection1.runScriptEvent(var39);
												}
											}

											var42 = var39.widget;
											if (var42.childIndex < 0) {
												break;
											}

											var37 = class92.getWidget(var42.parentId);
										} while(var37 == null || var37.children == null || var42.childIndex >= var37.children.length || var42 != var37.children[var42.childIndex]);

										WorldMapSection1.runScriptEvent(var39);
									}
								}

								var42 = var39.widget;
								if (var42.childIndex < 0) {
									break;
								}

								var37 = class92.getWidget(var42.parentId);
							} while(var37 == null || var37.children == null || var42.childIndex >= var37.children.length || var42 != var37.children[var42.childIndex]);

							WorldMapSection1.runScriptEvent(var39);
						}
					}

					var30 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var30.packetBuffer.writeByte(0);
					var3 = var30.packetBuffer.offset;
					SceneTilePaint.performReflectionCheck(var30.packetBuffer);
					var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
					packetWriter.addNode(var30);
				}
			}
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-9429"
	)
	public void vmethod5967(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class449.clientPreferences.method2451() > 0 && !playingJingle) {
				PacketBufferNode var3 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3200, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "347895574"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class113.canvasWidth;
		int var2 = class177.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class449.clientPreferences != null) {
			try {
				class26.method381(class219.client, "resize", new Object[]{class218.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class316.method6011(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field749[var1] = true;
			}

			field750[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field747 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class36.drawWidgets(rootInterface, 0, 0, class113.canvasWidth, class177.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class152.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class152.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = menuOptionsCount - 1;
					String var13;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var13 = "Use" + " " + field692 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var13 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var13 = class181.method3532(var3);
					}

					if (menuOptionsCount > 2) {
						var13 = var13 + class217.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class59.fontBold12.drawRandomAlphaAndSpacing(var13, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			var1 = class12.menuX;
			var2 = class419.menuY;
			var3 = class316.menuWidth;
			int var4 = Occluder.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			class59.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			int var8;
			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) {
				var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31;
				var10 = 16777215;
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				class59.fontBold12.draw(class181.method3532(var8), var1 + 3, var9, var10, 0);
			}

			var8 = class12.menuX;
			var9 = class419.menuY;
			var10 = class316.menuWidth;
			int var11 = Occluder.menuHeight;

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
				if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var9 + var11) {
					field749[var12] = true;
				}
			}
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field750[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field749[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class131.method3031(HealthBar.Client_plane, VarbitComposition.localPlayer.x, VarbitComposition.localPlayer.y, graphicsCycle);
		graphicsCycle = 0;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Ler;II)Z",
		garbageValue = "692591213"
	)
	boolean method1617(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			ReflectionCheck.friendsChat = null;
		} else {
			if (ReflectionCheck.friendsChat == null) {
				ReflectionCheck.friendsChat = new FriendsChat(Language.loginType, class219.client);
			}

			ReflectionCheck.friendsChat.method7837(var1.packetBuffer, var2);
		}

		field733 = cycleCntr;
		SpotAnimationDefinition.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ler;I)Z",
		garbageValue = "-1865308830"
	)
	boolean method1266(PacketWriter var1) {
		if (ReflectionCheck.friendsChat != null) {
			ReflectionCheck.friendsChat.method7838(var1.packetBuffer);
		}

		field733 = cycleCntr;
		SpotAnimationDefinition.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ler;I)Z",
		garbageValue = "-1722622027"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1432) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1435 = 0;
						var1.field1432 = false;
					}

					var3.offset = 0;
					if (var3.method9001()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1435 = 0;
					}

					var1.field1432 = true;
					ServerPacket[] var4 = class176.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1435 = 0;
				timer.method7683();
				var1.field1437 = var1.field1436;
				var1.field1436 = var1.field1430;
				var1.field1430 = var1.serverPacket;
				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class128.privateChatMode = DevicePcmPlayerProvider.method317(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				int var9;
				int var10;
				int var13;
				int var15;
				int var56;
				int var59;
				int var68;
				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method9226();
					var68 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var68 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var9 = var3.readUnsignedByteSub();
					var10 = var9 >> 2;
					var56 = var9 & 3;
					var59 = field711[var10];
					var13 = var3.readUnsignedShort();
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
						if (var59 == 0) {
							BoundaryObject var67 = class130.scene.method4547(HealthBar.Client_plane, var7, var8);
							if (var67 != null) {
								var15 = InvDefinition.Entity_unpackID(var67.tag);
								if (var10 == 2) {
									var67.renderable1 = new DynamicObject(var15, 2, var56 + 4, HealthBar.Client_plane, var7, var8, var13, false, var67.renderable1);
									var67.renderable2 = new DynamicObject(var15, 2, var56 + 1 & 3, HealthBar.Client_plane, var7, var8, var13, false, var67.renderable2);
								} else {
									var67.renderable1 = new DynamicObject(var15, var10, var56, HealthBar.Client_plane, var7, var8, var13, false, var67.renderable1);
								}
							}
						} else if (var59 == 1) {
							WallDecoration var66 = class130.scene.method4548(HealthBar.Client_plane, var7, var8);
							if (var66 != null) {
								var15 = InvDefinition.Entity_unpackID(var66.tag);
								if (var10 != 4 && var10 != 5) {
									if (var10 == 6) {
										var66.renderable1 = new DynamicObject(var15, 4, var56 + 4, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable1);
									} else if (var10 == 7) {
										var66.renderable1 = new DynamicObject(var15, 4, (var56 + 2 & 3) + 4, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable1);
									} else if (var10 == 8) {
										var66.renderable1 = new DynamicObject(var15, 4, var56 + 4, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable1);
										var66.renderable2 = new DynamicObject(var15, 4, (var56 + 2 & 3) + 4, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable2);
									}
								} else {
									var66.renderable1 = new DynamicObject(var15, 4, var56, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable1);
								}
							}
						} else if (var59 == 2) {
							GameObject var64 = class130.scene.getGameObject(HealthBar.Client_plane, var7, var8);
							if (var10 == 11) {
								var10 = 10;
							}

							if (var64 != null) {
								var64.renderable = new DynamicObject(InvDefinition.Entity_unpackID(var64.tag), var10, var56, HealthBar.Client_plane, var7, var8, var13, false, var64.renderable);
							}
						} else if (var59 == 3) {
							FloorDecoration var65 = class130.scene.getFloorDecoration(HealthBar.Client_plane, var7, var8);
							if (var65 != null) {
								var65.renderable = new DynamicObject(InvDefinition.Entity_unpackID(var65.tag), 22, var56, HealthBar.Client_plane, var7, var8, var13, false, var65.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var76;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var68 = var3.readInt();
					var76 = class92.getWidget(var68);
					var76.modelType = 3;
					var76.modelId = VarbitComposition.localPlayer.appearance.getChatHeadId();
					class218.invalidateWidget(var76);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field794 = false;
					isCameraLocked = false;
					field788 = false;
					field789 = false;
					PendingSpawn.field1182 = 0;
					VarbitComposition.field2127 = 0;
					MusicPatchNode2.field3397 = 0;
					field790 = false;
					class33.field188 = 0;
					WorldMapElement.field1963 = 0;
					MouseHandler.field252 = 0;
					class344.field3874 = 0;
					Players.field1374 = 0;
					class33.field180 = 0;
					VarpDefinition.field1937 = 0;
					field791 = null;
					field608 = null;
					field582 = null;

					for (var68 = 0; var68 < 5; ++var68) {
						field795[var68] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3284 == var1.serverPacket) {
					class139.field1654 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var68 = var3.readInt();
					var5 = var3.readInt();
					var6 = WorldMapRenderer.getGcDuration();
					PacketBufferNode var79 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var79.packetBuffer.writeByte(GameEngine.fps);
					var79.packetBuffer.writeIntLE(var68);
					var79.packetBuffer.writeIntIME(var5);
					var79.packetBuffer.writeByteAdd(var6);
					packetWriter.addNode(var79);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3253 == var1.serverPacket) {
					class113.method2843();
					weight = var3.readShort();
					field578 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3303 == var1.serverPacket) {
					World.method1806(class295.field3208);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var68 = var3.readUnsignedShortLE();
					KeyHandler.method376(var68);
					changedItemContainers[++field726 - 1 & 31] = var68 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3345 == var1.serverPacket) {
					World.method1806(class295.field3212);
					var1.serverPacket = null;
					return true;
				}

				boolean var11;
				byte var20;
				long var23;
				long var25;
				long var27;
				String var30;
				int var85;
				if (ServerPacket.field3333 == var1.serverPacket) {
					var20 = var3.readByte();
					var23 = (long)var3.readUnsignedShort();
					var25 = (long)var3.readMedium();
					var27 = (var23 << 32) + var25;
					var11 = false;
					ClanChannel var81 = var20 >= 0 ? currentClanChannels[var20] : VerticalAlignment.guestClanChannel;
					if (var81 == null) {
						var11 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var27) {
								var11 = true;
								break;
							}
						}
					}

					if (!var11) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var27;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var30 = DirectByteArrayCopier.method6579(var3);
						var85 = var20 >= 0 ? 43 : 46;
						class416.addChatMessage(var85, "", var30, var81.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					UserComparator8.updatePlayers(var3, var1.serverPacketLength);
					class383.method7144();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3276 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field789 = true;
					PendingSpawn.field1182 = var3.readUnsignedByte() * 128;
					VarbitComposition.field2127 = var3.readUnsignedByte() * 16384;
					MusicPatchNode2.field3397 = var3.readUnsignedShort();
					var68 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = PendingSpawn.field1182 * 16384 + 64;
					var7 = VarbitComposition.field2127 * 128 + 64;
					var8 = class18.getTileHeight(var6, var7, HealthBar.Client_plane) - MusicPatchNode2.field3397;
					var9 = var6 - NPCComposition.cameraX;
					var10 = var8 - class133.cameraY;
					var56 = var7 - class139.cameraZ;
					double var84 = Math.sqrt((double)(var56 * var56 + var9 * var9));
					var85 = UserComparator8.method2875((int)(Math.atan2((double)var10, var84) * 325.9490051269531D) & 2047);
					var15 = class7.method53((int)(Math.atan2((double)var9, (double)var56) * -325.9490051269531D) & 2047);
					field608 = new class478(class129.cameraPitch, var85, var68, var5);
					field582 = new class478(UserComparator10.cameraYaw, var15, var68, var5);
					var1.serverPacket = null;
					return true;
				}

				long var32;
				InterfaceParent var74;
				if (ServerPacket.field3325 == var1.serverPacket) {
					var68 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class19.Widget_resetModelFrames(rootInterface);
						class217.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var88;
					for (; var6-- > 0; var88.field1081 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var88 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var88 != null && var8 != var88.group) {
							class92.closeInterface(var88, true);
							var88 = null;
						}

						if (var88 == null) {
							var88 = class339.openInterface(var7, var8, var9);
						}
					}

					for (var74 = (InterfaceParent)interfaceParents.first(); var74 != null; var74 = (InterfaceParent)interfaceParents.next()) {
						if (var74.field1081) {
							var74.field1081 = false;
						} else {
							class92.closeInterface(var74, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var68) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var56 = var8; var56 <= var9; ++var56) {
							var32 = ((long)var7 << 32) + (long)var56;
							widgetFlags.put(new IntegerNode(var10), var32);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var93;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var68 = var3.readInt();
					var5 = var3.readUnsignedIntLE();
					InterfaceParent var97 = (InterfaceParent)interfaceParents.get((long)var5);
					var74 = (InterfaceParent)interfaceParents.get((long)var68);
					if (var74 != null) {
						class92.closeInterface(var74, var97 == null || var74.group != var97.group);
					}

					if (var97 != null) {
						var97.remove();
						interfaceParents.put(var97, (long)var68);
					}

					var93 = class92.getWidget(var5);
					if (var93 != null) {
						class218.invalidateWidget(var93);
					}

					var93 = class92.getWidget(var68);
					if (var93 != null) {
						class218.invalidateWidget(var93);
						Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var93.id >>> 16], var93, true);
					}

					if (rootInterface != -1) {
						class385.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3297 == var1.serverPacket) {
					WorldMapSection2.method5103();
					var20 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var20 >= 0) {
							currentClanSettings[var20] = null;
						} else {
							Players.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var20 >= 0) {
						currentClanSettings[var20] = new ClanSettings(var3);
					} else {
						Players.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var68 = var3.readInt();
					InterfaceParent var78 = (InterfaceParent)interfaceParents.get((long)var68);
					if (var78 != null) {
						class92.closeInterface(var78, true);
					}

					if (meslayerContinueWidget != null) {
						class218.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedShort();
					var6 = var3.method9226();
					var68 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var68 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var10 = var3.readUnsignedByteAdd();
					var56 = var3.readUnsignedShortAdd();
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var29 = new GraphicsObject(var9, HealthBar.Client_plane, var7, var8, class18.getTileHeight(var7, var8, HealthBar.Client_plane) - var10, var56, cycle);
						graphicsObjects.addFirst(var29);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3329 == var1.serverPacket) {
					field735 = cycleCntr;
					var20 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var20 >= 0) {
							currentClanChannels[var20] = null;
						} else {
							VerticalAlignment.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var20 >= 0) {
						currentClanChannels[var20] = new ClanChannel(var3);
					} else {
						VerticalAlignment.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3244 == var1.serverPacket) {
					World.method1806(class295.field3217);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3340 == var1.serverPacket) {
					World.method1806(class295.field3218);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3348 == var1.serverPacket) {
					var68 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedByteSub();
					if (var68 == 65535) {
						var68 = -1;
					}

					LoginType.performPlayerAnimation(VarbitComposition.localPlayer, var68, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					WorldMapID.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						class385.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var71;
				if (ServerPacket.field3265 == var1.serverPacket) {
					var68 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortAdd();
					var71 = class92.getWidget(var68);
					var71.field3741 = var6 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				int var16;
				String var43;
				if (ServerPacket.field3334 == var1.serverPacket) {
					var20 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var37 = (long)var3.readUnsignedShort();
					long var39 = (long)var3.readMedium();
					PlayerType var87 = (PlayerType)KeyHandler.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte());
					long var41 = (var37 << 32) + var39;
					boolean var63 = false;
					ClanChannel var14 = null;
					var14 = var20 >= 0 ? currentClanChannels[var20] : VerticalAlignment.guestClanChannel;
					if (var14 == null) {
						var63 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var87.isUser && class299.friendSystem.isIgnored(new Username(var21, Language.loginType))) {
									var63 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var41) {
								var63 = true;
								break;
							}

							++var15;
						}
					}

					if (!var63) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var43 = AbstractFont.escapeBrackets(DirectByteArrayCopier.method6579(var3));
						var16 = var20 >= 0 ? 41 : 44;
						if (var87.modIcon != -1) {
							class416.addChatMessage(var16, Tile.method4373(var87.modIcon) + var21, var43, var14.name);
						} else {
							class416.addChatMessage(var16, var21, var43, var14.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class27.method423(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				String var51;
				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedByteSub();
					if (var6 >= 1 && var6 <= 8) {
						if (var51.equalsIgnoreCase("null")) {
							var51 = null;
						}

						playerMenuActions[var6 - 1] = var51;
						playerOptionsPriorities[var6 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var68 = var3.readUnsignedShort();
					if (var68 == 65535) {
						var68 = -1;
					}

					WorldMapSection1.playSong(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3313 == var1.serverPacket) {
					var68 = var3.readUnsignedShortAddLE();
					if (var68 == 65535) {
						var68 = -1;
					}

					var5 = var3.method9216();
					Login.method2136(var68, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					ArchiveDisk.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3327 == var1.serverPacket) {
					var68 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedShortAddLE();
					var74 = (InterfaceParent)interfaceParents.get((long)var68);
					if (var74 != null) {
						class92.closeInterface(var74, var6 != var74.group);
					}

					class339.openInterface(var68, var6, var5);
					var1.serverPacket = null;
					return true;
				}

				boolean var80;
				Widget var89;
				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var80 = var3.readUnsignedByteNeg() == 1;
					var5 = var3.readInt();
					var89 = class92.getWidget(var5);
					if (var80 != var89.isHidden) {
						var89.isHidden = var80;
						class218.invalidateWidget(var89);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var68 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedIntME();
					var7 = var3.readUnsignedShort();
					var93 = class92.getWidget(var6);
					if (var7 != var93.modelAngleX || var68 != var93.modelAngleY || var5 != var93.modelZoom) {
						var93.modelAngleX = var7;
						var93.modelAngleY = var68;
						var93.modelZoom = var5;
						class218.invalidateWidget(var93);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var68 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntIME();
					var89 = class92.getWidget(var5);
					if (var89.modelType != 1 || var68 != var89.modelId) {
						var89.modelType = 1;
						var89.modelId = var68;
						class218.invalidateWidget(var89);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3233 == var1.serverPacket) {
					World.method1806(class295.field3214);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3278 == var1.serverPacket) {
					var8 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortLE();
					var68 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					if (var68 == 65535) {
						var68 = -1;
					}

					ArrayList var98 = new ArrayList();
					var98.add(var68);
					class157.method3261(var98, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3254 == var1.serverPacket) {
					World.method1806(class295.field3207);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3252 == var1.serverPacket) {
					class299.friendSystem.method1856();
					field732 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				String var94;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var54 = new byte[var1.serverPacketLength];
					var3.method9002(var54, 0, var54.length);
					Buffer var77 = new Buffer(var54);
					var94 = var77.readStringCp1252NullTerminated();
					class30.openURL(var94, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var53 = new World();
					var53.host = var3.readStringCp1252NullTerminated();
					var53.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var53.properties = var5;
					if (var53.isDeadman()) {
						var53.field847 = "beta";
					}

					MusicSong.updateGameState(45);
					var2.close();
					var2 = null;
					ModeWhere.changeWorld(var53);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAdd() * 30;
					field578 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3240 == var1.serverPacket) {
					var68 = var3.readUnsignedShort();
					if (var68 == 65535) {
						var68 = -1;
					}

					rootInterface = var68;
					this.resizeRoot(false);
					class19.Widget_resetModelFrames(var68);
					class217.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3339 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field788 = true;
					Players.field1374 = var3.readUnsignedByte() * 128;
					class33.field180 = var3.readUnsignedByte() * 16384;
					var68 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field790 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = Players.field1374 * 16384 + 64;
					var8 = class33.field180 * 128 + 64;
					boolean var62 = false;
					boolean var60 = false;
					if (field790) {
						var9 = class133.cameraY;
						var10 = class18.getTileHeight(var7, var8, HealthBar.Client_plane) - var68;
					} else {
						var9 = class18.getTileHeight(NPCComposition.cameraX, class139.cameraZ, HealthBar.Client_plane) - class133.cameraY;
						var10 = var68;
					}

					field791 = new class477(NPCComposition.cameraX, class139.cameraZ, var9, var7, var8, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					WorldMapID.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var68 = var3.readUnsignedIntLE();
					var76 = class92.getWidget(var68);

					for (var6 = 0; var6 < var76.itemIds.length; ++var6) {
						var76.itemIds[var6] = -1;
						var76.itemIds[var6] = 0;
					}

					class218.invalidateWidget(var76);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var68 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					var89 = class92.getWidget(var5);
					if (var89 != null && var89.type == 0) {
						if (var68 > var89.scrollHeight - var89.height) {
							var68 = var89.scrollHeight - var89.height;
						}

						if (var68 < 0) {
							var68 = 0;
						}

						if (var68 != var89.scrollY) {
							var89.scrollY = var68;
							class218.invalidateWidget(var89);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByte();
					publicChatMode = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field789 = false;
					PendingSpawn.field1182 = var3.readUnsignedByte() * 128;
					VarbitComposition.field2127 = var3.readUnsignedByte() * 16384;
					MusicPatchNode2.field3397 = var3.readUnsignedShort();
					class33.field188 = var3.readUnsignedByte();
					WorldMapElement.field1963 = var3.readUnsignedByte();
					if (WorldMapElement.field1963 >= 100) {
						var68 = PendingSpawn.field1182 * 16384 + 64;
						var5 = VarbitComposition.field2127 * 128 + 64;
						var6 = class18.getTileHeight(var68, var5, HealthBar.Client_plane) - MusicPatchNode2.field3397;
						var7 = var68 - NPCComposition.cameraX;
						var8 = var6 - class133.cameraY;
						var9 = var5 - class139.cameraZ;
						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
						class129.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
						UserComparator10.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (class129.cameraPitch < 128) {
							class129.cameraPitch = 128;
						}

						if (class129.cameraPitch > 383) {
							class129.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3282 == var1.serverPacket) {
					return this.method1617(var1, 1);
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 4;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3249 == var1.serverPacket) {
					WorldMapSection2.method5103();
					var20 = var3.readByte();
					class146 var75 = new class146(var3);
					ClanSettings var96;
					if (var20 >= 0) {
						var96 = currentClanSettings[var20];
					} else {
						var96 = Players.guestClanSettings;
					}

					if (var96 == null) {
						this.method1276(var20);
						var1.serverPacket = null;
						return true;
					}

					if (var75.field1682 > var96.field1745) {
						this.method1276(var20);
						var1.serverPacket = null;
						return true;
					}

					if (var75.field1682 < var96.field1745) {
						var1.serverPacket = null;
						return true;
					}

					var75.method3124(var96);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3344 == var1.serverPacket) {
					World.method1806(class295.field3213);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var68 = var3.method9063();
					var5 = var3.readInt();
					var6 = var3.readShort();
					var71 = class92.getWidget(var5);
					if (var6 != var71.rawX || var68 != var71.rawY || var71.xAlignment != 0 || var71.yAlignment != 0) {
						var71.rawX = var6;
						var71.rawY = var68;
						var71.xAlignment = 0;
						var71.yAlignment = 0;
						class218.invalidateWidget(var71);
						this.alignWidget(var71);
						if (var71.type == 0) {
							Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var5 >> 16], var71, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3343 == var1.serverPacket) {
					var68 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntIME();
					var89 = class92.getWidget(var5);
					ReflectionCheck.method710(var89, var68);
					class218.invalidateWidget(var89);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3309 == var1.serverPacket) {
					var68 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var89 = class92.getWidget(var5);
					if (var89.modelType != 6 || var68 != var89.modelId) {
						var89.modelType = 6;
						var89.modelId = var68;
						class218.invalidateWidget(var89);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					byte var58 = var3.readByteAdd();
					var85 = var3.readUnsignedByteNeg() * 4;
					byte var57 = var3.readByteAdd();
					var59 = var3.readUnsignedShortAdd();
					var56 = var3.method9192();
					var16 = var3.readUnsignedShortLE();
					var13 = var3.readUnsignedByteAdd() * 4;
					var15 = var3.readUnsignedShortAddLE();
					var6 = var3.method9226();
					var68 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var68 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					int var18 = var3.readUnsignedByte();
					int var17 = var3.readUnsignedByteSub();
					var9 = var58 + var7;
					var10 = var57 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var59 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var9 = var9 * 128 + 64;
						var10 = var10 * 128 + 64;
						Projectile var19 = new Projectile(var59, HealthBar.Client_plane, var7, var8, class18.getTileHeight(var7, var8, HealthBar.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var56, var85);
						var19.setDestination(var9, var10, class18.getTileHeight(var9, var10, HealthBar.Client_plane) - var85, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3318 == var1.serverPacket) {
					class139.field1654 = new class454(SwapSongTask.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3289 == var1.serverPacket) {
					ObjectSound.field855 = var3.readUnsignedByteNeg();
					class125.field1499 = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3351 == var1.serverPacket) {
					for (var68 = 0; var68 < players.length; ++var68) {
						if (players[var68] != null) {
							players[var68].sequence = -1;
						}
					}

					for (var68 = 0; var68 < npcs.length; ++var68) {
						if (npcs[var68] != null) {
							npcs[var68].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					Frames.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					NPCComposition.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					Frames.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3271 == var1.serverPacket) {
					var68 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedIntLE();
					var71 = class92.getWidget(var6);
					Tiles.method2242(var71, var5, var68);
					class218.invalidateWidget(var71);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3287 == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var68 = var3.readUnsignedShortLE();
					Script.method2180(var68, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3336 == var1.serverPacket) {
					var80 = var3.readBoolean();
					if (var80) {
						if (class390.field4441 == null) {
							class390.field4441 = new class369();
						}
					} else {
						class390.field4441 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3307 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field789 = true;
					var68 = class7.method53(var3.readShort() & 2027);
					var5 = UserComparator8.method2875(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field608 = new class478(class129.cameraPitch, var5, var6, var7);
					field582 = new class478(UserComparator10.cameraYaw, var68, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3269 == var1.serverPacket) {
					return this.method1266(var1);
				}

				if (ServerPacket.field3248 == var1.serverPacket) {
					World.method1806(class295.field3209);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3258 == var1.serverPacket) {
					var68 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntME();
					var7 = var3.readUnsignedShortAddLE();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var8 = var7; var8 <= var5; ++var8) {
						var27 = ((long)var6 << 32) + (long)var8;
						Node var99 = widgetFlags.get(var27);
						if (var99 != null) {
							var99.remove();
						}

						widgetFlags.put(new IntegerNode(var68), var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3274 == var1.serverPacket) {
					var7 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var8 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortLE();
					var9 = var3.readUnsignedShortLE();
					var68 = var3.readUnsignedShortAdd();
					if (var68 == 65535) {
						var68 = -1;
					}

					ArrayList var86 = new ArrayList();
					var86.add(var68);
					var86.add(var5);
					class157.method3261(var86, var6, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class113.method2843();
					var68 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedIntLE();
					experience[var5] = var6;
					currentLevels[var5] = var68;
					levels[var5] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var6 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3341 == var1.serverPacket) {
					var68 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class27.queueSoundEffect(var68, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3295 == var1.serverPacket) {
					var68 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntME();
					var89 = class92.getWidget(var5);
					class135.method3052(var89, VarbitComposition.localPlayer.appearance.gender, var68);
					class218.invalidateWidget(var89);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var68 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var89 = class92.getWidget(var68);
					if (var89.modelType != 2 || var5 != var89.modelId) {
						var89.modelType = 2;
						var89.modelId = var5;
						class218.invalidateWidget(var89);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var68 = var3.readUnsignedByte();
					Script.forceDisconnect(var68);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3250 == var1.serverPacket) {
					class113.method2843();
					runEnergy = var3.readUnsignedShort();
					field578 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				boolean var61;
				if (ServerPacket.field3346 == var1.serverPacket) {
					var68 = var3.readUnsignedIntME();
					var61 = var3.readUnsignedByte() == 1;
					var89 = class92.getWidget(var68);
					class160.method3278(var89, VarbitComposition.localPlayer.appearance, var61);
					class218.invalidateWidget(var89);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var20 = var3.readByteNeg();
					var5 = var3.readUnsignedShortAdd();
					Varps.Varps_temp[var5] = var20;
					if (Varps.Varps_main[var5] != var20) {
						Varps.Varps_main[var5] = var20;
					}

					WorldMapDecoration.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				boolean var12;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var23 = (long)var3.readUnsignedShort();
					var25 = (long)var3.readMedium();
					PlayerType var44 = (PlayerType)KeyHandler.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte());
					long var46 = (var23 << 32) + var25;
					var12 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var46 == crossWorldMessageIds[var13]) {
							var12 = true;
							break;
						}
					}

					if (class299.friendSystem.isIgnored(new Username(var51, Language.loginType))) {
						var12 = true;
					}

					if (!var12 && field651 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var30 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(var3)));
						byte var83;
						if (var44.isPrivileged) {
							var83 = 7;
						} else {
							var83 = 3;
						}

						if (var44.modIcon != -1) {
							MouseHandler.addGameMessage(var83, Tile.method4373(var44.modIcon) + var51, var30);
						} else {
							MouseHandler.addGameMessage(var83, var51, var30);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3280 == var1.serverPacket) {
					if (class139.field1654 == null) {
						class139.field1654 = new class454(SwapSongTask.HitSplatDefinition_cached);
					}

					class523 var52 = SwapSongTask.HitSplatDefinition_cached.method8294(var3);
					class139.field1654.field4768.vmethod8779(var52.field5178, var52.field5177);
					field793[++field657 - 1 & 31] = var52.field5178;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3294 == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				NPC var91;
				if (ServerPacket.field3259 == var1.serverPacket) {
					short var82 = (short)var3.method9063();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedIntIME();
					var91 = npcs[var6];
					if (var91 != null) {
						var91.method2623(var5, var7, var82);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3272 == var1.serverPacket) {
					var68 = var3.readInt();
					if (var68 != field626) {
						field626 = var68;
						WorldMapSection2.method5107();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var68 = 0; var68 < VarpDefinition.field1933; ++var68) {
						VarpDefinition var73 = ApproximateRouteStrategy.VarpDefinition_get(var68);
						if (var73 != null) {
							Varps.Varps_temp[var68] = 0;
							Varps.Varps_main[var68] = 0;
						}
					}

					class113.method2843();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var72 = new Object[var51.length() + 1];

					for (var6 = var51.length() - 1; var6 >= 0; --var6) {
						if (var51.charAt(var6) == 's') {
							var72[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var72[0] = new Integer(var3.readInt());
					ScriptEvent var95 = new ScriptEvent();
					var95.args = var72;
					WorldMapSection1.runScriptEvent(var95);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(var3)));
					MouseHandler.addGameMessage(6, var51, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					class299.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					AbstractSocket.FriendSystem_invalidateIgnoreds();
					field732 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var68 = var3.readUShortSmart();
					var61 = var3.readUnsignedByte() == 1;
					var94 = "";
					boolean var55 = false;
					if (var61) {
						var94 = var3.readStringCp1252NullTerminated();
						if (class299.friendSystem.isIgnored(new Username(var94, Language.loginType))) {
							var55 = true;
						}
					}

					String var92 = var3.readStringCp1252NullTerminated();
					if (!var55) {
						MouseHandler.addGameMessage(var68, var94, var92);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3314 == var1.serverPacket) {
					var80 = var3.readUnsignedByte() == 1;
					if (var80) {
						class132.field1605 = GameEngine.method661() - var3.readLong();
						class392.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class392.grandExchangeEvents = null;
					}

					field597 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var68 = var3.readUnsignedShortAdd();
					var91 = npcs[var68];
					var7 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntIME();
					if (var91 != null) {
						var91.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var68 = var3.readUnsignedShortLE();
					if (var68 == 65535) {
						var68 = -1;
					}

					var5 = var3.readInt();
					var6 = var3.readUnsignedIntME();
					var71 = class92.getWidget(var5);
					ItemComposition var90;
					if (!var71.isIf3) {
						if (var68 == -1) {
							var71.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var90 = InvDefinition.ItemDefinition_get(var68).getCountObj(var6);
						var71.modelType = 4;
						var71.modelId = var68;
						var71.modelAngleX = var90.xan2d;
						var71.modelAngleY = var90.yan2d;
						var71.modelZoom = var90.zoom2d * 100 / var6;
						class218.invalidateWidget(var71);
					} else {
						var71.itemId = var68;
						var71.itemQuantity = var6;
						var90 = InvDefinition.ItemDefinition_get(var68).getCountObj(var6);
						var71.modelAngleX = var90.xan2d;
						var71.modelAngleY = var90.yan2d;
						var71.modelAngleZ = var90.zan2d;
						var71.modelOffsetX = var90.offsetX2d;
						var71.modelOffsetY = var90.offsetY2d;
						var71.modelZoom = var90.zoom2d;
						if (var90.isStackable == 1) {
							var71.itemQuantityMode = 1;
						} else {
							var71.itemQuantityMode = 2;
						}

						if (var71.field3702 > 0) {
							var71.modelZoom = var71.modelZoom * 32 / var71.field3702;
						} else if (var71.rawWidth > 0) {
							var71.modelZoom = var71.modelZoom * 32 / var71.rawWidth;
						}

						class218.invalidateWidget(var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedByteAdd();
					var68 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var22 = npcs[var68];
					if (var22 != null) {
						if (var5 == var22.sequence && var5 != -1) {
							var8 = EnumComposition.SequenceDefinition_get(var5).field2327;
							if (var8 == 1) {
								var22.sequenceFrame = 0;
								var22.sequenceFrameCycle = 0;
								var22.sequenceDelay = var6;
								var22.field1224 = 0;
							} else if (var8 == 2) {
								var22.field1224 = 0;
							}
						} else if (var5 == -1 || var22.sequence == -1 || EnumComposition.SequenceDefinition_get(var5).field2320 >= EnumComposition.SequenceDefinition_get(var22.sequence).field2320) {
							var22.sequence = var5;
							var22.sequenceFrame = 0;
							var22.sequenceFrameCycle = 0;
							var22.sequenceDelay = var6;
							var22.field1224 = 0;
							var22.field1261 = var22.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var23 = var3.readLong();
					var25 = (long)var3.readUnsignedShort();
					var27 = (long)var3.readMedium();
					PlayerType var45 = (PlayerType)KeyHandler.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte());
					var32 = var27 + (var25 << 32);
					boolean var31 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var32) {
							var31 = true;
							break;
						}
					}

					if (var45.isUser && class299.friendSystem.isIgnored(new Username(var51, Language.loginType))) {
						var31 = true;
					}

					if (!var31 && field651 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var32;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var43 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(var3)));
						if (var45.modIcon != -1) {
							class416.addChatMessage(9, Tile.method4373(var45.modIcon) + var51, var43, class211.base37DecodeLong(var23));
						} else {
							class416.addChatMessage(9, var51, var43, class211.base37DecodeLong(var23));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3301 == var1.serverPacket) {
					var68 = var3.readUnsignedByte();
					MusicPatchNode2.method5742(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3262 == var1.serverPacket) {
					var68 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field795[var68] = true;
					field588[var68] = var5;
					field748[var68] = var6;
					field658[var68] = var7;
					field744[var68] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var68 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var68 < -70000) {
						var5 += 32768;
					}

					if (var68 >= 0) {
						var89 = class92.getWidget(var68);
					} else {
						var89 = null;
					}

					for (; var3.offset < var1.serverPacketLength; FriendsChat.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var89 != null && var7 >= 0 && var7 < var89.itemIds.length) {
							var89.itemIds[var7] = var8;
							var89.itemQuantities[var7] = var9;
						}
					}

					if (var89 != null) {
						class218.invalidateWidget(var89);
					}

					class113.method2843();
					changedItemContainers[++field726 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3241 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field789 = true;
					var68 = var3.readShort();
					var5 = var3.readShort();
					var6 = UserComparator8.method2875(var5 + class129.cameraPitch & 2027);
					var7 = var68 + UserComparator10.cameraYaw;
					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field608 = new class478(class129.cameraPitch, var6, var8, var9);
					field582 = new class478(UserComparator10.cameraYaw, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var7 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShort();
					var68 = var3.readUnsignedShortLE();
					Player var36;
					if (var68 == localPlayerIndex) {
						var36 = VarbitComposition.localPlayer;
					} else {
						var36 = players[var68];
					}

					if (var36 != null) {
						var36.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var68 = 0; var68 < Varps.Varps_main.length; ++var68) {
						if (Varps.Varps_main[var68] != Varps.Varps_temp[var68]) {
							Varps.Varps_main[var68] = Varps.Varps_temp[var68];
							WorldMapDecoration.changeGameOptions(var68);
							changedVarps[++changedVarpCount - 1 & 31] = var68;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3251 == var1.serverPacket) {
					Interpreter.method2070(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3331 == var1.serverPacket) {
					var68 = var3.readUnsignedIntME();
					var5 = var3.readShortLE();
					var89 = class92.getWidget(var68);
					if (var5 != var89.sequenceId || var5 == -1) {
						var89.sequenceId = var5;
						var89.modelFrame = 0;
						var89.modelFrameCycle = 0;
						class218.invalidateWidget(var89);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					ObjectSound.field855 = var3.readUnsignedByte();
					class125.field1499 = var3.readUnsignedByteSub();

					while (var3.offset < var1.serverPacketLength) {
						var68 = var3.readUnsignedByte();
						class295 var70 = WorldMapSection0.method5424()[var68];
						World.method1806(var70);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3286 == var1.serverPacket) {
					var68 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortLE();
					PacketWriter.method2806(var68, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3302 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field788 = true;
					Players.field1374 = var3.readUnsignedByte() * 128;
					class33.field180 = var3.readUnsignedByte() * 16384;
					var68 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var6 = var3.readUnsignedByte() * 128 + 64;
					var7 = var3.readUnsignedShort();
					field790 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var9 = Players.field1374 * 16384 + 64;
					var10 = class33.field180 * 128 + 64;
					var11 = false;
					var12 = false;
					if (field790) {
						var56 = class133.cameraY;
						var59 = class18.getTileHeight(var9, var10, HealthBar.Client_plane) - var68;
					} else {
						var56 = class18.getTileHeight(NPCComposition.cameraX, class139.cameraZ, HealthBar.Client_plane) - class133.cameraY;
						var59 = var68;
					}

					field791 = new class476(NPCComposition.cameraX, class139.cameraZ, var56, var9, var10, var59, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					class299.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field732 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field788 = false;
					Players.field1374 = var3.readUnsignedByte() * 128;
					class33.field180 = var3.readUnsignedByte() * 16384;
					VarpDefinition.field1937 = var3.readUnsignedShort();
					class344.field3874 = var3.readUnsignedByte();
					MouseHandler.field252 = var3.readUnsignedByte();
					if (MouseHandler.field252 >= 100) {
						NPCComposition.cameraX = Players.field1374 * 16384 + 64;
						class139.cameraZ = class33.field180 * 128 + 64;
						class133.cameraY = class18.getTileHeight(NPCComposition.cameraX, class139.cameraZ, HealthBar.Client_plane) - VarpDefinition.field1937;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var68 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAdd();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var34 = class92.getWidget(var68);
					if (var9 != var34.color) {
						var34.color = var9;
						class218.invalidateWidget(var34);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3288 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedIntLE();
					var89 = class92.getWidget(var5);
					if (!var51.equals(var89.text)) {
						var89.text = var51;
						class218.invalidateWidget(var89);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var68 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var68 < -70000) {
						var5 += 32768;
					}

					if (var68 >= 0) {
						var89 = class92.getWidget(var68);
					} else {
						var89 = null;
					}

					if (var89 != null) {
						for (var7 = 0; var7 < var89.itemIds.length; ++var7) {
							var89.itemIds[var7] = 0;
							var89.itemQuantities[var7] = 0;
						}
					}

					SoundCache.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.readUnsignedShort();
						var10 = var3.readUnsignedByteSub();
						if (var10 == 255) {
							var10 = var3.readUnsignedIntLE();
						}

						if (var89 != null && var8 < var89.itemIds.length) {
							var89.itemIds[var8] = var9;
							var89.itemQuantities[var8] = var10;
						}

						FriendsChat.itemContainerSetItem(var5, var8, var9 - 1, var10);
					}

					if (var89 != null) {
						class218.invalidateWidget(var89);
					}

					class113.method2843();
					changedItemContainers[++field726 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var68 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					Varps.Varps_temp[var68] = var5;
					if (Varps.Varps_main[var68] != var5) {
						Varps.Varps_main[var68] = var5;
					}

					WorldMapDecoration.changeGameOptions(var68);
					changedVarps[++changedVarpCount - 1 & 31] = var68;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3261 == var1.serverPacket) {
					World.method1806(class295.field3210);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3349 == var1.serverPacket) {
					World.method1806(class295.field3216);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3321 == var1.serverPacket) {
					World.method1806(class295.field3215);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var68 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var68] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var68] = new GrandExchangeOffer(var3, false);
					}

					field736 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3247 == var1.serverPacket && isCameraLocked) {
					field794 = true;
					field789 = false;
					field788 = false;

					for (var68 = 0; var68 < 5; ++var68) {
						field795[var68] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					ObjectSound.field855 = var3.readUnsignedByteNeg();
					class125.field1499 = var3.readUnsignedByteSub();

					for (var68 = ObjectSound.field855; var68 < ObjectSound.field855 + 8; ++var68) {
						for (var5 = class125.field1499; var5 < class125.field1499 + 8; ++var5) {
							if (groundItems[HealthBar.Client_plane][var68][var5] != null) {
								groundItems[HealthBar.Client_plane][var68][var5] = null;
								class135.updateItemPile(var68, var5);
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) {
						if (var50.x >= ObjectSound.field855 && var50.x < ObjectSound.field855 + 8 && var50.y >= class125.field1499 && var50.y < class125.field1499 + 8 && var50.plane == HealthBar.Client_plane) {
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3266 == var1.serverPacket) {
					return this.method1617(var1, 2);
				}

				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3260 == var1.serverPacket) {
					field735 = cycleCntr;
					var20 = var3.readByte();
					class160 var69 = new class160(var3);
					ClanChannel var35;
					if (var20 >= 0) {
						var35 = currentClanChannels[var20];
					} else {
						var35 = VerticalAlignment.guestClanChannel;
					}

					if (var35 == null) {
						this.method1540(var20);
						var1.serverPacket = null;
						return true;
					}

					if (var69.field1781 > var35.field1808) {
						this.method1540(var20);
						var1.serverPacket = null;
						return true;
					}

					if (var69.field1781 < var35.field1808) {
						var1.serverPacket = null;
						return true;
					}

					var69.method3275(var35);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3354 == var1.serverPacket) {
					World.method1806(class295.field3211);
					var1.serverPacket = null;
					return true;
				}

				Messages.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1436 != null ? var1.field1436.id : -1) + "," + (var1.field1437 != null ? var1.field1437.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				ArchiveDisk.logOut();
			} catch (IOException var48) {
				Renderable.method4709();
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1436 != null ? var1.field1436.id : -1) + "," + (var1.field1437 != null ? var1.field1437.id : -1) + "," + var1.serverPacketLength + "," + (VarbitComposition.localPlayer.pathX[0] + UrlRequester.baseX * 64) + "," + (VarbitComposition.localPlayer.pathY[0] + class47.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var21 = var21 + var3.array[var6] + ",";
				}

				Messages.RunException_sendStackTrace(var21, var49);
				ArchiveDisk.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false;

		int var2;
		int var5;
		while (!var1) {
			var1 = true;

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var17 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var17;
					String var18 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var18;
					var5 = menuOpcodes[var2];
					menuOpcodes[var2] = menuOpcodes[var2 + 1];
					menuOpcodes[var2 + 1] = var5;
					var5 = menuArguments1[var2];
					menuArguments1[var2] = menuArguments1[var2 + 1];
					menuArguments1[var2 + 1] = var5;
					var5 = menuArguments2[var2];
					menuArguments2[var2] = menuArguments2[var2 + 1];
					menuArguments2[var2 + 1] = var5;
					var5 = menuIdentifiers[var2];
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
					menuIdentifiers[var2 + 1] = var5;
					var5 = menuItemIds[var2];
					menuItemIds[var2] = menuItemIds[var2 + 1];
					menuItemIds[var2 + 1] = var5;
					boolean var6 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

		if (clickedWidget == null) {
			int var19 = MouseHandler.MouseHandler_lastButton;
			int var4;
			int var7;
			int var8;
			int var20;
			if (isMenuOpen) {
				int var3;
				if (var19 != 1 && (PlayerCompositionColorTextureOverride.mouseCam || var19 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < class12.menuX - 10 || var2 > class12.menuX + class316.menuWidth + 10 || var3 < class419.menuY - 10 || var3 > class419.menuY + Occluder.menuHeight + 10) {
						isMenuOpen = false;
						var4 = class12.menuX;
						var5 = class419.menuY;
						var20 = class316.menuWidth;
						var7 = Occluder.menuHeight;

						for (var8 = 0; var8 < rootWidgetCount; ++var8) {
							if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var4 + var20 && rootWidgetYs[var8] + rootWidgetHeights[var8] > var5 && rootWidgetYs[var8] < var5 + var7) {
								validRootWidgets[var8] = true;
							}
						}
					}
				}

				if (var19 == 1 || !PlayerCompositionColorTextureOverride.mouseCam && var19 == 4) {
					var2 = class12.menuX;
					var3 = class419.menuY;
					var4 = class316.menuWidth;
					var5 = MouseHandler.MouseHandler_lastPressedX;
					var20 = MouseHandler.MouseHandler_lastPressedY;
					var7 = -1;

					int var15;
					for (var8 = 0; var8 < menuOptionsCount; ++var8) {
						var15 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
						if (var5 > var2 && var5 < var4 + var2 && var20 > var15 - 13 && var20 < var15 + 3) {
							var7 = var8;
						}
					}

					int var11;
					int var12;
					int var16;
					if (var7 != -1 && var7 >= 0) {
						var8 = menuArguments1[var7];
						var15 = menuArguments2[var7];
						var16 = menuOpcodes[var7];
						var11 = menuIdentifiers[var7];
						var12 = menuItemIds[var7];
						String var13 = menuActions[var7];
						String var14 = menuTargets[var7];
						IgnoreList.menuAction(var8, var15, var16, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}

					isMenuOpen = false;
					var8 = class12.menuX;
					var15 = class419.menuY;
					var16 = class316.menuWidth;
					var11 = Occluder.menuHeight;

					for (var12 = 0; var12 < rootWidgetCount; ++var12) {
						if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var8 + var16 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var15 && rootWidgetYs[var12] < var15 + var11) {
							validRootWidgets[var12] = true;
						}
					}
				}
			} else {
				var2 = menuOptionsCount - 1;
				if ((var19 == 1 || !PlayerCompositionColorTextureOverride.mouseCam && var19 == 4) && this.shouldLeftClickOpenMenu()) {
					var19 = 2;
				}

				if ((var19 == 1 || !PlayerCompositionColorTextureOverride.mouseCam && var19 == 4) && menuOptionsCount > 0 && var2 >= 0) {
					var4 = menuArguments1[var2];
					var5 = menuArguments2[var2];
					var20 = menuOpcodes[var2];
					var7 = menuIdentifiers[var2];
					var8 = menuItemIds[var2];
					String var9 = menuActions[var2];
					String var10 = menuTargets[var2];
					IgnoreList.menuAction(var4, var5, var20, var7, var8, var9, var10, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}

				if (var19 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-84"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1;
		return (leftClickOpensMenu && menuOptionsCount > 2 || class53.method1093(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1301595463"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class342.method6603(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class130.scene.menuOpen(HealthBar.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "571828087"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = class113.canvasWidth;
		int var4 = class177.canvasHeight;
		if (ModeWhere.loadInterface(var2)) {
			PcmPlayer.resizeInterface(PacketBufferNode.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)V",
		garbageValue = "649704501"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class92.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class113.canvasWidth;
			var4 = class177.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class369.alignWidgetSize(var1, var3, var4, false);
		WorldMapArea.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-332488970"
	)
	final void method1273() {
		class218.invalidateWidget(clickedWidget);
		++class159.widgetDragDuration;
		int var1;
		int var2;
		if (field762 && field715) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field716) {
				var1 = field716;
			}

			if (var1 + clickedWidget.width > field716 + clickedWidgetParent.width) {
				var1 = field716 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field717) {
				var2 = field717;
			}

			if (var2 + clickedWidget.height > field717 + clickedWidgetParent.height) {
				var2 = field717 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field564;
			int var4 = var2 - field636;
			int var5 = clickedWidget.dragZoneSize;
			if (class159.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field716 + clickedWidgetParent.scrollX;
			int var7 = var2 - field717 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				WorldMapSection1.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						WorldMapSection1.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && BuddyRankComparator.method2916(clickedWidget) != null) {
						PacketBufferNode var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var10.packetBuffer.writeIntME(clickedWidget.id);
						var10.packetBuffer.writeIntLE(draggedOnWidget.id);
						var10.packetBuffer.writeShort(clickedWidget.childIndex);
						var10.packetBuffer.writeShort(draggedOnWidget.itemId);
						var10.packetBuffer.writeShortAdd(draggedOnWidget.childIndex);
						var10.packetBuffer.writeShortAdd(clickedWidget.itemId);
						packetWriter.addNode(var10);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field564 + widgetClickX, field636 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					method1801(widgetClickX + field564, widgetClickY + field636);
				}

				clickedWidget = null;
			}

		} else {
			if (class159.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					var1 = widgetClickX + field564;
					var2 = widgetClickY + field636;
					MenuAction var9 = class9.tempMenuAction;
					if (var9 != null) {
						IgnoreList.menuAction(var9.param0, var9.param1, var9.opcode, var9.identifier, var9.itemId, var9.action, var9.target, var1, var2);
					}

					class9.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(S)Luc;",
		garbageValue = "-775"
	)
	@Export("username")
	public Username username() {
		return VarbitComposition.localPlayer != null ? VarbitComposition.localPlayer.username : null;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "516"
	)
	void method1540(int var1) {
		if (revision >= 216) {
			PacketBufferNode var2 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3203, packetWriter.isaacCipher);
			var2.packetBuffer.writeByte(var1);
			packetWriter.addNode(var2);
		}

	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1345860990"
	)
	void method1276(int var1) {
		if (revision >= 216) {
			PacketBufferNode var2 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3204, packetWriter.isaacCipher);
			var2.packetBuffer.writeByte(var1);
			packetWriter.addNode(var2);
		}

	}

	protected void finalize() throws Throwable {
		HorizontalAlignment.method3678(this);
		super.finalize();
	}

	public void setClient(int var1) {
		this.field574 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field678 = var1;
			PcmPlayer.method838(10);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field576 = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							ClanChannelMember.clientLanguage = Language.method6938(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							GameBuild[] var5 = UrlRequest.method2855();
							int var6 = 0;

							GameBuild var13;
							while (true) {
								if (var6 >= var5.length) {
									var13 = null;
									break;
								}

								GameBuild var7 = var5[var6];
								if (var4 == var7.buildId) {
									var13 = var7;
									break;
								}

								++var6;
							}

							WorldMapLabelSize.field2882 = var13;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							MusicPatchPcmStream.field3478 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.stellardawn, StudioGame.game5, StudioGame.game4, StudioGame.runescape, StudioGame.game3, StudioGame.oldscape};
							WorldMapSectionType.field2997 = (StudioGame)KeyHandler.findEnumerated(var3, Integer.parseInt(var2));
							if (StudioGame.oldscape == WorldMapSectionType.field2997) {
								Language.loginType = LoginType.oldscape;
							} else {
								Language.loginType = LoginType.field4998;
							}
							break;
						case 11:
							class510.field5094 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 22:
						case 23:
						case 24:
						default:
							break;
						case 14:
							WorldMapSectionType.field2996 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class200.field2121 = var2;
							break;
						case 21:
							field531 = Integer.parseInt(var2);
							break;
						case 25:
							int var8 = var2.indexOf(".");
							if (var8 == -1) {
								revision = Integer.parseInt(var2);
							} else {
								revision = Integer.parseInt(var2.substring(0, var8));
								Integer.parseInt(var2.substring(var8 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class292.worldHost = this.getCodeBase().getHost();
				class308.field3462 = new JagNetThread();
				String var9 = WorldMapLabelSize.field2882.name;
				byte var10 = 0;
				if ((worldProperties & class510.field5077.rsOrdinal()) != 0) {
					class30.field166 = "beta";
				}

				try {
					SecureRandomCallable.method2246("oldschool", class30.field166, var9, var10, 22);
				} catch (Exception var11) {
					Messages.RunException_sendStackTrace((String)null, var11);
				}

				class219.client = this;
				RunException.field5267 = clientType;
				class18.method288();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.field573 = true;
				}

				if (field544 == -1) {
					if (!this.method1246() && !this.method1428()) {
						field544 = 0;
					} else {
						field544 = 5;
					}
				}

				this.startThread(765, 503, 216, 1);
			}
		} catch (RuntimeException var12) {
			throw SecureRandomFuture.newRunException(var12, "client.init(" + ')');
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "24"
	)
	static final int method1800(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "18"
	)
	static void method1801(int var0, int var1) {
		MenuAction var2 = class9.tempMenuAction;
		if (var2 != null) {
			IgnoreList.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.itemId, var2.action, var2.target, var0, var1);
		}

		class9.tempMenuAction = null;
	}
}
