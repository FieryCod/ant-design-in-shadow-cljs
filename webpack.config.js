const path = require('path');

module.exports = {
    devtool: 'eval',
    entry: './public/js/index.js',
    mode: 'development',
    output: {
        path: __dirname + '/public/js',
        filename: "libs.js"
    },
    devServer: {
        stats: 'errors-only',
        contentBase: path.resolve(__dirname, '/public/js'),
        publicPath: '/'
    },
    plugins: [
    ],
    module: {
        rules: [{
            test: /\.less$/,
            use: [
                {
                    loader: 'style-loader',
                },
                {
                    loader: 'css-loader', // translates CSS into CommonJS
                },
                {
                    loader: 'less-loader', // compiles Less to CSS
                    options: {
                        modifyVars: {
                            javascriptEnabled: true,
                        }
                    }
                }
            ]
        }]
    }
};
