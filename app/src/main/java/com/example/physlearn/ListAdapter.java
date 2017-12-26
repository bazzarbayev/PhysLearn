package com.example.physlearn;


        import android.app.Activity;
        import android.content.Context;
        import android.content.Intent;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;

public class ListAdapter extends BaseAdapter{
    ArrayList result;
    Context context;
    ArrayList imageId;
    private static LayoutInflater inflater=null;
    public ListAdapter(Activity mainActivity, ArrayList prgmNameList, ArrayList prgmImages) {
        // TODO Auto-generated constructor stub
        result=prgmNameList;
        context=mainActivity;
        imageId=prgmImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View rowView;
        rowView = inflater.inflate(R.layout.list_item, null);
        final TextView text =(TextView) rowView.findViewById(R.id.text_item);
        TextView time =(TextView) rowView.findViewById(R.id.time_item);
        text.setText(result.get(position).toString());
        time.setText(imageId.get(position).toString());
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub



                ////////////////////////////////////////// M O D U L E 1 ///////////////////////////////////////////////

                if(text.getText().toString().equals("I. СТРУКТУРНЫЕ МОДЕЛИ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%9E%D0%94%D0%95%D0%9B%D0%98%20%D0%98%20%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%2Filovepdf_com-5-20.pdf?alt=media&token=9f5a8ff9-42b4-4d8a-9171-52bd88fd35fd");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("II. МАТЕМАТИЧЕСКИЕ МОДЕЛИ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%9E%D0%94%D0%95%D0%9B%D0%98%20%D0%98%20%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%2Filovepdf_com-22-37.pdf?alt=media&token=1095c5ec-a0a4-4801-b2e8-79ae4af54ef9");
                    context.startActivity(intent);
                }


                if(text.getText().toString().equals("III. СТАТИСТИЧЕСКИЙ АНАЛИЗ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%9E%D0%94%D0%95%D0%9B%D0%98%20%D0%98%20%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%2Filovepdf_com-41-52.pdf?alt=media&token=a5875e5d-b23b-4cc7-b926-505ff6a90611");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("IV. СИНТЕЗ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%9E%D0%94%D0%95%D0%9B%D0%98%20%D0%98%20%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%2Filovepdf_com-58-68.pdf?alt=media&token=cb23ab0e-3721-4e20-974c-d419fa2aca46");
                    context.startActivity(intent);
                }

                ////////////////////////////////////////// M O D U L E 2 ///////////////////////////////////////////////

                if(text.getText().toString().equals("І. АҚПАРАТ ТЕОРИЯСЫНЫҢ НЕГІЗГІ ТҮСІНІКТЕРІ МЕН МІНДЕТТЕРІ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%90%D2%9A%D0%9F%D0%90%D0%A0%D0%90%D0%A2%20%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%D0%A1%D0%AB%2Filovepdf_com-5-14.pdf?alt=media&token=35799158-da26-4b03-b537-458794cc56bf");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("II. АҚПАРАТТЫ ӨЛШЕУ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%90%D2%9A%D0%9F%D0%90%D0%A0%D0%90%D0%A2%20%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%D0%A1%D0%AB%2Filovepdf_com-15-56.pdf?alt=media&token=2205522a-7f03-48a8-af1f-bf34b79b5276");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("III. СИГНАЛДАРДЫҢ МАТЕМАТИКАЛЫҚ МОДЕЛЬДЕРІ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%90%D2%9A%D0%9F%D0%90%D0%A0%D0%90%D0%A2%20%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%D0%A1%D0%AB%2Filovepdf_com-57-95.pdf?alt=media&token=c5cbd9a3-02a9-4254-bb03-b3a9ede5f481");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("IV. АҚПАРАТТЫ КВАНТТАУ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%90%D2%9A%D0%9F%D0%90%D0%A0%D0%90%D0%A2%20%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%D0%A1%D0%AB%2Filovepdf_com-96-127.pdf?alt=media&token=ff547a99-30b3-421b-afe7-fa3b2ef2afca");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("V. БАЙЛАНЫС КАНАЛДАРЫ МЕН ЖҮЙЕЛЕРІ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%90%D2%9A%D0%9F%D0%90%D0%A0%D0%90%D0%A2%20%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%D0%A1%D0%AB%2Filovepdf_com-128-156.pdf?alt=media&token=0c65533d-540d-451b-8ab3-981ad492483b");
                    context.startActivity(intent);
                }

                ////////////////////////////////////////// M O D U L E 3 ///////////////////////////////////////////////

                if(text.getText().toString().equals("I. ОСНОВНЫЕ ПОЛОЖЕНИЯ ТЕОРИИ ИНФОРМАЦИИ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%20%D0%98%D0%9D%D0%A4%D0%9E%D0%A0%D0%9C%D0%90%D0%A6%D0%98%D0%98%2Filovepdf_com-5-13.pdf?alt=media&token=03c5396d-8f28-4163-8e13-fd6a9d54fafc");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("II. ИЗМЕРЕНИЕ ИНФОРМАЦИИ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%20%D0%98%D0%9D%D0%A4%D0%9E%D0%A0%D0%9C%D0%90%D0%A6%D0%98%D0%98%2Filovepdf_com-15-48.pdf?alt=media&token=215c5aa4-64d5-431e-b2c9-6259f30502dc");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("III. МАТЕМАТИЧЕСКИЕ МОДЕЛИ СИГНАЛОВ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%20%D0%98%D0%9D%D0%A4%D0%9E%D0%A0%D0%9C%D0%90%D0%A6%D0%98%D0%98%2Filovepdf_com-50-84.pdf?alt=media&token=1f57322a-d2b9-44b8-935a-7be67b1e8dd1");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("IV. КВАНТОВАНИЕ ИНФОРМАЦИИ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%20%D0%98%D0%9D%D0%A4%D0%9E%D0%A0%D0%9C%D0%90%D0%A6%D0%98%D0%98%2Filovepdf_com-86-114.pdf?alt=media&token=993433f5-dbea-4e03-abd5-c9bb1cf58466");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("V. КАНАЛЫ И СИСТЕМЫ СВЯЗИ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%A2%D0%95%D0%9E%D0%A0%D0%98%D0%AF%20%D0%98%D0%9D%D0%A4%D0%9E%D0%A0%D0%9C%D0%90%D0%A6%D0%98%D0%98%2Filovepdf_com-116-133.pdf?alt=media&token=6bb1447e-905d-4036-93db-cd89ccd6bdaa");
                    context.startActivity(intent);
                }

                ////////////////////////////////////////// M O D U L E 4 ///////////////////////////////////////////////

                if(text.getText().toString().equals("I. БЕЙСЫЗЫҚТЫ ДИНАМИКАЛЫҚ ЖҮЙЕЛЕРІН ҚҰРУ ПРИНЦИПТАРЫ ЖӘНЕ МАТЕМАТИКАЛЫҚ ЖАЗЫЛУЫ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%91%D0%95%D0%99%D0%A1%D0%AB%D0%97%D0%AB%D2%9A%D0%A2%D0%AB%20%D0%94%D0%98%D0%9D%D0%90%D0%9C%D0%98%D0%9A%D0%90%D0%9B%D0%AB%D2%9A%20%D0%96%D2%AE%D0%99%D0%95%D0%9B%D0%95%D0%A0%D0%94%D0%86%D2%A2%2Filovepdf_com-4-17.pdf?alt=media&token=3da4ffe9-b713-4af2-8a0d-5ec6f2ecf3d1");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("II. БЕЙСЫЗЫҚТЫ ДИНАМИКАЛЫҚ ЖҮЙЕЛЕРДІҢ ВОЛЬТЕРЛЫҚ МОДЕЛЬДЕРІ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%91%D0%95%D0%99%D0%A1%D0%AB%D0%97%D0%AB%D2%9A%D0%A2%D0%AB%20%D0%94%D0%98%D0%9D%D0%90%D0%9C%D0%98%D0%9A%D0%90%D0%9B%D0%AB%D2%9A%20%D0%96%D2%AE%D0%99%D0%95%D0%9B%D0%95%D0%A0%D0%94%D0%86%D2%A2%2Filovepdf_com-20-35.pdf?alt=media&token=8d1888e3-d7f2-48ba-a674-a3de22e3e6bf");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("III. БЕЙСЫЗЫҚТЫ ДИНАМИКАЛЫҚ ЖҮЙЕЛЕРІНІҢ СТАТИСТИКАЛЫҚ ТАЛДАУЫ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%91%D0%95%D0%99%D0%A1%D0%AB%D0%97%D0%AB%D2%9A%D0%A2%D0%AB%20%D0%94%D0%98%D0%9D%D0%90%D0%9C%D0%98%D0%9A%D0%90%D0%9B%D0%AB%D2%9A%20%D0%96%D2%AE%D0%99%D0%95%D0%9B%D0%95%D0%A0%D0%94%D0%86%D2%A2%2Filovepdf_com-41-53.pdf?alt=media&token=ea55be91-440f-4f7a-82c1-ba5ede320c72");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("IV. БЕЙСЫЗЫҚТЫ ДИНАМИКАЛЫҚ ЖҮЙЕЛЕРДІҢ СИНТЕЗІ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%91%D0%95%D0%99%D0%A1%D0%AB%D0%97%D0%AB%D2%9A%D0%A2%D0%AB%20%D0%94%D0%98%D0%9D%D0%90%D0%9C%D0%98%D0%9A%D0%90%D0%9B%D0%AB%D2%9A%20%D0%96%D2%AE%D0%99%D0%95%D0%9B%D0%95%D0%A0%D0%94%D0%86%D2%A2%2Filovepdf_com-61-70.pdf?alt=media&token=1cdd96f4-9753-49a4-9938-6d6fc2eefb31");
                    context.startActivity(intent);
                }

                ////////////////////////////////////////// M O D U L E 5 ///////////////////////////////////////////////

                if(text.getText().toString().equals("I. МЕТОДЫ ИССЛЕДОВАНИЯ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%20%D0%A1%D0%A2%D0%90%D0%A2%D0%98%D0%A1%D0%A2%D0%98%D0%A7%D0%95%D0%A1%D0%9A%D0%98%D0%A5%20%D0%98%D0%A1%D0%A1%D0%9B%D0%95%D0%94%D0%9E%D0%92%D0%90%D0%9D%D0%98%D0%99%2Filovepdf_com-5-20.pdf?alt=media&token=a22a3ed2-f62a-4b9c-a61d-d072db33caa4");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("II. МАТЕМАТИЧЕСКИЕ МОДЕЛИ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ С ЗАПАЗДЫВАНИЕМ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%20%D0%A1%D0%A2%D0%90%D0%A2%D0%98%D0%A1%D0%A2%D0%98%D0%A7%D0%95%D0%A1%D0%9A%D0%98%D0%A5%20%D0%98%D0%A1%D0%A1%D0%9B%D0%95%D0%94%D0%9E%D0%92%D0%90%D0%9D%D0%98%D0%99%2Filovepdf_com-25-57.pdf?alt=media&token=770438a6-5536-45c1-acb9-0110702f6aff");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("III. СТАТИСТИЧЕСКИЙ АНАЛИЗ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ С ЗАПАЗДЫВАНИЕМ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%20%D0%A1%D0%A2%D0%90%D0%A2%D0%98%D0%A1%D0%A2%D0%98%D0%A7%D0%95%D0%A1%D0%9A%D0%98%D0%A5%20%D0%98%D0%A1%D0%A1%D0%9B%D0%95%D0%94%D0%9E%D0%92%D0%90%D0%9D%D0%98%D0%99%2Filovepdf_com-62-73.pdf?alt=media&token=fa446752-0467-4845-95ea-52248ad3a6e8");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("IV. СИНТЕЗ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ С ЗАПАЗДЫВАНИЕМ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%20%D0%A1%D0%A2%D0%90%D0%A2%D0%98%D0%A1%D0%A2%D0%98%D0%A7%D0%95%D0%A1%D0%9A%D0%98%D0%A5%20%D0%98%D0%A1%D0%A1%D0%9B%D0%95%D0%94%D0%9E%D0%92%D0%90%D0%9D%D0%98%D0%99%2Filovepdf_com-80-91.pdf?alt=media&token=01644316-82d9-4fd9-b11c-70b432deb97a");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("V. СТАТИСТИЧЕСКИЙ АНАЛИЗ И СИНТЕЗ ЦИФРОВЫХ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ С ЗАПАЗДЫВАНИЕМ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%20%D0%A1%D0%A2%D0%90%D0%A2%D0%98%D0%A1%D0%A2%D0%98%D0%A7%D0%95%D0%A1%D0%9A%D0%98%D0%A5%20%D0%98%D0%A1%D0%A1%D0%9B%D0%95%D0%94%D0%9E%D0%92%D0%90%D0%9D%D0%98%D0%99%2Filovepdf_com-94-116.pdf?alt=media&token=f86c32df-bd17-4d27-a3ed-56963b0c8e0f");
                    context.startActivity(intent);
                }

                if(text.getText().toString().equals("VI. ДИАЛОГОВАЯ СИСТЕМА ИССЛЕДОВАНИЯ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ С ЗАПАЗДЫВАНИЕМ")){
                    Intent intent = new Intent(context, SubModule1.class);
                    intent.putExtra("message", "https://firebasestorage.googleapis.com/v0/b/idphyslearn.appspot.com/o/%D0%9C%D0%95%D0%A2%D0%9E%D0%94%D0%AB%20%D0%A1%D0%A2%D0%90%D0%A2%D0%98%D0%A1%D0%A2%D0%98%D0%A7%D0%95%D0%A1%D0%9A%D0%98%D0%A5%20%D0%98%D0%A1%D0%A1%D0%9B%D0%95%D0%94%D0%9E%D0%92%D0%90%D0%9D%D0%98%D0%99%2Filovepdf_com-118-129.pdf?alt=media&token=8312c76d-35b7-4e4c-a0d8-927ae25971ff");
                    context.startActivity(intent);
                }

            }
        });
        return rowView;
    }

}
