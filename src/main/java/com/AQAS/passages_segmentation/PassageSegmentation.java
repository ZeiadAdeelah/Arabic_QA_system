package com.AQAS.passages_segmentation;

import java.util.Arrays;

public class PassageSegmentation {

    public static String getDocumentText(int documentId){
        return  "مرض السكري\n" +
                "Diabetes\n" +
                "شارك\n" +
                "غرد\n" +
                "محتويات الصفحة\n" +
                "ما هو مرض السكري\n" +
                "أعراض\n" +
                "الأسباب وعوامل الخطر\n" +
                "مضاعفات\n" +
                "التشخيص\n" +
                "العلاج\n" +
                "الوقاية\n" +
                "يشمل مصطلح مرض السكري (Diabetes) عددا من الاضطرابات في عملية هدم وبناء - الأيض - (Metabolism) الكربوهيدرات.\n" +
                "عملية الأيض الطبيعية\n" +
                "الكربوهيدرات التي يحصل عليها الجسم من أكل الخبز، البطاطا، الأرز، الكعك وغيرها من أغذية عديدة أخرى، تتفكك وتتحلل بشكل تدريجي.\n" +
                "تبدأ عملية التفكك والتحلل هذه في المعدة، ثم تستمر في الإثني عشر (Duodenum) وفي الأمعاء الدقيقة. تنتج عن عملية التفكك والتحلل هذه مجموعة من السكريات (كربوهيدرات - Carbohydrate) يتم امتصاصها في الدورة الدموية.\n" +
                "خلايا الإفراز الداخلي (Internal secretion) الموجودة في البنكرياس (Pancreas)، والتي تسمى خلايا بيتا (Beta cells)، حساسة جدا لارتفاع مستوى السكر في الدم وتقوم بإفراز هُرمون الإنسولين (Insulin).\n" +
                "الإنسولين هو جسر أساسي لدخول جزيئات السكر، الجلوكوز، إلى داخل العضلات حيث يتم استعماله كمصدر للطاقة، وإلى أنسجة الدهن والكبد حيث يتم تخزينه.\n" +
                "كما يصل الجلوكوز إلى الدماغ، أيضا، ولكن بدون مساعدة الإنسولين.\n" +
                "مواضيع ذات علاقة\n" +
                "منتدى السكري\n" +
                "اختبار خطر الاصابة بمرض السكري من النمط 2\n" +
                "ما هي مستويات السكر المرتفعة والمنخفضة في الدم؟\n" +
                "ما الذي يزيد من مخاطر الاصابة بمضاعفات السكري من نوع 2؟\n" +
                "ما هو الهيموغلوبين A1C?\n" +
                "في البنكرياس نوع آخر من الخلايا هي خلايا ألفا (Alpha cells)، التي تُفرز هُرمونا إضافيا آخر يدعى الغلوكاغون (Glucagon). هذا الهرمون يسبب إخراج السكر من الكبد وينشّط عمل هُرمونات أخرى تعيق عمل الإنسولين.\n" +
                "الموازنة بين هذين الهرمونين (الإنسولين والغلوكاغون) تحافظ على ثبات مستوى الجلوكوز في الدم وتجنبه التغيرات الحادة.\n" +
                "أصحاب الوزن السليم الذين يُكثرون من النشاط البدني يحتاجون إلى كمية قليلة من الإنسولين لموازنة عمل الجلوكوز الواصل إلى الدم. وكلما كان الشخص أكثر سُمنة وأقلّ لياقة بدنية أصبح بحاجة إلى كمية أكبر من الإنسولين لمعالجة كمية مماثلة من الجلوكوز في الدم. هذه الحالة تدعى \"مقاومة الإنسولين\" (Insulin resistance).\n" +
                "الإصابة بالسكري\n" +
                "عندما تصاب خلايا بيتا الموجودة في البنكرياس بالضرر، تقل كمية الإنسولين المفرزة بشكل تدريجي، وتستمر هذه العملية سنوات عديدة.\n" +
                "إذا ما ترافقت هذه الحالة مع وجود \"مقاومة الإنسولين\"، فإن هذا المزيج من كمية إنسولين قليلة ومستوى فاعلية منخفض، يؤدي إلى انحراف عن المستوى السليم للجلوكوز (السكر) في الدم، وفي هذه الحالة يتم تعريف الشخص بأنه مصاب بمرض السكري (Diabetes).\n" +
                "المعروف إن المستوى السليم للسكر في الدم بعد صوم ثماني ساعات يجب أن يكون أقلّ من 108 ملغم/ دل، بينما المستوى الحدودي هو 126 ملغم/ دل. أما إذا كان مستوى الجلوكوز في الدم لدى شخص ما 126 ملغم/ دل وما فوق، في فحصين أو أكثر، فعندئذ يتم تشخيص إصابة هذا الشخص بمرض السكري.\n" +
                "كيف يؤثر السكري على مستوى السكر في الدم؟\n" +
                "أنواع مرض السكري\n" +
                "1- السكري من النوع الأول (Diabetes type 1) (أو: السكري النمط الأول / السكري لدى الأطفال/ السكري لدى اليافعين - Juvenile Diabetes)\n" +
                "هو مرض يقوم الجهاز المناعي خلاله بإتلاف خلايا بيتا في البنكرياس، لأسباب غير معروفة ولم يتم تحديدها، حتى الآن.\n" +
                "عند الأولاد، تجري عملية الإتلاف هذه بسرعة وتستمر من بضعة أسابيع حتى بضع سنين. أما عند البالغين، فقد تستمر سنوات عديدة. العديد من الأشخاص الذين يصابون بمرض السكري من النوع الأول (Diabetes type 1) في سن متقدم، يتم تشخيص حالتهم، خطأ، بأنها مرض السكري من النوع الثاني (Diabetes type 2).\n" +
                "2- السكري من النوع الثاني (Diabetes type 2) (أو: سكري النمط الثاني/ سكري البالغين)\n" +
                "هو مرض يتم خلاله تدمير وإتلاف خلايا بيتا في البنكرياس لأسباب وراثية، على الأرجح، مدعومة بعوامل خارجية. هذه العملية بطيئة جدا وتستمر عشرات السنين.\n" +
                "إن احتمال إصابة شخص يتمتع بوزن صحّي وبلياقة بدنية جيدة بمرض السكري ضئيل، حتى وإن كان لديه هبوط في إفراز الإنسولين. أما احتمال إصابة شخص سمين لا يمارس نشاطا بدنيا بمرض السكري فهو احتمال كبير، نظرا لكونه أكثر عرضة للإصابة بـ \"مقاومة الإنسولين\" (Insulin resistance) وبالتالي بمرض السكري.\n" +
                "تشير الإحصائيات إلى إن عدد المصابين بمرض السكري النمط الثاني في العالم، سجل ارتفاعا كبيرا جدا خلال العقود الأخيرة، إذ وصل إلى نحو 150 مليون إنسان، ومن المتوقع أن يرتفع إلى 330 مليون مصاب بمرض السكري، حتى العام 2025.\n" +
                "من الأسباب الرئيسية لهذا الارتفاع الحاد بالاصابات بمرض السكري:\n" +
                "السمنة\n" +
                "قلة النشاط البدني\n" +
                "التغيرات في أنواع الأطعمة: فالأغذية الشائعة اليوم تشمل المأكولات الجاهزة تسبب السكري، كونها غنية بالدهنيات والسكريات التي يتم امتصاصها في الدم بسهولة، مما يؤدي إلى ازدياد \"مقاومة الإنسولين\".\n" +
                "قد تؤدي الإصابة بمرض السكري إلى:\n" +
                "ارتفاع تدريجي في ضغط الدم\n" +
                "اضطرابات مميزة في دهنيات الدم، وخاصة ارتفاع ثلاثي الغليسريد (Triglyceride)\n" +
                "انخفاض البروتين الشحمي رفيع الكثافة (الكولسترول الجيد – HDL).\n" +
                "يصاب مرضى السكري إجمالا بأضرار مميزة: في الكليتين، في شبكيتيّ العينين (Retina) وفي الجهاز العصبيّ.\n" +
                "أعراض مرض السكري\n" +
                "تختلف اعراض مرض السكر تبعا لنوع السكري.\n" +
                "أحيانا، قد لا يشعر الأشخاص المصابون بـ \"مقدمات\" السكري (Prediabetes) أو بالسكري الحملي (Pregnancy diabetes)، بأية اعراض إطلاقا. أو قد يشعرون ببعض من أعراض السكري النمط الأول والسكري النمط الثاني أو بجميع الأعراض سوية.\n" +
                "من اعراض مرض السكري:\n" +
                "العطش\n" +
                "التبول كثيرا، في أوقات متقاربة\n" +
                "الجوع الشديد جدا\n" +
                "انخفاض الوزن لأسباب غير واضحة وغير معروفة\n" +
                "التعب\n" +
                "تشوش الرؤية\n" +
                "شفاء (التئام) الجروح ببطء\n" +
                "تلوثات (عدوى) متواترة، في: اللثة، الجلد، المهبل أو في المثانة البولية.\n" +
                "مرض السكري من النوع 1 قد يصيب الإنسان في أية مرحلة من العمر، لكنه يظهر، في الغالب، في سن الطفولة أو في سن المراهقة.\n" +
                "أما مرض السكري من النوع 2، فهو الأكثر شيوعا، يمكن أن يظهر في أي سن ويمكن الوقاية منه وتجنبه، غالبا.\n" +
                "أسباب وعوامل خطر مرض السكري\n" +
                "تعرف على أسباب وعوامل خطر الإصابة بمرض السكري تبعاً للنوع:\n" +
                "عوامل مرض السكري من النوع الأول\n" +
                "في مرض السكري من النوع الأول، يهاجم الجهاز المناعي الخلايا المسؤولة عن إفراز الإنسولين في البنكرياس ويُتلفها، بدلا من مهاجمة وتدمير الجراثيم و/أو الفيروسات الضارة، كما يفعل في الحالات الطبيعية (السليمة) عادة.\n" +
                "نتيجة لذلك، يبقى الجسم مع كمية قليلة من الإنسولين، أو بدون إنسولين على الإطلاق. في هذه الحالة، يتجمع السكر ويتراكم في الدورة الدموية، بدلا من أن يتوزع على الخلايا المختلفة في الجسم.\n" +
                "ليس معروفا، حتى الآن، المسبب العيني الحقيقي لمرض السكري من النوع 1، لكن يبدو إن التاريخ العائلي يلعب، على الأرجح، دورا مهما.\n" +
                "خطر الإصابة بمرض السكري من النوع الأول يزداد لدى الأشخاص الذين يعاني أحد والديهم أو أخوتهم وأخواتهم من مرض السكري. وهنالك عوامل إضافية، أيضا، قد تكون مسببة لمرض السكري، مثل التعرض لأمراض فيروسية.\n" +
                "عوامل مرض السكري من النوع الثاني\n" +
                "عند المصابين بـ \"مقدمات السكري\" التي قد تتفاقم وتتحول إلى السكري من النوع الثاني، تقاوم الخلايا تأثير عمل الإنسولين بينما يفشل البنكرياس في إنتاج كمية كافية من الإنسولين للتغلب على هذه المقاومة.\n" +
                "في هذه الحالات، يتجمع السكر ويتراكم في الدورة الدموية بدل أن يتوزع على الخلايا ويصل إليها في مختلف أعضاء الجسم.\n" +
                "والسبب المباشر لحدوث هذه الحالات لا يزال غير معروف، لكن يبدو أن الدهنيات الزائدة - وخاصة في البطن – وقلة النشاط البدني هي عوامل مهمة في حدوث ذلك.\n" +
                "لا يزال الباحثون يبحثون عن إجابة حقيقية ودقيقة على السؤال التالي: لماذا تصيب حالتا \"مقدمات السكري\" و السكري من النوع 2 أشخاصا محددين، بعينهم، دون غيرهم. ومع ذلك، هنالك عدة عوامل من الواضح أنها تزيد من خطر الإصابة بمرض السكري، من بينها: \n" +
                "العمر: عمر أكبر أو يساوي 45\n" +
                "الوزن: وزن زائد معرّف على أنه BMI أكبر أو يساوي 25.\n" +
                "الوراثة: قريب عائلة من الدّرجة الأولى مريض بمرض السكري.\n" +
                "العرق: فئات عرقية معيّنة والمعروف عن خطورة مرتفعة لديها للإصابة بمرض السكري.\n" +
                "النشاط البدني: قلة النشاط البدني.\n" +
                "فرط/ارتفاع ضغط الدّم: والمعرّف بواسطة قيم ضغط دم أعلى من mmHg 90/140.\n" +
                "فرط الكولسترول: والمقصود الضار LDL\n" +
                "مستوى مرتفع من ثلاثي الغليسيريد في الدم: وهو احد أنواع الدهنيات الموجودة في الجسم. قيم أعلى من mg/dL 250.\n" +
                "متلازمة المبيض المتعدّد الكيسات.\n" +
                "أمراض الاوعية الدموية: تاريخ شخصي للإصابة بهذه الأمراض.\n" +
                "ولادة طفل ذو وزن كبير: تاريخ شخصي لدى النّساء يشمل ولادة طفل ذو وزن أعلى من 4.1 كغم (وزن الطفل فور الولادة).\n" +
                "سكري الحمل: تاريخ شخصي لسكري الحمل.\n" +
                "قيم الهيموجلوبين الجلوكوزيلاتي: HBA1C أكبر أو تساوي 5.7%.\n" +
                "تحمل الجلوكوز: من لديهم نقص/ضعف في تحمّل الجلوكوز Impaired glucose tolerance\n" +
                "قيم الجلوكوز: من لديهم تعلّل/مشكلة في قيم الجلوكوز (السكر) في فحص ما بعد الصيام  impaired fasting glucose\n" +
                "عندما تظهر هذه العوامل – فرط ضغط الدم، فرط سكر الدم ودهنيات في الدم أعلى من المستوى الطبيعي -  سوية مع السمنة (الوزن الزائد) تنشأ علاقة بينها، معا، وبين مقاومة الإنسولين.\n" +
                "عوامل مرض سكري الحمل\n" +
                "خلال فترة الحمل، تنتج المشيمة هرمونات تساعد الحمل وتدعمه. هذه الهرمونات تجعل الخلايا أشدّ مقاومة للإنسولين.\n" +
                "في الثلثين الثاني والثالث من الحمل، تكبر المشيمة وتنتج كميات كبيرة من هذه الهرمونات التي تعسّر عمل الإنسولين وتجعله أكثر صعوبة.\n" +
                "في الحالات العادية الطبيعية، يُصدر البنكرياس ردة فعل على ذلك تتمثل في إنتاج كمية إضافية من الإنسولين للتغلب على تلك المقاومة.\n" +
                "لكن البنكرياس يعجز، أحيانا، عن مواكبة الوتيرة، مما يؤدي إلى وصول كمية قليلة جدا من السكر (الجلوكوز) إلى الخلايا، بينما تتجمع وتتراكم كمية كبيرة منه في الدورة الدموية. وهكذا يتكون السكري الحملي (السكري أثناء فترة الحمل).\n" +
                "قد تتعرض أية سيدة حامل للإصابة بمرض السكري الحملي، لكن ثمة نساء هن أكثر عرضة من غيرهن. أما عوامل خطر الاصابة بمرض السكري فتشمل:\n" +
                "النساء فوق سن 25 عاما\n" +
                "التاريخ العائلي أو الشخصي\n" +
                "الوزن الزائد.\n" +
                "مضاعفات مرض السكري\n" +
                "تختلف المضاعفات الناتجة عن مرض السكري تبعا لنوع السكري.\n" +
                "مضاعفات السكري من النوعين الأول والثاني\n" +
                "المضاعفات القصيرة المدى الناجمة عن السكري من النوعين الأول والثاني تتطلب المعالجة الفورية. فمثل هذه الحالات التي لا تتم معالجتها، فورا، قد تؤدي إلى حصول اختلاجات (Convulsions) وإلى غيبوبة (Coma).\n" +
                "فرط السكر في الدم (Hyperglycemia)\n" +
                "مستوى مرتفع من الكيتونات في البول (حُماض كيتونيّ سكريّ -  Diabetic ketoacidosis)\n" +
                "نقص السكر في الدم (Hypoglycemia).\n" +
                "أما المضاعفات طويلة المدى الناجمة عن السكري فهي تظهر بشكل تدريجي.\n" +
                "يزداد خطر ظهور المضاعفات كلما كانت الإصابة بالسكري في سن أصغر ولدى الأشخاص الذين لا يحرصون على موازنة مستوى السكر في الدم. وقد تؤدي مضاعفات السكري، في نهاية المطاف، إلى حصول إعاقات أو حتى إلى الموت.\n" +
                "مرض قلبي وعائي (في القلب والأوعية الدموية)\n" +
                "ضرر في الأعصاب (اعتلال عصبيّ - Neuropathy)\n" +
                "ضرر في الكليتين (اعتلال الكلية  - Nephropathy)\n" +
                "ضرر في العينين\n" +
                "ضرر في كفتي القدمين\n" +
                "أمراض في الجلد وفي الفم\n" +
                "مشاكل في العظام وفي المفاصل.\n" +
                "مضاعفات السكري الحملي\n" +
                "غالبية النساء اللواتي تصبن بمرض السكري الحملي تلدن أطفالا أصحاء. ومع ذلك، فإذا كان السكري في دم المرأة الحامل غير متوازن ولم تتم مراقبته ومعالجته كما ينبغي، فإنه قد يسبب أضرارا لدى الأم والمولود، على السواء.\n" +
                "مضاعفات قد تحصل لدى المولود بسبب السكري الحملي:\n" +
                "فرط النمو\n" +
                "نقص السكر في الدم\n" +
                "متلازمة الضائقة التنفسية (Respiratory distress syndrome)\n" +
                "اليرقان (Jaundice)\n" +
                "السكري من النوع الثاني في سن متقدم\n" +
                "الموت\n" +
                "مضاعفات قد تحصل لدى الأم بسبب السكري الحملي:\n" +
                "مقدمات الارتعاج (pre - eclampsia)\n" +
                "السكري الحملي في الحمل التالي أيضا\n" +
                "مضاعفات مقدمات السكري\n" +
                "قد تتطور حالة مقدمات السكري وتتفاقم لتصبح مرض السكري من النوع الثاني.\n" +
                "تشخيص مرض السكري\n" +
                "هنالك العديد من فحوصات الدم، التي يمكن بواسطتها تشخيص اعراض السكري النمط الأول أو اعراض السكري النمط الثاني، من بينها:\n" +
                "فحص عشوائي لمستوى السكري في الدم.\n" +
                "فحص مستوى السكري في الدم أثناء الصيام.\n" +
                "إذا تم تشخيص إصابة شخص ما بـ أعراض مرض السكر، طبقا لنتائج الفحوص، فمن المحتمل أن يقرر الطبيب إجراء فحوصات إضافية من أجل تحديد نوع مرض السكري (السكري النوع الأول أم السكري النوع الثاني)، وذلك بهدف اختيار علاج السكري المناسب والناجع، علما بأن طرق العلاج تختلف من نوع السكري إلى آخر.\n" +
                "كما يمكن أن يوصي الطبيب، أيضا، بإجراء اخْتِبارُ الهيموغلوبينِ الغليكوزيلاتي (Hemoglobin A1C / Glycosylated hemoglobin test).\n" +
                "فحوصات لكشف مرض السكري الحملي\n" +
                "اختبارات الكشف عن مرض السكري الحملي هي جزء لا يتجزأ من الفحوصات العادية، الروتينية، في فترة الحمل.\n" +
                "ينصح معظم المهنيين في المجال الطبي بالخضوع لفحص دم لمرض السكري يدعى \"اختبار تحدي الجلوكوز\" (Glucose Challenge Test). والذي يجرى أثناء الحمل، بين الأسبوع الرابع والعشرين والأسبوع الثامن والعشرين من الحمل، أو قبل ذلك لدى النساء الأكثر عرضة للإصابة بمرض السكري الحملي.\n" +
                "يبدأ \"اختبار تحدي الجلوكوز\" بشرب محلول شراب السكر. وبعد مرور ساعة على ذلك يجرى فحص دم لقياس مستوى (تركيز) السكري في الدم. إذا كان السكري في الدم أعلى من 140 ملغم/ دل (mg/dl)، فهذا يدل عادة على وجود السكري الحملي. ولكن، في غالبية الحالات هنالك حاجة لتكرار الاختبار بغية تأكيد تشخيص السكري.\n" +
                "تحضيرا للفحص المُعاد (الإضافي)، ينبغي على الحامل التي تخضع للفحص أن تصوم طوال الليلة التي تسبق الفحص. وهنا، مرة أخرى، يتم شرب محلول حلو المذاق يحتوي هذه المرة على تركيز أعلى من الجلوكوز، ثم يتم قياس مستوى السكري في الدم كل ساعة، على مدى ثلاث ساعات.\n" +
                " فحوصات لكشف \"مقدمات السكري\"\n" +
                "توصي الكلية الأمريكية لعلم الغدد الصمّ (الجهاز الهرموني - Endocrinology)، عادة، بإجراء فحص الكشف عن \"مقدمات السكري\" لكل شخص لديه تاريخ عائلي من سكري النمط الثاني، للذين يعانون من فرط السمنة أو المصابين بالمتلازمة الأيضية (Metabolic syndrome). كما يحبذ أن تخضع لهذا الفحص، أيضا، النساء اللواتي أصبن في الماضي بمرض السكري الحملي.\n" +
                "وقد يوصي الطبيب بالخضوع لأحد الفحصين التاليين لتشخيص \"مقدمات السكري\":\n" +
                "فحص السكري في الدم أثناء الصوم\n" +
                "اختبار تحمّل الغلوكوز (Glucose tolerance test).\n" +
                "علاج مرض السكري\n" +
                "علاج مرض السكري من نوع 2\n" +
                "يختلف علاج السكري من شخص إلى آخر وذلك بحسب الفحوصات المخبريّة الشخصية التي يقوم بها كلّ مريض وقيم الجلوكوز (السكر) في الدم لديهم. \n" +
                "من الجدير بالذكر ووفقا لمضاعفات مرض السكري التي قمنا بعرضها سابقًا فإن خطورة الإصابة بأمراض وعائية مجهرية وأمراض وعائية ترى عيانًا (microvascular & macrovascular) هي عالية كلما كان تركيز السكر في الدّم أعلى على مدى فترات طويلة من المرض.\n" +
                "بالاضافة الى الأمراض الوعائية القلبية والتي تزداد أيضًا خطورتها كلما كان عمر المريض أكبر والمدة الزمنية لمرض السكري أكبر. لهذا علينا علاج هذه الفئة بشكل جدّي وموازنة قيم تركيز الجلوكوز (السكر) في الدم قدر المستطاع.\n" +
                "على العلاج في هذه الفئة من الأشخاص أن يحوي منع لحالات الهبوط الحاد في تركيز السكر في الدم (Hypoglycemia)، او الهبوط الحاد في الدورة الدموية (انخفاض حاد في ضغط الدم hypotension). وكذلك الانتباه الى الحالة الصحية الشاملة للمريض ومجمل الأدوية التي يعالج بها بحيث انه من الممكن أن يعاني المريض بالسكري من أكثر من مرض بالاضافة الى السكري.\n" +
                "نستطيع تقسيم علاج مرض السّكري إلى عدّة أقسام:\n" +
                "1- تغييرات في نمط الحياة\n" +
                "التغذية الصحيّة والملائمة لهذه الفئة من المرضى.\n" +
                "الرياضة البدنيّة الموصّى بها من قبل الأطباء المعالجين والتي تلاءَم لكل مريض بشكل خاص بحسب مجمل الأمراض التي يعاني منها والتي من الممكن أن تؤثر على القيام برياضة بدنيّة بشكل منتظم وسليم كأمراض القلب، والأعاقات الجسدية وغيرها من الأمراض.\n" +
                "تخفيض الوزن وال BMI والذي من شأنه أن يساعد الجسم في التخفيف من مقاومة الانسولين والتي تسبب مرض السّكري.\n" +
                "2- العلاج بواسطة الأدوية المتناولة بشكل فموي\n" +
                "الميتفورمين (Metformin): وهو يعتبر خط علاج أولي خاصة للأشخاص الذين يعانون من السمنة المفرطة. يعمل هذا الدواء بواسطة كبت/منع انتاج الجلوكوز في الكبد مما يؤدّي إلى تخفيض تركيز الجلوكوز في الدّم. من التأثيرات الجانبية المعروفة لهذا الدّواء هو الأنخفاض في الوزن وتأثيرات على الجهاز الهضمي. الأشخاص الذين يعانون من أمراض الفشل الكلوي المزمن من الممكن أن يكون هذا النوع من الدواء غير ملائم لا بل ومضر كذلك.\n" +
                "السولفانيل-أوريا (Sulfonylurea): وهو من الأدوية التي تساعد على افراز الانسولين في الجسم بواسطة تغييرات في الشحنة الكهربائية لغشاء الخلايا التي تفرز الانسولين. من التأثيرات الجانبية المعروفة والشائعة لهذه الأدوية هو كسب الوزن الزائد والهبوط الحاد في تركيز الجلوكوز (السكر) في الدّم (Hypoglycemia). الأشخاص المسنين والمعرّضين لحالات متكررة من الهبوط الحاد في تركيز الجلوكوز (السكر) في الدّم (Hypoglycemia) عليهم توخي الحذر من تناول هذه الأدوية والتي من الممكن أن تكون غير ملائمة لهم.\n" +
                "الثيازوليدينيديونز (thiazolidinediones): هذا النوع من الأدوية يقوم بتحسين مقاومة الإنسولين في الجسم، وكذلك من الممكن أن يحث على افراز الانسولين.\n" +
                "ميجليتينيد (Meglitinides): هذه الأدوية تعمل بصورة مشابه لأدوية السولفانيل-أوريا. من التأثيرات الجانبية المعروفة لهذه الفئة من الأدوية هي كسب الوزن الزائد.\n" +
                "مثبّطات ألفا-جلوكوزيداز (Alpha-glucosidase inhibitors): تعمل هذه الأدوية بواسطة إبطاء امتتصاص السكر في الجهاز الهضمي. من التأثيرات الجانبية المعروفة لهذه الفئة من الأدوية تطبّل البطن (الانتفاخ) والإسهال.\n" +
                "مثبّطات دي بي بي 4 (DPP-IV inhibitors): هذه الأدوية تساعد في عملية تنظيم تركيز الجلوكوز (السكر) في الجسم. بشكل عام هذه الأدوية ليست قويّة وليست ذات فعالية عالية لتخفيض الهيموجلوبين الجلوكوزيلاتي HBA1C بشكل ملحوظ كباقي الأدوية. من الجدير بالذكر ان هذه الأدوية لا تقوم بزيادة الوزن وكذلك ليست ذات خطورة عالية لحدوث هبوط حاد في تركيز الجلوكوز (السكر) في الجسم.\n" +
                "أدوية ال GLP-1: تعمل هذه الأدوية بواسطة دور البيبتيدات في الجهاز الهضمي على توازن تركيز الجلوكوز في الدم ومنها ال GLP-1. من التأثيرات الجانبية المعروفة لهذا الدّواء تخفيض الوزن، التقيّؤ، الغثيان والإسهال.\n" +
                "3- علاج السكري بواسطة الحقن\n" +
                "الانسولين: أصبح العلاج بواسطة الانسولين شائعًا أكثر في الفترة الأخيرة، رغم رفض العديد من المرضى تقبّل العلاج بواسطة حقن بشكل يومي. ينقسم علاج الأنسولين إلى نوعين:\n" +
                "العلاج بواسطة انسولين ذو فعالية طويلة الأمد (يوميّة) (long acting)، وهو عبارة عن حقن يومية توفر للجسم كمية الانسولين الأساسية  (basal). وهو ما يهوّن على المريض قبول العلاج أكثر نظرًا لعدم الحاجة الى الحقن لأكثر من مرّة يوميًّا. من الممكن وصف هذا النوع من العلاج مع أدوية أخرى يتم تناولها بواسطة الفم لموازنة المرض بشكل أكثر نجاعة.\n" +
                "العلاج بواسطة انسولين ذو فعالية قصيرة الأمد (short acting)، وهو الانسولين الذي يؤخذ مباشرة بعد تناول الوجبات اليوميّة وعادة ما يتم ملاءمة كمية الأكل لكمية الأنسولين قصيرة الأمد المتناولة بعده.\n" +
                "البراملينيتيد (Pramlintide): بشكل عام يعطى بواسطة حقن مرافقة للانسولين.\n" +
                "4- مراقبة تركيز الجلوكوز (السكر) في الدم\n" +
                "تعتبر مراقبة تركيز الجلوكوز (السكر) في الدّم خاصة في ساعات الصّباح مهمّة وهي عادة ما تعطينا معلومات حول موازنة المرض لدى اولئك المرضى. كما وأن الأطباء عادة يهتمون بهذه التسجيلات كي يقرروا العلاج المناسب للمرضى والحاجة إلى إضافة أدوية أخرى لموازنة المرض بشكل أفضل. \n" +
                "بالاضافة للعلاج المباشر لتخفيض تركيز الجلوكوز في الدم هنالك علاج لا يقل أهميّة والذي يُعنى بتقليل خطورة الإصابة بالأمراض الوعائية القلبية، والذي يشتمل على:\n" +
                "الحد من التدخين قدر المستطاع. في بعض الأحيان هنالك دورات جماعية منظمة ينصح فيها الأطباء للمساعدة على الإقلاع على التدخين:\n" +
                "علاج فرط ضغط الدم\n" +
                "علاج فرط شحميات الدم\n" +
                "العلاج بواسطة الأسبيرين\n" +
                "كما ذكرنا سابقًا العيش بشكل صحي وسليم من حيث الغذاء والرّياضة.\n" +
                "علاج السكري نوع 1\n" +
                "1- مراقبة وتسجيل قيم تركيز الجلوكوز (السكر في الجسم)\n" +
                "لقد اثبتت البحوثات أهمية مراقبة وتسجيل قيم الجلوكوز في الدم بشكل يومي ولأكثر من مرّة، ومدى مساعدتها في علاج هذه الفئة من المرضى بشكل أفضل، وكذلك لملاءمة جرعة الإنسولين المناسبة. نستطيع مراقبة وتسجيل قيم تركيز الجلوكوز في الجسم بطريقتين:\n" +
                "القياس بواسطة عصا خاصة للأصبع (fingerstick) لقياس تركيز الجلوكوز بواسطة قطرة دم من الأصبع.\n" +
                "أجهزة الكترونية متطورة  تحت الجلد لقياس تركيز الجلوكوز بالجسم بشكل متعاقب وعلى مدار ساعات النهار (بحسب برنامح مبرمج مسبقًا من الجهة المعالجة).\n" +
                "2- حقن الانسولين\n" +
                "ونستطيع أن نقسم العلاج بواسطة الانسولين لهذه الفئة لقسمين:\n" +
                "العلاج بواسطة الأنسولين ذو فعالية طويلة الأمد (يوميّة)، وهو عبارة عن حقن يومي توفر للجسم كمية الانسولين الأساسية  (basal). وهو ما يهوّن على المريض قبول العلاج أكثر نظرًا لعدم الحاجة الى الحقن لأكثر من مرّة يوميًّا. من الممكن وصف هذا النوع من العلاج مع أدوية أخرى تتناول بواسطة الفم لموازنة المرض بشكل ناجع أكثر.\n" +
                "العلاج بواسطة الانسولين ذو فعالية قصيرة الأمد، وهو الانسولين الذي يؤخذ مباشرة بعد تناول الوجبات اليوميّة وعادة ما يتم ملاءمة كمية الأكل وتركيز الجلوكوز في الدم لكمية الأنسولين قصيرة الأمد المتناولة بعده.\n" +
                "علاج السكري الحَملي (Pregnancy diabetes)\n" +
                "بهدف المحافظة على صحة الجنين ومنع حصول مضاعفات خلال الولادة، يجب موازنة مستوى السكر في الدم. فبالإضافة إلى الحرص على التغذية الصحية وممارسة الرياضة، من الممكن أن يشمل علاج السكري، أيضا، متابعة مستوى السكر في الدم، بل واستعمال الإنسولين في بعض الحالات.\n" +
                "يتولى الطاقم الطبي المعالج متابعة مستوى السكر في الدم، بما في ذلك أثناء عملية الولادة. لأنه إذا ما ارتفع مستوى السكر في دم المرأة الحامل، فقد يُفرز جسم الجنين هُرمون الإنسولين بتركيز عالٍ، مما سيؤدي إلى هبوط مستوى السكر في الدم بعد الولادة، مباشرة.\n" +
                "علاج مقدمات السكري (Prediabetes)\n" +
                "يستطيع العديد من المصابين بمقدمات السكري، من خلال المحافظة على نمط حياة صحي، إعادة مستوى السكر في الدم إلى مستواه الطبيعي (السليم) أو على الأقل، منع ارتفاعه إلى مستويات مماثلة لتلك التي يتم تسجيلها لدى مرضى السكري من النوع الثاني. وقد يكون من المفيد، أيضا، الحفاظ على وزن صحي، بواسطة ممارسة الرياضة واتباع نظام غذائي صحي.\n" +
                "قد تشكل الأدوية، بعض الأحيان، بديلا علاجيا مناسبا وناجعا لمرض وعلاج السكري، بالنسبة لأشخاص في إحدى المجموعات المعرضة للخطر. وتشمل هذه: الحالات التي يتفاقم فيها مرض \"مقدمات السكري\"، أو التي يعاني فيها مريض السكري من مرض آخر، سواء كان مرضا قلبيا وعائيا (Cardiovascular disease)، مرض الكبد الدهني (FLD - Fatty liver disease) أو متلازمة المبيض المتعدد الكيسات (Polycystic ovary syndrome).\n" +
                "الأدوية المقصودة هنا هي أدوية علاج السكري يتم تناولها فمويا، مثل: ميتفورمين (Metformin).\n" +
                "في حالات أخرى، ثمة حاجة إلى أدوية لموازنة مستوى الكولسترول في الدم - وخاصة من فئة الستاتينات (Statins) وأدوية لمعالجة فرط ضغط الدم. ومن المحتمل أن يصف الطبيب جرعة منخفضة من الأسبيرين (Aspirin) كإجراء للوقاية من المرض. ومع ذلك، يبقى نمط الحياة الصحي هو مفتاح النجاح.\n" +
                "الوقاية من مرض السكري\n" +
                "لا يمكن منع الإصابة بالسكري من النوع الأول. لكن نمط الحياة الصحي الذي يساهم في معالجة مرحلة وأعراض ما قبل السكري، السكري من النوع الثاني والسكري الحملي يمكن أن يساهم أيضا في الوقاية منها ومنعها.\n" +
                "الحرص على تغذية صحية\n" +
                "زيادة النشاط البدني\n" +
                "التخلص من الوزن الزائد.\n" +
                "يمكن، في بعض الأحيان، استعمال الأدوية. فأدوية علاج السكري التي يتم تناولها فمويا، مثل: ميتفورمين (metformin) وروزيجليتزون (rosiglitazone) يمكن أن تقلل من خطر الإصابة بالسكري من النوع الثاني. ولكن، يبقى الحفاظ على نمط حياة صحي على درجة عالية جدا من الأهمية.\n" +
                "شارك\n" +
                "غرد";
    }

    public static String[] getQueryKeyPhrases(String queryText){
        return new String[]{"مرض", "السكري", "مرض السكري"};
    }

    public static boolean hasKeyPhrases(String sentence, String [] KeyPhrases){
        return Arrays.stream(KeyPhrases).parallel().anyMatch(sentence::contains);
    }

}
